package a5_polia;

/**
 * Tato trieda vysvetluje ucel, obmedzenia a navod na deklaraciu a inicializaciu jednorozmernych poli.
 * 
 * Poznamka:
 * Pole nie je v jave primitivny typ, ale je to OBJEKT. Moze mat vlastne funkcie a dalsie premenne.
 */
public class OneDimensionalArray {

	public static void main(String[] baldovska) {
		/*
		 * Do pola je mozne ukladat hodnoty vsetkych datovych typov.
		 * Pole predstavuje ulozny priestor s prehriadkami pre jednotlive hodnoty.
		 * Vyhodou aj nevyhovou je ich pevne dana velkost a pevne stanoveny typ,
		 * ktory je mozne do vytvoreneho pola ulozit.
		 * 
		 */
		
		int variable1;
		int variable2;
		int variable3;
		int variable4;
		int variable5;
		int variable6;
		int variable7;
		int variable8;	//koniec, tu som sa uz unavil	
		
		/*
		 * Deklaracia strucne urcuje aky typ sa bude do pola ukladat.
		 * Deklaracia je podobne deklaracii obycajnej premennej, lisi sa len hranatymi
		 * zatvorkami za nazvom datoveho typu.
		 * 
		 * Inicializaciu pola vykonavame operatorom 'new' -> ten zabezpeci miesto v 
		 * pamati pre vytvarany objekt.
		 * 
		 * Pokial polu nezadame hodnoty, tak ich ma prednastavene podla datoveho typu,
		 * ktoreho hodnoty ma uchovavat. (int = 0, String = null, Boolean = false)
		 */
		
//SPOSOB 1
		int[] array1;				//deklaracia pola typu integer (neda sa pouzit bez inicializacie)
		array1 = new int[3];		//inicializacia velkosti pola na 3 prvky
		
//SPOSOB 2
		int[] array2 = new int[4];	//deklaracia a nasledna inicializacia pola o velkosti 4 p.
		
		
//SPOSOB 3
		int[] array3 = {17, 16, 14, 24, 97};	//implicitna inicializacia pola
												//-> sam zisti velkost pola podla poctu zadanych hodnot.
	}	
}
