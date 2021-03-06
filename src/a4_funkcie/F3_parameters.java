package a4_funkcie;
/**
 * Tato trieda definuje funkcie s jednym a viacerymi parametrami.
 * Popisuje a demonstruje ako sa s nimi pracuje.
 */
public class F3_parameters {

	public static void main(String[] args) {
		
		greet("Eclipse");	//volanie funkcie greet s parametrom/argumentom "Martin"
		sum(2, 3);			//volanie funkcie sum s parametrami/argumentmi 2 a 3
		toUpper("Johnny", "Perfecto", 24);
	}
	
	/**
	 * Tato funkcia prezentuje jednoduche spracovanie jedneho textoveho argumentu.
	 * Funkcia ma za ulohu pozdravit pouzivatela, ktory zada svoje meno do parametru.
	 * @param name - prijma akykolvek textovy retazec reprezentujuci meno osoby.
	 */
	public static void greet(String name) {
		System.out.println("Hello " + name);
	}
	
	/**
	 * Tato funkcia prezentuje jednoduche spracovanie dvoch celociselnych argumentov.
	 * Funkcia ma za ulohu vypisat textovy retazec s vysledkom, ktory je suctom danych dvoch
	 * argumentov.
	 * @param a	- prvy celociselny operand
	 * @param b	- druhy celociselny operand
	 */
	public static void sum(int a, int b) {
		System.out.println("Result: " + a + b);		/*POZOR na spajanie retazcov a matematicke operacie*/
	}
	
	/**
	 * Tato funkcia je prikladom pre prijem viac typovych argumentov s pouzitim navratoveho typu.
	 * Funkcia ma za ulohu spracovat vlozene parametre a vratit ich ako jeden retazec.
	 * Na dany retazec je volana funkcia triedy String, ktora prevedie kazde pismeno na velke.
	 * @param firstName - textovy retazec reprezentujuci meno
	 * @param secondName - textovy retazec reprezentujuci priezvisko
	 * @param age - cele cislo reprezentujuce vek osoby
	 * @return jeden retazec, v ktorom je meno, priezvisko a vek cloveka (text je velkymi pismenami)
	 */
	static String toUpper(String firstName, String secondName, int age) {
		return (firstName + " " + secondName + " ma " + age + " rokov.").toUpperCase();
	}
}
