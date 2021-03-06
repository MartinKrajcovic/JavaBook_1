package b3_obalovane_typy;
/**
 * Tato trieda demonstruje system autoboxingu primitivnych datovych typov
 * na ich neprimityvne obalovane typy (Objekty).
 */
public class Autoboxing {
	public static void main(String[] args) {
		/*
		 * Autoboxing, ako uz napoveda nazov, automaticky zabali primitivny datovy typ
		 * na jeho rodicovsky obalovany typ, objekt. 
		 * Primitivne datove typy su obalovane nasledovne:
		 * 
		 * 		byte		Byte
		 * 		int			Integer
		 * 		short		Short
		 * 		long		Long
		 * 		double		Double
		 * 		char		Character
		 * 		boolean		Boolean
		 * 
		 * To znamena, ze ak potrebujeme pracovat s objektom tohto typu, a aby reprezentoval
		 * hodnotu, ktoru by sme priradili jeho primitivnemu typu, pouzijeme autoboxing, co 
		 * je jednoducho pomocou operatora priradenia, priradena hodnota obalovanemu typu.
		 */
//AUTOBOXING CELOCISELNEHO PRIMITIVNEHO DATOVEHO TYPU		
		int malyInt = 4;
		Integer velkyInt1 = 5;				//priradenie hodnoty objektu Integer		
		Integer velkyInt2 = malyInt;		//priradenie hodnoty primitivneho typu objektu Integer
		System.out.println(velkyInt2);		
		
//AUTOBOXING ZNAKOVEHO PRIMITIVNEHO DATOVEHO TYPU		
		char malyChar = 'k';
		Character velkyChar1 = 'P';			//priradenie hodnoty objektu Character
		Character velkyChar2 = malyChar;	//priradenie hodnoty primitivneho typu objektu Character
		System.out.println(velkyChar2);
		
//AUTOBOXING LOGICKEHO PRIMITIVNEHO DATOVEHO TYPU		
		boolean malyBool = true;
		Boolean velkyBool1 = false;			//priradenie hodnoty objektu Boolean
		Boolean velkyBool2 = malyBool;		//priradenie hodnoty primitivneho typu objektu Boolean
		System.out.println(velkyBool2);
	}
}
