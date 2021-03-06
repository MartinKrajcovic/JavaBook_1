package d1_enum;

public class JablkoDemo2 {
/*
 * Celkom automatickou sucastou vsetkych vyctov su metody values() a valueOf().
 * Metoda values() vracia pole obsahujuce zoznam konstant definovanych vo 
 * volajucom type. Metoda valueOf() vracia tu hodnotu vyctu, ktora zodpoveda
 * retazcovej hodnote predanej v argumente.
 * 
 * Priklad:
 * Jablko j = Jablko.valueOf("Winesap");
 * Vrati hodnotu Jablko.Winesap premennej j.
 */
	public static void main(String[] args) {
		Jablko apple;
		
		System.out.println("Toto su vsetky konstanty Enum Jablko:");
		
		//pouzitie metody values()
		Jablko[] allApples = Jablko.values();
		for (Jablko j : allApples) {
			System.out.println(j);
		}
		
		System.out.println();
		
		//pouzitie metody valueOf()
		apple = Jablko.valueOf("Cortland");
		System.out.println("Hodnota premennej apple: " + apple);
		
	}
	
}
