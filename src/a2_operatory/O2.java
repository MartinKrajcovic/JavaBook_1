package a2_operatory;
/**
 * Tato trieda demonstruje pouzitie aritmetickych operatorov.
 */
public class O2 {

/*
 * Vacsina z aritmetickych operatorov tiez ako aj porovnavacie
 * operatory, su binarne, takze potrebuje dva operandy.
 * Existuju vsak dva operatory, ktore su aritmeticke ale aj unarne
 * zaroven.
 * 
 * Vysledkom pouzitia aritmetickeho operatora je nejaky vysledok,
 * prevazne ciselny.
 * 
 * Aritmeticke operatory su:
 * 	binarny		+	scitanie
 * 	binarny		-	odcitanie
 * 	binarny		*	nasobenie
 * 	binarny		/	delenie
 * 	binarny		%	modulo (zvysok po deleni)
 *  unarny		++	inkrementacia
 *  unarny		--	dekrementacia
 */
	public static void main(String[] args) {
		
		int a = 5;	//inicializacia celociselnej premennej a na hodnotu 5
		int b = 4;	//inicializacia celociselnej premennej b na hodnotu 4
//BINARNE		
		System.out.println(a + b);	// 9	-> (4 + 5)	
		System.out.println(a - b);	// 1	-> (5 - 4)
		System.out.println(a * b);	// 20	-> (5 * 4)
		System.out.println(a / b);	// 1	-> (5 / 4)
		
		System.out.println(a % b);	// 1	-> (5 / 4)	-> (1 a zvysok 1)	-> (zvysok 1 je vysledok)
		System.out.println(a % 5);	// 0	-> (5 / 5)	-> (1 a zvysok 0)	-> (zvysok 0 je vysledok)
//UNARNE		
		System.out.println(a++);	// 5	-> (5 + 1)	-> (hodnota bude inkrementovana na 6 az po vypise)
		System.out.println(++a);	// 7	-> (6 + 1)	-> (hodnota bude inkrementovana na 7 pred vypisom)
		System.out.println(a--);	// 7	-> (7 - 1)	-> (hodnota bude dekrementovana na 6 az po vypise)
		System.out.println(--a);	// 5	-> (6 - 1)	-> (hodnota bude dekrementovana na 5 pred vypisom)
		
		System.out.println();		// prazdny riadok
				
	}
}



