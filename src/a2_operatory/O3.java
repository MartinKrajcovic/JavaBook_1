package a2_operatory;
/**
 * Tato trieda demonstruje pouzitie priradovacich operatorov.
 */
public class O3 {
	/*
	 * Priradovacie operatory su binarne, nakolko potrebuju dva
	 * operandy.
 	 * 
 	 * Priradenie hodnot alebo vyrazov sa deje z prava do lava.
 	 * To co je na pravej strane sa priradzuje do premennej na 
 	 * lavej strane.
	 */
	
	public static void main(String[] args) {
		// '=' je operatorom priradenia
		int num = 55;
		
		// tento operator moze byt kombinovany
		num = num - 1;			/* premennej 'num' sa priradi hodnota z vypoctu 'num - 1',
		 						   hodnota 'num' je 55 <- ta sa zmeni na 54             	*/
		// zjednoduseny zapis
		num -= 1;
		
		// to iste plati aj pri nasledujucich operatoroch:
		num += 2;		// num = num + 2
		num *= num;		// num = num * num
		num /= 4;		// num = num / 4
		num %= 3;		// num = num % 3
		System.out.println(num);	//otestuj vysledok (pozor na charakteristiku datoveho typu)
	}
	
}
