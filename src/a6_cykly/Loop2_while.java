package a6_cykly;
/**
 * Tato trieda demonstruje pouzitie cyklu while v definovanej metode triedy.
 */
public class Loop2_while {
	
	public static void main(String[] args) {
		
		/*
		 * Cyklus while je rovnako ako cyklus for, iteracnym prikazom, ktoremu sa
		 * na zaciatku cyklu overuje podmienka. Rozdiel medzi nimi je cisto syntakticka.
		 * 
		 * SYNTAX:
		 * 			while (podmienka) {
		 * 				prikazy;
		 * 			}
		 * 
		 * Iteracnu premennu si treba zadefinovat niekde v kode a rucne aj poriesit
		 * inkrementaciu tejto riadiacej premennej.
		 */
		
		//volanie mojej funkcie
		loop(4, false);	
		
	}
	
	/**
	 * Tato funkcia spusta otacky cyklu v takom pocte, aky si urci pouzivatel, ktory
	 * funkciu vola. Ten kto vola tuto funkciu si moze vybrat, ci chce vidiet cely 
	 * iteracny priebeh cyklu alebo len zobrazit vysledok o vykonanom pocte otacok.
	 * @param attempts - cele cislo, ktore urcuje kolko krat ma cyklus vykonat svoju cinnost
	 * @param show - ak je hodnota true, vypisuje sa kazda otacka na vystup. Hodnota false, 
	 * 				 zapricini presny opak.
	 */
	static void loop(int attempts, boolean show) {
		int loops = 0;
		int iteration = 0;
		
		while (iteration < attempts) {
			loops += 1;						//loops = loops + 1;
			if (show) {
				System.out.println(loops);	//vypis aktualnej hodnoty premennej 'loops' pokial plati podmienka
			}
			iteration++;					//postfixova inkrementacia iteracnej premennej
		}
		System.out.println("Pocet prevedenych otacok cyklu: " + loops);
	}
}
