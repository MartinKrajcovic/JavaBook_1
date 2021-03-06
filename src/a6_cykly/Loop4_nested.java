package a6_cykly;
/**
 * Tato trieda definuje metodu, ktora demonstruje moznost pouzitia vnorovania cyklov.
 */
public class Loop4_nested {
	
	public static void main(String[] args) {
		
		makeTable(8, 3);
		System.out.println();
//		makeTable(9, 2);
	}
	/**
	 * Tato metoda spusta cyklus for, ktory ma za ulohu vypisat riadky a stlpce
	 * podla zadaneho poctu riadkov a stlpcov pouzivatelom.
	 * Riadky sa vypisuju vonkajsim cyklom for a iteruje podla podmienky zadanej
	 * pouzivatelom.
	 * Stlpce sa vypisuju pomocou vnoreneho cyklu for, ktoreho vsetky otacky budu
	 * vykonane pocas jednej otacky vonkajsieho cyklu.
	 * Kazdou jednou otackou cyklu, sa vykonaju vsetky otacky vnoreneho cyklu!
	 * @param row - urcuje hodnotu zastupujucu pocet riadkov
	 * @param column - urcuje hodnotu zastupujucu pocet stlpcov
	 */
	static void makeTable(int row, int column) {
		for (int i=0; i<row; i++) {								//vonkajsi cyklus
			System.out.print("Riadok " + (i+1) + " ");			/* metoda print(); */
			for (int j=0; j<column; j++) {						//vnoreny cyklus
				System.out.print(" Stlpec"+ (j+1) + " ");		/* metoda print(); */
			}
			System.out.println();								//posunutie na dalsi riadok
		}
	}
}
