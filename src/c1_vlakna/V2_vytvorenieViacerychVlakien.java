package c1_vlakna;
/*
 * Pokial nebudeme prekryvat ziadne ine metody triedy Thread, pravdepodobne
 * najlepsim riesenim bude jednoducho implementovat rozhranie Runnable.
 * Vo svojich programoch mozeme vytvarat tolko vlakien, kolko potrebujeme.
 */
public class V2_vytvorenieViacerychVlakien implements Runnable {
	String name;	//nazov vlakna
	Thread t;
	
	V2_vytvorenieViacerychVlakien(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Nove vlakno: " + t);
		t.start();	//spustenie vlakna
	}
	
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println("Beh vlakna " + name + " preruseny..");
		}
		System.out.println("Beh vlakna " + name + " skoncil.");
	}
	
	public static void main(String[] args) {
		V2_vytvorenieViacerychVlakien v1 = new V2_vytvorenieViacerychVlakien("Prve");
		V2_vytvorenieViacerychVlakien v2 = new V2_vytvorenieViacerychVlakien("Druhe");
		V2_vytvorenieViacerychVlakien v3 = new V2_vytvorenieViacerychVlakien("Tretie");
		
		/*
		 * Nezabudnime, ze k premennej t, cize odkazu na instanciu typu Thread
		 * mozeme volne pristupovat, kedze ma defaultny modifikator pristupu.
		 * Vdaka tomu, mozeme pristupovat aj k metodam tohto objektu, cize k
		 * metodam samotneho vlakna. Pokial by sme premennu t zmenili na private,
		 * tak by sme museli specifikovat ake data by bolo mozne ziskat cez verejne
		 * metody triedy. Pripadne, ak nam ide iba o meno vlakna, kludne mozeme aj
		 * prepisat metodu toString() zdedenu od triedy Object.
		 */
		System.err.println("Nazov vlakna objektu v1: " + v1.t.getName());
		System.err.println("Nazov vlakna objektu v2: " + v2.t.getName());
		System.err.println("Nazov vlakna objektu v3: " + v3.t.getName());
		
		try {
			Thread.sleep(10000);	//pozastavenie hlavneho vlakna na 10sek
		} catch (InterruptedException e) {
			System.err.println("Beh hlavneho vlakna preruseny..");
		}
		System.out.println("Beh hlavneho vlakna skoncil.");
	}
	
	/*
	 * Ako je vidiet na vystupe, vsetky tri vlakna potomkov po svojom
	 * spusteni zdielaju procesorovy cas. Vsimnime si volanie sleep(10000)
	 * v metode main().
	 * Toto volanie sposobi pozastavenie behu hlavneho vlakna na dobu 10sek
	 * cim sa zaisti to, ze beh hlavneho vlakna bude ukonceny ako posledny.
	 */
}
