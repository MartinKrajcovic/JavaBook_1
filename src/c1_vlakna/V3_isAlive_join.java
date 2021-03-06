package c1_vlakna;
/*
 * V triede V2_vytvorenieViacerychVlakien sme dostatocne dlhym pozastavenim
 * hlavneho vlakna zabezpecili to, aby dcerske vlakna tejto triedy ukoncili
 * svoj beh este pred dobehnutim hlavneho vlakna.
 * Hlavne vlakno moze dobehnut aj skor ako ostatne vlakna, preto je toto 
 * riesenie neuspokojive.
 * 
 * Existuju dva sposoby, ktorymi mozeme zistit, ci beh daneho vlakna skoncil.
 * Napriklad, mozeme zavolat metodu isAlive() daneho vlakna. Tato metoda je
 * definovana triedou Thread a vracia hodnotu true pokial dane vlakno stale
 * bezi. V opacnom pripade vrati false. Tato metoda je vsak iba prilezitostne
 * uzitocna.
 * Praktickejsia metoda, ktora sa vyuziva na zaistenie cakania hlavneho vlakna
 * na dobu, kym dcerske vlakno ukonci svoj beh je metoda join().
 * Ako evokuje jej nazov, hlavne vlakno caka, kym sa k nemu dcerske vlakno pripoji.
 */
public class V3_isAlive_join implements Runnable {
	private String name;
	Thread t;	
	
	V3_isAlive_join(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Bolo vytvorene vlakno: " + t);
		t.start();
	}
	
	@Override
	public void run() {			//toto je vstupny bod noveho vlakna
		try {
			for (int i=5; i>0; i--) {
				System.out.println("Vlakno "+ name + ": " + i);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.err.println("Vlakno " + name + " bolo prerusene..");	
		}
		System.out.println("Beh vlakna " + name + " bol ukonceny.");
	}

	public static void main(String[] args) {
		V3_isAlive_join v1 = new V3_isAlive_join("Jeden");
		V3_isAlive_join v2 = new V3_isAlive_join("Dva");
		V3_isAlive_join v3 = new V3_isAlive_join("Tri");
		
		/*
		 * Poznamka:
		 * Pokial by sme vytvorili getter (verejnu funkciu), ktora by nam davala
		 * meno vlakna alebo volala metodu vlakna isAlive(), nemuseli by sme sa
		 * musiet odkazovat na premennu instancie vlakna, ktora je deklarovana
		 * s defaultnym modifikatorom pristupu (t).
		 */
		System.out.println("Vlakno " + v1.t.getName() + " bezi: " + v1.t.isAlive());
		System.out.println("Vlakno " + v2.t.getName() + " bezi: " + v2.t.isAlive());
		System.out.println("Vlakno " + v3.t.getName() + " bezi: " + v3.t.isAlive());
		
		//cakanie na dobeh vlakien a spojenie sa s hlavnym vlaknom
		try {
			System.out.println("Cakanie na dobeh vlakien...");
			v1.t.join();
			v2.t.join();
			v3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Vlakno " + v1.t.getName() + " bezi: " + v1.t.isAlive());
		System.out.println("Vlakno " + v2.t.getName() + " bezi: " + v2.t.isAlive());
		System.out.println("Vlakno " + v3.t.getName() + " bezi: " + v3.t.isAlive());
		System.out.println("Beh hlavneho vlakna bol ukonceny.");
	}
	/*
	 * Ako je vidiet vo vystupe programu, ziadne vlakno po ukonceni
	 * (pripojeni k hlavnemu vlaknu) nebezi.
	 */
}
