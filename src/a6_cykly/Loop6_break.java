package a6_cykly;

/**
 * Tato trieda demonstruje pouzitie klucoveho slova break v cykle hlavnej metody.
 */
public class Loop6_break {
	
	public static void main(String[] args) {
		/*
		 * Prikaz break sa pouziva na okamzite vyskocenie z cyklu.
		 * 
		 * Napriklad, ked nejaka podmienka v tele cyklu prestane platit
		 * a nema zmysel dokoncit vsetky otacky cyklu, alebo by to bolo
		 * neziaduce pre nejaky vypocet, prikazom break ukoncime dianie
		 * cyklu.
		 * 
		 * Po prevedeni prikazu break bude program pokracovat prvym
		 * prikazom za blokom cyklu. 
		 */
		for (int i=0; i<10; i++) {
			if (i == 6) {											//ak iteracna premenna rovna 6
				System.out.println("Cyklus dorazil na cislo " + i);	//vypis spravu
				break;												//vyskoc z cyklu
			}
			System.out.println(i);									//toto sa nevykona
		}
		System.out.println("Cyklus skoncil prikazom break.");		//pokracujeme tu
	}
}
