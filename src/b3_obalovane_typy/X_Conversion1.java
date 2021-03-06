package b3_obalovane_typy;
/**
 * Tato trieda demonstruje moznosti konverzie hodnot primitivnych datovych typov
 * na textove retazce.
 */
public class X_Conversion1 {
	/*
	 * Trieda String ma pretazenu metodu 'valueOf()', ktora vracia textovu
	 * reprezentaciu hodnoty primitivneho datoveho typu.
	 * 
	 * Je tak mozne previest a ziskat textovy retazec z akehokolvek takehoto 
	 * datoveho typu, ak to k niecomu potrebujeme.
	 */
	public static void main(String[] args) {

//PREVOD HODNOTY CELOCISLENEHO DATOVEHO TYPU NA TEXTOVU REPREZENTACIU		
		int x = 5;
		String text = String.valueOf(x);
		System.out.println(text);

//PREVOD HODNOTY LOGICKEHO DATOVEHO TYPU NA TEXTOVU REPREZENTACIU		
		boolean b = true;
		String text2 = String.valueOf(b);
		System.out.println(text2);
		
//PREVOD HODNOTY ZNAKOVEJ PREMENNEJ TYPU POLE NA TEXTOVU REPREZENTACIU		
		char[] ch = {'s', 'l', 'o', 'v', 'o'};
		String text3 = String.valueOf(ch);
		System.out.println(text3);
		
	}
	
}
