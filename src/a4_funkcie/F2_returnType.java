package a4_funkcie;
/**
 * Tato trieda ukazkovo definuje dve metody s navratovym typom.
 * V hlavnej metode su moznosti danych metod skusane.
 */
public class F2_returnType {
	
	public static void main(String[] args) {
		String text;						//pomocna premenna na uloznie vysledku z funkcie
		
		giveMeTrue();						//volanie funkcie ma efekt, no nema vystup
		giveMeSomeText();					//volanie funkcie ma efekt, no nema vystup
		
		text = giveMeSomeText();			//ulozenie vysledku z funkcie do premennej
		System.out.println(text);			//pouzitie premennej obsahujucej vysledok z funkcie
		System.out.println(giveMeTrue());	//vypis hodnoty funkcie, priamo na vystup
		
		if (!(giveMeTrue())) {				//pouzitie navratovej hodnoty funkcie ako podmienku
			return;							//ak podmienka plati, program skonci
		}
		System.out.println("Program pokracuje dalej..");	
	}
	
	/**
	 * Tato jednoducha funkcia v podstate nic nerobi, sluzi ako ukazka
	 * funkcie s logickym navratovym typom - boolean.
	 * @return true
	 */
	public static boolean giveMeTrue() {
		return true;
	}
	
	/**
	 * Tato jednoducha funkcia v podstate nic nerobi, sluzi ako ukazka
	 * funkcie s textovym navratovym typom - String
	 * @return textovy retazec "Some text."
	 */
	static String giveMeSomeText() {
		return "Some text.";
	}
	
}
