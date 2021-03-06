package k1_prikaz_assert;

public class Assert_program1 {

	static int val = 3;
	
	//tato metoda vracia cele cislo.
	public static int getNum() {
		return val--;
	}
	
	public static void main(String[] args) {
		int n;
		for (int i=0; i<10; i++) {
			n = getNum();	/*volanie metody nemoze byt v prikaze assert!
							  pretoze funkcia nemusi byt nikdy volana..*/
			
			//pre spustenie kontroli aserciou je potrebne zadat JVM argument '-ea'
			assert n>0;	//v pripade n=0 bude test neuspesny
			
			System.out.println("Hodnota n je "+ n);
		}
	}
	
	/*
	 * Poznamka:
	 * 
	 * V ziadnom pripade sa na asercie nemozeme spoliehat pri vykonavani
	 * nejakych skutocne potrebnych akcii. Dovodom je to, ze vacsina 
	 * dokoncenych a uvolnenych programov bude mat vypnute asercie.
	 * Nizsie uvedene volanie metody by sa vobec neuskutocnilo, v pripade,
	 * ze asercie budu vypnute:
	 * 
	 * 		assert (getNum() > 0);
	 */
}
