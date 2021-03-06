package e1_anotacie_metadata;
/*
 * Java definuje tri zakladne politiky zivotnosti, ktore su zapuzdrene do zoznamu
 * 'java.lang.annotation.RetentionPolicy'.
 * 
 * 	1. SOURCE -> je uchovavana iba v zdrojovom subore. Pri komplacii je anotacia zahodena.
 * 	2. CLASS  -> je v priebehu kompilacie ulozena do suboru typu .class. Pocas programu k nej
 * 				 virtualny stroj Javy nema pristup.
 * 	3. RUNTIME-> je v priebehu kompilacie ulozena do suboru typu .class. Pocas programu k nej
 * 				 virtualny stroj Javy ma pristup. Ponuka najvyssiu stalost anotacii.
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)		//urcenie politiky zivotnosti anotacie
public @interface MojaAnotacia2 {		//vytvorenie anotacie

	String str();						//deklarovanie clenov
	int val();
}
class C {			//skusobna (aplikacna) trieda
	
	//POUZITIE MOJEJ ANOTACIE
	@MojaAnotacia2(str = "dadsa", val = 100)	
	public static void myFunction() {
		
	}
}
