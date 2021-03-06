package i1_transient_a_volatile;

public class T {

	/*
	 * Ak je premenna instancie deklarovana ako 'transient', tak jej hodnota
	 * nemusi pri ulozeni objektu pretrvat.
	 */
	
	//priklad
		int a;				// hodnota pretrva
		transient int b;	// hodnota nepretrva
	
	/*
	 * Ak bude objekt typu T ulozeny ne nejake trvale ulozisko, potom obsah premennej 'a'
	 * ulozeny bude, zatial co obsah premennej 'b' ulozeny nebude.
	 */
		
		
	/*
	 * Modifikator 'volatile' kompilatoru hovori, ze premenna deklarovana ako 'volatile'
	 * moze byt neocakavane zmenena dalsimi castami programu. Typickou situaciou kedy
	 * tento modifikator vyuzijeme, predstavuju programy s viacerymi vlaknami.
	 * 
	 * V takych programoch totiz plati, ze rovnaku premennu casto zdielaju dve alebo tri
	 * vlakna. Z dovodu efektivity si kazde vlakno moze uchovavat svoju vlastnu privatnu
	 * kopiu tejto zdielanej premennej.
	 * 
	 */
}
