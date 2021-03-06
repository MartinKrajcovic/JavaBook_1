package a7_triedy;

public class C6_constructor {
	
	//ATRIBUT
	private int partNumber;

	//KONSTRUKTOR TRIEDY
	/*
	 * Operacia vytvorenia noveho objektu je vykonavana operatorom 'new', ten sluzi k alokacii
	 * pamati pre vytvarany objekt. Jeho operandom je datovy typ, ktoreho instanciu chceme vytvorit.
	 * 
	 * Bezpodmienecne za touto operaciou musi vzdy nasledovat volanie konstruktoru, co je bezmenna
	 * metoda zodpovedna za vlastne vytvorenie objektu spocivajuca v inicializacii alokovanej pamate
	 * a pripadnom prevedeni dalsich potrebnych operacii.
	 * 
	 * Konstruktoru sa preda odkaz na alokovanu pamat a konstuktor vsetko inicializuje, aby bolo
	 * mozne objekt pouzivat. (t.j. vyuzivat funkcie, menit atributy, vytvarat dalsie instancie a pod.)
	 */
	public C6_constructor() {	//toto je bezparametricky konstruktor (nemusi byt vobec uvedeny)
		System.out.println("Bol vytvoreny objekt.");
		System.out.println("Bol pouzity bezparametricky konstruktor.");
	}
	//SETTER
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	//GETTER
	public int getPartNumber() {
		return partNumber;
	}
	
	//MAIN
	public static void main(String[] args) {
		
		/*Vytvorenie objektu pomocou bezparametrickeho konstruktora, ktory sme definovali sami.*/
		C6_constructor myObject = new C6_constructor();
	}
}
