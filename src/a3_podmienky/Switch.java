package a3_podmienky;
/**
 * Tato trieda demonstruje pouzitie prepinaca 'switch'.
 */
public class Switch {
	
	public static void main(String[] args) {
		/*
		 * niekedy nie je vhodne rozhodovat sa na zaklade logickych 
		 * premennych ale napr. na zaklade hodnoty vyrazov.
		 * Predmetom prikazu 'switch' je vzdy vyraz alebo premenna.
		 * Vetvenie potom nasleduje na zaklade moznych vysledkov.
		 * Predmet musi byt jeden z typov:	'byte', 'short', 'int' alebo 'char'
		 * 
		 * SYNTAX:		switch (vyraz) {
		 * 				case moznost1:
		 * 					vykonaj tento prikaz;
		 * 					break;
		 * 				case moznost2:
		 * 					vykonaj tento prikaz;
		 * 					break;
		 * 				default:
		 * 					vykonaj tento prikaz;
		 * 				}
		 */
		int integer = 2;
		
		switch(integer) {
		case 0 :
			System.out.println("integer = 0");
			break;
		case 1 :
			System.out.println("integer = 1");
			break;
		case 2 :
			System.out.println("integer = 2");
			break;
		case 3 :
			System.out.println("integer = 3");
			break;
		default :
			System.out.println("Cislo nie je v rozahu textovej reprezentacie.");
		}
	}
	
	
}
