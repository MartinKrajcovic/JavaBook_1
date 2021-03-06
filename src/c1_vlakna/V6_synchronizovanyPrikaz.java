package c1_vlakna;

class Target {
	/*
	 * Tento krat si predstavme, ze metoda call je definovana
	 * dodavatelom triedy Target. Znamena to, ze je chranena
	 * voci prepisu a tak nemozeme niako upravit metodu call()
	 * aby bola synchronizovana.
	 * 
	 * Avsak je tu riesenie a tym je druhy sposob zabezpecenia
	 * synchronizacie, t.j. nie synchronizovanou metodou ale
	 * synchronizovanym prikazom.
	 */
	public void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

public class V6_synchronizovanyPrikaz implements Runnable {
	String name, message;
	Thread thread;
	Target t;	//odkaz na objekt typu Target, ktoreho metodu chceme pouzit
				//vo viacvlaknovom prostredi
	
	V6_synchronizovanyPrikaz(String threadName, Target t, String msg) {
		this.t = t;
		name = threadName;
		message = msg;
		thread = new Thread(this, name);
		thread.start();
	}
	/*
	 * Synchronizovany blok zaistuje to, ze volanie metody, ktora
	 * je clenom objektu, bude mozne az vo chvili ked sa aktualnemu
	 * vlaknu podari uspesne vstupit do monitoru objektu.
	 */
	@Override
	public void run() {
		/*
		 * Synchronizovany prikaz prebera ako argument kontext.
		 * Resp objekt, ktory vlastni metodu, ktoru potrebujeme
		 * volat v synchronizovanom kontexte.
		 * Takto mozeme pristupovat k metode viacerymi vlaknami
		 * synchronizovane aj napriek tomu, ze dodavatel svoju
		 * metodu call() zamedzil voci upravam. 
		 */
		synchronized (t) {		//synchronizacia volania metody call()
			t.call(message);
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Target trg = new Target();	//objekt, ktory vlastni metodu call() a ktoreho odkaz dostane kazde vlakno
		V6_synchronizovanyPrikaz sp1 = new V6_synchronizovanyPrikaz("sp1",trg,"Sprava1");
		V6_synchronizovanyPrikaz sp2 = new V6_synchronizovanyPrikaz("sp2",trg,"Sprava2");
		V6_synchronizovanyPrikaz sp3 = new V6_synchronizovanyPrikaz("sp3",trg,"Sprava3");
		V6_synchronizovanyPrikaz sp4 = new V6_synchronizovanyPrikaz("sp4",trg,"Sprava4");
		
		try {
			sp1.thread.join();
			sp2.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Beh hlavneho vlakna skoncil.");
	}
}
