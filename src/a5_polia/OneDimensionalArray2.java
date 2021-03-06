package a5_polia;
/**
 * Tato trieda predvaza ako sa da k pristupovat k prvkom pola, priradzovat im hodnoty
 * a vypisovat na vystup.
 */
public class OneDimensionalArray2 {

	public static void main(String[] pizza) {
		/*
		 * Dlzkou pola je v Jave oznacovana premenna, v ktorej je ulozeny pocet
		 * prvkov pola. Pokial teda existuje pole inicializovane na velkost 5 a
		 * my tam vlozime iba tri prvky, jeho dlzka bude stale 5.
		 * 
		 * K premennej dlzka sa da pristupovat operatorom bodka ('.'). Tento atribut
		 * maju automaticky vsetky vytvorene polia a oznacuje sa 'length' (anglicky dlzka).
		 * Dlzka pola je vzdy celocislena hodnota a nie je mozne ju v programe zmenit.
		 */
		
		char[] marks = new char[17];	//17 prvkove pole znakov
		int[] points = new int [66];	//66 prvkove pole celych cisel
		
		System.out.println("Dlzka pola marks:  " + marks.length);
		System.out.println("Dlzka pola points: " + points.length);
		
		/*
		 * K prvkom pola sa v programoch pristupuje pomocou indexov.
		 * Programatori vzdy indexuju od nuly.
		 * Je velmi dolezite, stale mysliet na tento fakt !!!
		 * 
		 * Prvy prvok v poli sa teda nachadza na indexe nula a posledny prvok sa
		 * v poli nachadza na indexe o jednotku mensie ako je celkova dlzka pola.
		 */
		
		points[0] = 80;		//priradenie hodnoty prvemu prvku v poli
		points[1] = 82;		//priradenie hodnoty druhemu prvku v poli
		points[3] = 79;		//priradenie hodnoty stvrtemu prvku v poli
		points[65]= 13;		//priradenie hodnoty poslednemu prvku v poli
		points[66]= 300;	//toto priradenie vyvola chybu (vynimku) a program spadne !!!
		
		System.out.println(points[2]);
		
		int showNumber = points[65];		//da sa zapisat aj ako points[60+5]
		System.out.println(showNumber);
	}
}
