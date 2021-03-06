package c1_vlakna;
/**
 * Tato trieda demonstruje vytvorenie vlakna pomocou rozsirenia
 * triedy Thread, ktora uz implementuje rozranie Runnable.
 * Toto znamena, ze rozsirenim dedime aj implementaciu metody run(),
 * ktora v triede Thread nema definovane spravanie, takze ju musime
 * prepisat.
 * Pozor, netreba deklarovat premennu typu Thread, nakolko instanciu
 * tejto triedy vytvarame automaticky v konstruktore, ktory vola
 * pomocou super() konstruktor nadtriedy, cim je trieda Thread.
 */
public class V1_vytvorenieVlakna2 extends Thread {
	
	public V1_vytvorenieVlakna2(String threadName) {
		super(threadName);	//konstruktor triedy Thread definujuci nazov vlakna
		start();	//mozeme sa na tuto zdedenu metodu odkazovat priamo
					//alebo aj this.start() je spravne
	}
	/**
	 * Tato metoda je uz implementovana triedou Thread.
	 * My ju potrebujeme prepisat, inak by vlakno nic
	 * nerobilo.
	 */
	@Override
	public void run() {
		try {
			for (int i=5; i>0; i--) {
				System.out.println("Vlakno potomka: " + i);
				Thread.sleep(500);	//pozastavenie vlakna na pol sekundy
			}
		} catch (InterruptedException e) {
			/*
			 * Metoda getName() vracia nazov vlakna, ktory sme mu predali
			 * do konstruktora pri vytvarani objektu. Tato metoda je tiez
			 * zdedena od triedy Thread a je mozne ju volat priamo.
			 */
			System.err.println("Vlakno " + getName() + "bolo prerusene..");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Vytvorenie objektov tejto triedy automaticky spusta nove,
		 * samostatne vlakno, ktore zacne vykonavat svoju metodu run().
		 */
		V1_vytvorenieVlakna2 vlakno1 = new V1_vytvorenieVlakna2("VKN 1");
		V1_vytvorenieVlakna2 vlakno2 = new V1_vytvorenieVlakna2("VKN 2");
		
		/*
		 * Ako je vidiet nizsie, na rozdiel od objektov vlakna vytvorenych
		 * implementaciou rozhrania Runnable je teraz mozne priame volanie
		 * funkcii ako je napr. getName() vlakna, kedze nasa trieda vsetky
		 * tieto metody automaticky dedi od triedy Thread.
		 */
		System.err.println("Nazov vlakna vlakno1: " + vlakno1.getName());
		System.err.println("Nazov vlakna vlakno2: " + vlakno2.getName());
		
		//CYKLUS HLAVNEHO VLAKNA:
		try {
			for (int i=5; i>0; i--) {
				System.out.println("Hlavne vlakno: " + i);
				Thread.sleep(650);	//pozastavenie hlavneho vlakna na 6.5sek
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());	//ziskanie spravy vynimky
		}
		System.out.println("Hlavne vlakno ukoncilo svoj beh.");
	}
}
