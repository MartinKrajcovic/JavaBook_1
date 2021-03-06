package a6_cykly;
/**
 * Tato trieda demonstruje pouzitie cyklu for.
 */
public class Loop1_for {
	public static void main(String[] args) {
		/*
		 * Cyklom sa hovori aj Iteracne prikazy a su zalozene na opakovani danej casti
		 * kodu pri meniacich sa podmienkach vypoctu.
		 * 
		 * Pokial je splnena podmienka cyklu, opakuju sa urcite prikazy, a pri kazdom
		 * opakovani je hodnota udajov zmenena tak, aby bolo iste, ze niekedy nastane
		 * koniec cyklu.
		 * 
		 * CYKLUS FOR:
		 * Ide o iteracny prikaz s pevne danym poctom opakovani a takzvanou iteracnou
		 * (riadiacou) premennou. Hodnota tejto iteracnej premennej musi byt celociselna
		 * a z pravidla sa pri kazdom opakovani meni.
		 * 
		 * SYNTAX:
		 * 			for (inicializacia iteracnej premennej;  podmienka;  aktualizacia it. premennej;) {
		 * 				prikazy;
		 * 			}
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("A");
		}
		
//		System.out.println(sumIterations());
	}
	
//DEFINICIE FUNKCII	
	public static int sumIterations() {
		int counter = 0;	//lokalna premenna funkcie
		for (int i = 0; i < 10; i++) {					//moze byt aj zlozena podmienka
			counter += i;
		}
		return counter;
	}
}
