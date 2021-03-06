package b4_vynimky;
/**
 * Tato trieda demonstruje moznost definovania svojej vlastnej vynimky.
 * Hlavna funkcia spusta funkciu, ktora tuto vynimku vyvolava.
 */
public class E5_customException {	//POZOR, len jedna trieda tu moze byt public

	public static void main(String[] args) {
		
		try {
			myFunction(4, 0);
		} catch (DelenieNulou exception) {	//zachytavame nami vytvorenu vynimku (ArithmeticException)
			System.err.println(exception.getMessage());
		} finally {
			System.out.println("Tento kod sa vykona..");
		}
		System.out.println("Tymto riadkom program pokracuje..");
	}
	/**
	 * Tato metoda ma za ulohu vydelit prvy predany argument druhym
	 * a vypisat vysledok po tejto operacii na standardny vystup.
	 * @param a - prvy operand, ktory bude deleny
	 * @param b - druhy operand, ktory bude delitelom
	 * @throws DelenieNulou pre pripad, ze pouzivatel bude chciet delit nulou
	 */
	public static void myFunction(int a, int b) {
		int result = 0;
		if (b == 0) {	//ak sa druhy operand rovna nule, bude vyhodena vynimka DelenieNulou
			throw new DelenieNulou("Pri celych cislach sa delit nulou neda.");
		}
		else {
			result = a/b;
			System.out.println(result);
		}
	}
}
/**
 * Tato vynimka je vyhodena pri pokuse o deleni celych cisel nulou.
 * <p>
 * Tato trieda priamo dedi od ArithmeticException triedy, ktora je
 * typu RuntimeException, tym padom ma tato trieda charakteristiku
 * nekontrolovanej vynimky, ktora moze byt vyhodena, zachytena a 
 * osetrena niekde v programe.
 * </p>
 */
@SuppressWarnings("serial")
class DelenieNulou extends ArithmeticException{
	//KONSTRUKTOR VOLAJUCI KONSTRUKTOR PREDKA
	DelenieNulou(String msg) {
		super(msg);				/*Parametrizovany konstruktor triedy 'ArithmeticException'
		 						  ktory volame konstruktorom triedy 'DelenieNulou'*/
	}
}
