package b4_vynimky;
/**
 * Tato trieda demonstruje zachytenie a osetrenie vyhodenej nekontrolovanej vynimky 
 * 'ArithmeticException' typu 'RuntimeException' blokmi 'try-catch'.
 */
public class E2_tryCatch {
	/*
	 * V pripade, ze sa v programe vyskytne vynimka, je viacero sposobov ako na taku situaciu reagovat.
	 * My sa vsak budeme venovat sposobu zachytenia a okamziteho osetrenia priamo na mieste vyskytu.
	 * 
	 * Aby bolo mozne vynimku osetrit priamo v metode, kde sa vyskytla, je nutne ju najskor zachytit.
	 * K zachyteniu a osetreniu vynimky sluzia bloky 'try-catch'.
	 * 
	 * Do casti try je umiestneny kus kodu, v ktorom moze dojst k vynimke.
	 * Pokial k nej potom pri behu programu dojde, tak ju blok 'try' zachyti a preskoci s vykonavanim
	 * prikazov do prislusneho bloku 'catch' kde je mozne danu vynimku osetrit.
	 * Blok 'catch' definuje, aky typ vynimky v nom bude zachyteny a osetreny.
	 * Pri pisani programu a ladeni je castym sposobom osetrenia vynimky vypis jej chyboveho hlasenia
	 * na vystup. (v hotovom programe, by tieto hlasenia koncovy pouzivatel vidiet nemal)
	 */
	public static int divideNumbers(int x, int y) {
		int result = 0;
		try {
			result = (x / y);
		} catch (ArithmeticException e) {	//zachytenie Aritmetickej vynimky pre pripad delenia nulou
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(divideNumbers(4,0));
	}
}
/*
 * Tato vynimka si neziada byt osetrena, ide o typ RuntimeException.
 * Tento pripad sa da osetrit aj obycajnymi podmienkami 'if-else'.
 */
