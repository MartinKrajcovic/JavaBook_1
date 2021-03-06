package e1_anotacie_metadata;
/**
 * Tato trieda demonstruje vytvorenie vlastnej anotacie, ktoru je mozne
 * pouzit vo svojom programe. Popisuje jej vlastnosti a definiciu.
 */
@interface MojaAnotacia {
	/*
	 * Anotacie su dodatocne informacie, ktore je mozne vlozit do zdrojoveho kodu.
	 * Anotacie niako nemenia akcie vykonavane programom.
	 * Pre oznacenie tejto funkcie sa pouziva aj pojem 'metadata'.
	 * 
	 * Vsetky anotacie su tvorene vyhradne deklaraciami metod.
	 * 
	 * Anotacie mozu vyuzivat klauzulu 'extends', avsak vsetky typy anotacii automaticky
	 * implementuju rozhranie Annotation.
	 */
	String str();
	int val();
}

class MojaAnotaciaTest {
	
	@MojaAnotacia(str = "Prva anotacia.", val = 100)
	public static void myFunction() {
		
	}
}