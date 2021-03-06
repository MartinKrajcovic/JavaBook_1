package c1_vlakna;
/**
 * Tato trieda demonstruje vytvorenie a spustenie vlastneho vlakna,
 * pricom vytvorenie vlakna je vykonane implementovanim metody run()
 * deklarovanej rozhranim Runnable.
 * @see c1_vlakna.V1_vytvorenieVlakna2 pre ukazku vytvorenia vlakna
 * pomocou rozsirenia triedy Thread, ktora zapuzdruje samotne vlakno.
 */
public class V1_vytvorenieVlakna implements Runnable {
	Thread t;	//deklaracia objektu typu Thread
	
	V1_vytvorenieVlakna() {
		/*
		 * Po vytvoreni triedy implementujucej rozhranie Runnable
		 * musime z danej triedy vytvorit instanciu typu Thread
		 * a predat jej odkaz na objekt implementujuci rozhranie
		 * Runnable (this), pripadne aj nazov vlakna pomocou
		 * konstruktora: Thread(Runnable objekt, String nazov).
		 * 
		 * Pokial chceme vlakno spustit, musime explicitne zavolat
		 * metodu start(), ktora zavola nami definovanu metodu run().
		 */
		t = new Thread(this);//vytvorenie instancie typu Thread
		System.out.println("Bolo vytvorene vlakno " + t.getName());
		t.start();			//explicitne spustenie vlakna
	}
	
	/*
	 * Pokial chceme v nasom kode implementovat rozhranie Runnable
	 * musi nasa trieda implementovat/prepisovat jedinu, abstraktnu
	 * metodu s nazvom run().
	 * Tato metoda moze robit vsetko, co moze robit aj hlavne vlakno.
	 * Tato metoda vytvara vstupny bod pre dalsie sucasne beziace
	 * vlakno tvoriace sucast naseho programu.
	 * Beh tohto vlakna bude ukonceny vo chvili, ked dojde k navratu
	 * z metody run().
	 */
	@Override
	public void run() {		//definicia metody run
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Vlakno potomka: " + i);
				Thread.sleep(500);	//pozastavenie vlakna na 500ms
				/*
				 * Poznamka:
				 * Volanie Thread.sleep(ms), sposobuje pozastavenie chodu
				 * akehokolvek vlakna, v ktorom je tato staticka metoda volana.
				 */
			}
		} catch (InterruptedException e) {
			System.err.println("Vlakno potomka bolo prerusene..");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Po vytvoreni instancie tejto triedy, sa spusta nami vytvorene
		 * vlakno, ktore spusta cyklus v tele metody run(), onedlho sa 
		 * program dostane k cyklu for v hlavnom vlakne a tak vlakna
		 * bezia naraz a zdielaju procesorovy cas.
		 */
		
		//vytvorenie objektu triedy, co pri skonstruovani vytvara a nastartuje nove vlakno
		V1_vytvorenieVlakna v1 = new V1_vytvorenieVlakna();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Hlavne vlakno: " + i);
				Thread.sleep(650);	//pozastavenie HLAVNEHO vlakna na 650ms (6.5sek)
			}
		} catch (InterruptedException e) {
			System.err.println("Hlavne vlakno bolo prerusene..");
		}
		System.out.println("Hlavne vlakno ukoncilo svoj beh.");
	}
}
