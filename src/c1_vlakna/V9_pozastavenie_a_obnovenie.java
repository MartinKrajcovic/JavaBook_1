package c1_vlakna;
/*
 * Nasledujuci program ilustruje sposob, ako mozeme vyuzit metody wait() a
 * notify() zdedenych od triedy Object, k riadeniu behu vlakna.
 * Sucastou triedy T je premenna suspendFlag, ktora je typu boolean.
 * Tato premenna sa pouziva k riadeniu behu vlakna. Konstruktor triedy
 * tuto premennu inicializuje na hodnotu false.
 * Metoda run() potom obsahuje blok prikazov synchronized kontrolujucich
 * premennu suspendFlag. Ak je hodnota true, je zavolana metoda wait(),
 * ktora sluzi k pozastaveniu behu vlakna.
 * Metoda suspendThread() priradzuje premennej hodnotu true. Naopak metoda
 * resumeThread() priradzuje tejto premennej hodnotu false a dalej vola
 * metodu notify(), cim obnovuje beh vlakna.
 * Metoda main() potom vola metody suspendThread() a resumeThread().
 * 
 * Upozornenie:
 * Kazda z metod wait(), notify(), notifyAll() su zdedene od triedy Object
 * a deklarovane ako final.
 * Kazdopadne, najdolezitejsou informaciou je to, ze kazda z tychto metod
 * by mala byt volana iba zo synchronizovaneho kontextu t.j. bud zo 
 * synchronizovanej metody alebo synchronizovaneho prikazu.
 * 
 * Poznamka:
 * Metoda wait() vyhadzuje vynimku InterruptedException, keby sa pokusilo
 * nejake ine vlakno prerusit chod tohto cakajuceho vlakna.
 */
class T implements Runnable {
	
	String name;
	Thread thread;
	boolean suspendFlag;
	
	public T(String threadName) {
		name = threadName;
		thread = new Thread(this, name);
		suspendFlag = false;	//suspendacia nastavena na false
		thread.start();
	}
	@Override
	public void run() {
		try {
			for (int i = 15; i > 0; i--) {
				Thread.sleep(200);
				System.out.println(name + ": " + i);
				synchronized(this) {
					while(suspendFlag) {	//ak je suspendovane, caka sa, ak nie cyklus bezi dalej.
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Vlakno " + name + " bolo prerusene.");
		}
		System.out.println("Beh vlakna " + name + " bol ukonceny.");
	}
	
	synchronized void suspendThread() {	//tato metoda nemusi byt synchronizovana, pouvazuj preco..
		suspendFlag = true;
	}
	
	synchronized void resumeTread() {
		suspendFlag = false;	//nastavenie suspendacie na false, cize moze bezat
		notify();	//notify() upozornuje pozastavene vlakno, ze moze pokracovat v behu
	}
}

public class V9_pozastavenie_a_obnovenie {
	public static void main(String[] args) {
		T V1 = new T("V1");
		T V2 = new T("V2");
		
		try {
			Thread.sleep(1000);
			V1.suspendThread();
			System.out.println("Vlakno V1 bolo pozastavene.");
			
			Thread.sleep(1000);
			V1.resumeTread();
			System.out.println("Vlakno V1 pokracuje v cinnosti");
			
			V2.suspendThread();
			System.out.println("Vlakno V2 bolo pozastavene.");
			Thread.sleep(1000);
			V2.resumeTread();
			System.out.println("Vlakno V2 pokracuje v cinnosti");
			
		} catch (InterruptedException e) {
			System.out.println("Vlakno bolo prerusene.");
		}
		
		try { 
			V1.thread.join();
			V2.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hlavne vlakno bolo ukoncene.");
	}	
}
