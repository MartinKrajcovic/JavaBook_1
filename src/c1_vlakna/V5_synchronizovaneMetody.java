package c1_vlakna;

/*
 * SYNCHRONIZACIA:
 * Pokial dve alebo viacej vlakien pristupuje k nejakemu zdielanemu
 * prostriedku, musia mat k dispozicii nejaky sposob zaistenia, ze
 * dany prostriedok je v danom okamihu vyuzivany len jednym z tychto
 * vlakien. Proces, ktorym sa tento stav docieli sa nazyva synchronizacia.
 * 
 * Klucom synchronizacie je koncept monitoru. Monitorom sa mieni objekt,
 * ktory je vuzivany ako vzajomne exkluzivny zamok. Len jedno vlakno
 * moze v danom casovom okamihu vlastnit monitor. Vsetky ostatne vlakna
 * pokusajuce sa o vstup do monitora budu pozastavene do doby, kym prve
 * vlakno neopusti monitor.
 * 
 * Svoj kod mozeme synchronizovat jednym z dvoch moznych sposobov.
 * Sucastou oboch je pouzitie klucoveho slova synchronized.
 */
class C {
	/**
	 * Prvym sposobom ako docielit synchronizacie je pouzitie
	 * synchronizovanej metody. Tato trieda nefunguje ako vlakno,
	 * no obsahuje metodu, ktora sa bude volat roznymi vlaknami.
	 * 
	 * Aby sme zabezpecili to, ze tato metoda bude volana bezpecnym
	 * sposobom vo viacvlaknovom prostredi, musime pridat pred jej
	 * navratovy typ klucove slovo synchronized.
	 * Tym zabezpecime, ze tato metoda bude aj napriek pozastaveniu,
	 * ktore nastava v jej tele vykonavana len jednym vlaknom.
	 * Ked to vlakno dokonci vykonavanie tejto metody, tak dalsie
	 * vlakno sa jej ujme a ked opusti tuto metodu aj to, tak ho
	 * moze pouzit dalsie vlakno, nie vsak naraz ako je to v pipade
	 * absencie klucoveho slova synchronized.
	 * 
	 * Ako je vidiet, v tom pripade bude vystup celkom rozhadzany.
	 */
	 void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

public class V5_synchronizovaneMetody implements Runnable {
	String name;
	String message;
	Thread t;
	C c;	//je odkaz na objekt, ktoreho metodu bude nase vlakno volat
	
	V5_synchronizovaneMetody(C c, String n, String m) {
		this.name = n;
		this.message = m;
		this.c = c;
		t = new Thread(this, name);
		t.start();
	}
	
	@Override
	public void run() {
		c.call(message);	//nase vlakno vola metodu call() instancie triedy C
	}
	
	
	public static void main(String[] args) {
		C methodOwner = new C();	//jediny objekt typu C, ktoreho metodu budu volat 3 rozdielne vlakna
		V5_synchronizovaneMetody v1 = new V5_synchronizovaneMetody(methodOwner,"Prve", "Sprava 1");
		V5_synchronizovaneMetody v2 = new V5_synchronizovaneMetody(methodOwner,"Druhe", "Sprava 2");
		V5_synchronizovaneMetody v3 = new V5_synchronizovaneMetody(methodOwner,"Tretie", "Sprava 3");
		
		try {
			v1.t.join();
			v2.t.join();
			v3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hlavne vlakno dobehlo do konca.");
	}	
	/*
	 * Volanim metody sleep() v metode call() umoznujeme prepnutie riadenia do
	 * ineho vlakna. Vysledkom je pomiesany vystup troch zadanych retazcov.
	 * V tomto programe totiz neexistuje nic, co by vsetkym trom vlaknam zabranovalo
	 * volat metodu call() naraz v tom istom okamziku. Ide o 'race condition', kde
	 * vlakna sutazia o to, kto dokonci metodu call() ako prvy.
	 * 
	 * Ak chceme opravit tento program, musime serializovat pristup k metode call().
	 * To znamena, ze musime upravit tuto metodu tak, aby k nej v kazdom okamihu
	 * mohlo pristupovat vzdy iba jedno vlakno.
	 * 
	 * Staci pridat pred navratovy typ metody call() klucove slovo 'synchronized'.
	 * Tym znemoznime ostatnym vlaknam pristup k metode po dobu, co ju vyuziva
	 * nejake ine vlakno.
	 * 
	 * KEDYKOLVEK KED BUDEME V KODE PISAT METODU, CI SKUPINU METOD, MANIPULUJUCU
	 * VO VIACVLAKNOVOM PROSTREDI S INTERNYM STAVOM NEJAKEHO OBJEKTU, MALI BY
	 * SME POUZIT KLUCOVE SLOVO 'synchronized' A ZABRANIT TAK VZNIKU SUBEHU.
	 */
}
