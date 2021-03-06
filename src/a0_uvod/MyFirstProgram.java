package a0_uvod;		//musi byt uvedeny balicek, v ktorom sa nachadza nasa verejna trieda

public class MyFirstProgram {//kazdy program/kod je pisany do triedy, spustitelna trieda je vzdy 'public'
/**
 * Toto je hlavna funkcia programu. Pokial ma mat program
 * nejaky vystup, alebo sa maju nejake kody spustit, tak 
 * sa v programe musi nachadzat.
 * 
 * Hlavna funkcia musi mat presny tvar, ako je uvedene 
 * nizsie. (" public static void main(String[] arg){} ")
 * Presnejsie vysvetlenie pride pri preberani modifikatorov
 * pristupu.
 * 
 */
	public static void main(String[] args) {	//hlavna funkcia - tento zapis si pamataj!
		/*
		 * Pokial chceme nieco vypisat na standardny vystup t.j. monitor/konzola
		 * tak pouzivame bajtovy prud pre vystup dat, ktory je prepojeny so systemovou
		 * konzolou. Prikazom 'System.out' - 'out' (ako output - vystup) a volanim funkcie/metody 
		 * 'println()' (ako print line - vytlac riadok), ktora prijma argument
		 * bud textovy retazec, hodnoty premennych, ci samotnych dalsich objektov,
		 * vypisujeme obsah na standardny vystup - Monitor.
		 * 
		 * Je mozne vypisat aj priamy vysledok aritmetickej operacie medzi dvoma cislami.
		 */
		
		System.out.println("Toto je text mojho prveho programu");	//vystup na obrazovku - zapis si pamataj!
	} //tu konci hlavna funkcia
	
}//tu konci nasa trieda
