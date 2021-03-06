package a2_operatory;
/**
 * Tato trieda znazornuje pracu s porovnavacimi operatormi.
 */
public class O1 {

/* Operatory porovnania su binarne, co znamena, ze kazdy
 * z nich vyzaduje dva operandy. 
 * Vysledkom porovnavania je booleanovska hodnota true/false.
 * Proste ci vyraz plati, alebo nie.
 * 
 * Porovnavacie operatory su:
 * 		==	rovna sa
 * 		!=	nerovna sa
 * 		<	mensie nez
 * 		>	vacsie nez
 * 		<=	mensie, nanajvys rovne nez
 * 		>=	vacsie, nanajvys rovne nez
 */
	
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		
		System.out.println(a == b);		// true		-> a sa rovna b
		System.out.println(a != b);		// false	-> a sa rovna b
		System.out.println(a > b);		// false	-> a nie je vacsie ako b
		System.out.println(a >= b);		// true		-> a nie je vacsie ako b, ale nanajvys rovne ano
		
		System.out.println();			// prazdny riadok
		
		
		
	}
}
