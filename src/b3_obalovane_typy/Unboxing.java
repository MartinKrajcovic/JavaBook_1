package b3_obalovane_typy;
/**
 * Tato trieda demonstruje unboxing obalovanych typov na ich primitivne typy.
 */
public class Unboxing {
	
	public static void main(String[] args) {
		
		/*
		 * Pri Unboxingu ide o prevod hodnot objektovych typov na svoje primitivne typy,
		 * aby bolo napriklad mozne rychlo a efektivne vykonavat vypocty a ine operacie.
		 * Obalujuce typy zaberaju v pamati viac miesta a su menej efektivne v jednoduchsich
		 * vypocetnych ukonoch.
		 */

//UNBOXING OBJEKTOVEHO TYPU NA JEHO CELOCISELNY PRIMITIVNY TYP 		
		Integer velkyInt1 = 99;
		Integer velkyInt2 = 1;
		int malyInt = (velkyInt1 + velkyInt2);
		System.out.println(malyInt);

//UNBOXING OBJEKTOVEHO TYPU NA JEHO ZNAKOVY PRIMITIVNY TYP		
		Character velkyChar = '&';
		char malyChar = velkyChar;
		System.out.println(malyChar);
		
//UNBOXING OBJEKTOVEHO TYPU NA JEHO LOGICKY PRIMITINVY TYP		
		Boolean velkyBool = true;
		boolean malyBool = velkyBool;
		System.out.println(malyBool);
		
	}
	
}
