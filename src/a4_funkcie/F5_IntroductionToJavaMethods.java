package a4_funkcie;

public class F5_IntroductionToJavaMethods {
	
	public static void main(String[] args) {
		String text  = "   something   ";
		String text2 = "something";
		
		/*
		 * Funkcia trim() zavolana nad objektom 'text' sluzi na orezanie prazdnych znakov
		 * na zaciatku a na konci textoveho retazca.
		 */
		
		System.out.println(text);
		System.out.println(text.trim());		
		System.out.println();
		
		/*
		 * Funkcia equals(Object) zavolana nad objektom 'text' porovnava textovu hodnotu
		 * pismeno za pismenom s objektom typu String, ktory predame funkcii v parametri. 
		 */
		
		if (text.equals(text2))								//treba otrimovat, lebo 'text' ma medzery
			System.out.println("Retazce su rovnake.");
	}
}
