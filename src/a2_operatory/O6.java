package a2_operatory;
/**
 * Tato trieda vysvetluje logicke (relacne) operatory.
 */
public class O6 {

	/*
	 * Logicke operatory su binarne.
	 * Pochopitelne vysledkom porovnavania logickymi operatormi je bud pravda
	 * alebo nepravda (plati/neplati, ci true/false).
	 * 
	 * Logicke operatory, ktore sa v programovani bezne vyuzivaju su:
	 * 		
	 * 		&&	-> a zaroven
	 * 		||	-> alebo
	 * 		
	 * Pouzivaju sa pri overovani podmienok v programe.
	 */
	
	//nazorna ukazka
	
	public static void main(String[] args) {
//		int num = -5;
		int num = 6;
		boolean result;
		
		// musia platit obe podmienky aby bol vysledok pravdivy
		result = (num > 5 && num < 10) ? true : false;
		System.out.println(result);
		
		
//		result = (!(num > 5 && num < 10)) ? true : false;
//		System.out.println(result);
		
		
		// staci aby bola len jedna podmienka pravdiva, aby bol vysledok pravdivy
		result = (num > 5 || num < 5) ? true : false;
		System.out.println(result);
	}	
}

