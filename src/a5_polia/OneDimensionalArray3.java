package a5_polia;

import java.util.Arrays;	//pozor na importy tried
/**
 * 
 */
public class OneDimensionalArray3 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		/*
		 * fill() metoda triedy Arrays prijma ako argumenty: Objekt, ktoreho sa ma metoda tykat,
		 * a hodnotu, s ktorou ma pracovat.
		 * V tejto kombinacii metoda naplni kazdy prvok v poli hodnotou druheho argumentu.
		 */
		Arrays.fill(names, "Unknown");	//nastavenie prvkov pola na hodnotu "Unknown"
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		names[2] = "Android";			//priradime tretiemu prvku hodnotu "Android"
		
		/*
		 * sort() metoda sluzi na usporiadanie/zoradenie hodnot prvkov v poli.
		 * Pri textoch a znakoch je zoradenie abecedne, pri cislach podla ich hodnot
		 * od najmensieho po najvacsie.
		 */
		Arrays.sort(names);				//usporiadanie prvkov pola podla abecedneho poradia
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		/*
		 * binarySearch() metoda sluzi na hladanie konkretnych hodnot v celom poli.
		 * Ako parametre zadame pole, ktore chceme prehladat a potom hodnotu, ktoru chceme najst.
		 * Metoda vracia index prvku, v ktorom sa hladana hodnota nachadza.
		 * 
		 * POZOR!!!
		 * Na to, aby sme mohli pouzit tuto metodu a prehladat pole, musi byt najskor zoradene
		 * metodou sort();
		 */
		System.out.println(Arrays.binarySearch(names, "Unknown"));	//najdi na ktorom indexe je 'Unknown'
		System.out.println(Arrays.binarySearch(names, "Android"));	//najdi na ktorom indexe je 'Android'
		System.out.println(Arrays.binarySearch(names, "Java"));		//najdi na ktorom indexe je 'Java'
	}
	
}
