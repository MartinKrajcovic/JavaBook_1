package a4_funkcie;
/**
 * Tato trieda demonstruje definovanie a volanie/spustenie funkcii.
 */
public class F1_void {
	/*
	 * Funkcie sluzia na to, aby zadanym sposobom spracovavali ziskane udaje
	 * a vykonavali dalsie rozne ulohy. 
	 * 
	 * Definicia metod pozostava z nasledujucich casti:
	 * 1. Dokumentacny komentar, popisujuci co metoda robi a ako sa ma pouzivat.
	 * 2. Hlavicka metody, deklarujuca dolezite charakteristiky:
	 * 	  a) zoznam modifikatorov (moze byt aj prazdny)
	 * 	  b) typ navratovej hodnoty (pokial metoda nic nevracia uvadza sa 'void')
	 * 	  c) nazov metody (standardny identifikator)
	 * 	  d) zoznam deklaracii pripadnych parametrov uzatvorenych v gulatych zatvorkach ()
	 * 3. Telo metody, ktore nasleduje za hlavicku. Je tvorene zoznamom prikazov v zlozenych zatvorkach {}
	 */
	
	/**
	 * <h1>POZDRAV</h1>
	 * <p>Tato funkcia po zavolani pozdravi vsetkych pritomnych.
	 * Pozdrav je velkymi pismenami.</p>
	 */
	public static void sayHello() {
		System.out.println("Hello everyone!".toUpperCase());
	}
	
	public static void main(String[] args) {
		//zavolanie funkcie
		sayHello();			/* po zavolani funkcie, sa prejdu vsetky prikazy v jej tele */
	}
}
