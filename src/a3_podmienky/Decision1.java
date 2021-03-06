package a3_podmienky;
/**
 * Tato trieda demonstruje pouzitie jednoducheho
 * neuplneho podmieneneho prikazu.
 */
public class Decision1 {
	
	public static void main(String[] args) {

		int mojeStastneCislo = 7;
		
		/*
		 * Najjednoduchsim prvkom pre riadenie programu su podmienky.
		 * Priklad: Ked vonku prsi, tak si zoberiem dazdnik.
		 * 
		 * Pri pouziti neuplneho podmieneneho prikazu nas zaujima iba to,
		 * co sa stane ked je podmienka spnena.
		 * Nezaujima nas, co sa stane v opacnom pripade.
		 * V pripade, ze podmienka nie je splnena, program pokracuje dalej,
		 * vykonavanim prikazov, ktore su za podmienkou.
		 * 
		 * SYNTAX:	if (podmienka) { prikazy; }
		 * 
		 * -> Podmienka musi byt vo forme vyrazu, ktoreho vysledkom
		 * 	  je logicky typ (true alebo false)
		 */
		
		//kazda podmienka by mala mat blok pre svoje telo, inak sa logika programu zneprehladni
		// *** nie je to vsak chyba *** //
		
		if (mojeStastneCislo == 7)
			System.out.println("Uhadol si!");	
			System.out.println("Gratulujem!");
	}
}
