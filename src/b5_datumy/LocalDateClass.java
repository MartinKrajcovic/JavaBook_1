package b5_datumy;

import java.time.LocalDate;
import java.time.Month;

/*
 * Nove Datumove API nahradza stare triedy:
 * 		java.util.Date
 * 		java.util.Calendar
 * 		java.util.TimeZone
 * 		java.util.DateFormat
 * 
 * Triedy tohto API su nemenne (immutable), je mozne
 * s nimi pracovat pohodlne s lambda vyrazmi a vo
 * viac vlaknovom prostredi (synchronizacia).
 */
public class LocalDateClass {
	/*
	 * LocalDate je reprezentacia datumu, charakteristicka
	 * pre rok, mesiac, den.
	 * Praktickym prikladom su napriklad:
	 * 		
	 * 		Datum narodenia
	 * 		Zaciatocne/Koncove datumy
	 * 		Dni dovolenky
	 * 		Datum expiracie
	 */
	public static void main(String[] args) {	
		
		//definovanie premennej typu LocalDate
		LocalDate today;
		today = LocalDate.now();	//priradi aktualny (dnesny) datum
		
		//vypis hodnoty premennej typu LocalDate
		System.out.println("Dnesny datum:   " + today);
		System.out.println("==========================");
		
		//vypis udajov o dnesnom dni pomocou prislusnych metod triedy LocalDate
		System.out.println();
		System.out.println("Dnesny den:     " + today.getDayOfWeek());	// vracia nazov dna v tyzdni
		System.out.println("Den v mesiaci:  " + today.getDayOfMonth());	// vracia cislo dna v mesiaci
		System.out.println("Den v roku:     " + today.getDayOfYear());	// vracia cislo dna v roku
		
		//vypis udajov o aktualnom mesiaci a roku pomocou prislusnych metod triedy LocalDate
		System.out.println();
		System.out.println("Dnesny mesiac:  " + today.getMonth());		// vracia nazov mesiaca
		System.out.println("Mesiac v roku:  " + today.getMonthValue());	// vracia cislo mesiaca
		System.out.println("Rok:            " + today.getYear());		// vracia rok
			
		System.out.print  ("Priestupny rok: ");
		if (today.isLeapYear())
			System.out.println("Ano");	// ked je rok priestupny
		else
			System.out.println("Nie");	// ked je rok nepriestupny
		
		//trieda LocalDate nepouziva settery, ale tieto funkcie su
		//premenovane na metody so zacinajucim slovom "with" a kedze
		//je objekt immutable, musime jeho upravenu verziu ulozit
		//do premennej
		today = today.plusMonths(3).minusDays(1);
		today = today.withDayOfMonth(1);
		today = today.with(Month.OCTOBER);
		today = today.withMonth(10);
		
		//vytvorenie datumu je mozne aj pomocou volania metody of()
		LocalDate myBirthday = LocalDate.of(1994, Month.SEPTEMBER, 8);
		
		//v sade metod sa nachadzaju napriklad aj nasledovne..
		if (today.isAfter(myBirthday))
			today.lengthOfMonth();
	}
}
