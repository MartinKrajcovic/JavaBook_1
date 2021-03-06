package f1_Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2_SystemInput {
	public static void main(String[] args) {		//vynimka je vyhodena funkciou do miesta volania
		
		System.out.println("Zadaj znak, alebo vetu:");
		citanieASCII();
//		citanieZnakov();
//		citanieRetazcov();	
	}
	/**
	 * Tato funkcia demonstruje, ze citanie znakov, ci retazcov nie je tak jednoducha ako vypis, na
	 * standardny vystup, ktory uz mame zapouzivany. Neobaleny prikaz pre systemovy vstup vracia len
	 * odkaz na cislo v tabulke ACSII, ktore reprezentuje hodnotu vlozenu do konzoly pouzivatelom.
	 */
	public static void citanieASCII() {	//otvor tabulku ASCII v tomto package
		try {
		int value = System.in.read();	//tymto sposobom sa vstup z konzoly nezvykne zaznamenavat
		System.out.println(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Tato funkcia demonstruje, uspesne citanie znakov prelozene z ASCII tabulky do hodnoty
	 * reprezentovanej datovym typom 'char'. Avsak funkcia 'read()' pozaduje typ 'int', tak
	 * je nutne tento prikaz pretypovat ako je uvedene v definicii.
	 */
	public static void citanieZnakov() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			char value = (char) br.read();
			System.out.println(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Tato funkcia demonstruje pouzitie obalovaneho systemoveho prikazu, pre citanie retazcov
	 * v riadkoch. Nie je nutne prikaz priradenia hodnoty pretypovat na 'String', pretoze
	 * je pouzita metoda 'readLine()', ktora je pre retazce definovana.
	 * @throws IOException - funkcia vyhadzuje vynimku, osetrenie nechava na toho, kto tuto
	 * 						 metodu pouzije.
	 */
	public static void citanieRetazcov() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();
		System.out.println(value);
	}
}