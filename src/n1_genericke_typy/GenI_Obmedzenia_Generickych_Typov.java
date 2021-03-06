package n1_genericke_typy;

public class GenI_Obmedzenia_Generickych_Typov<T extends Runnable & Comparable<T>> {
	private T typ;
	private T[] typy;
	/*
	 * Prve obmedzenie, je ze nie je mozne vytvorit instanciu typu,
	 * ktora je zhodna s typovym parametrom.
	 * V tomto pripade nie je povolene vytvaranie instancii typy T.
	 * Kedze typ T v dobe behu neexistuje, ako by sa mal kompilator
	 * dozvediet, aky typ objektu ma pouzit?
	 */
	protected GenI_Obmedzenia_Generickych_Typov(T typ) {
//		typ = new T();
	}
	/*
	 * Dalsim obmedzenim je, ze ziaden zo statickych clenov nesmie
	 * vyuzivat typovy parameter deklarovany uzatvaracou triedou.
	 * To znamena, ze nasledujuca staticka metoda nemoze deklarovat
	 * typovy parameter shodny s typovym parametrom deklarovanym
	 * touto triedou.
	 */
//	static T myMethod() {
//		return typ;
//	}
	/*
	 * Avsak, staticke genericke metody mozu specifikovat svoje 
	 * vlastne typove parametre, pokial su rozdielne od tych, ktore
	 * definuje uzatvaracia trieda.
	 */
	static <Q> Q myMethod2(Q object) {
		return object;
	}
	/*
	 * Tak ako pri priklade uvedenom v konstruktore tejto triedy,
	 * nie je mozne vytvarat instancie poli typu specifikovaneho
	 * pri deklaracii typoveho parametru.
	 * Taktiez, nie je mozne vytvorit pole obsahujuce typovo 
	 * specificke genericke odkazy.
	 * Kedze typ T v dobe behu neexistuje, nie je mozne vytvorit
	 * pole tohto typu.
	 */
	public void assignLength(int length) {
//		typy = new T[length];
	}
	/*
	 * Avsak, mozeme metode predat odkaz na typovo kompatibilne
	 * pole a priradit tento odkaz premennej typy.
	 */
	public void initializeArray(T[] array) {
		typy = array;
	}
	/*
	 * Polia specifickeho generickeho typu jednoducho nie su povolene
	 * pretoze ich pouzivanie by mohlo viest k strate typovej bezpecnosti.
	 * Mozeme vsak vytvorit pole odkazov na genericky typ, a to pod
	 * podmienkou, ze pouzijeme zolik.
	 * 
	 * Tento pristup je lepsi, nez pouzivanie pola surovych typov, pretoze
	 * aspon nejaka typova kontrola bude v tomto pripade vynutena.
	 */
	public void createNewArray(int length) {
		GenI_Obmedzenia_Generickych_Typov<?>[] nr = new GenI_Obmedzenia_Generickych_Typov<?>[length];
	}
	/*
	 * Poslednym obmedzenim je to, ze genericka trieda nemoze rozsirovat
	 * triedu Throwable, a tym padom nemozeme vytvarat genericke triedy
	 * vynimiek.
	 */
}
