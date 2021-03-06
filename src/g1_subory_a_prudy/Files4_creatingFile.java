package g1_subory_a_prudy;

import java.io.File;
import java.io.IOException;
/**
 * Tato trieda demonstruje definovanie a vytvorenie naseho suboru
 * pre dalsiu pracu.
 */
public class Files4_creatingFile {

	/*
	 * Trieda 'File' nam umoznuje definovat cielovy subor, ktory bud
	 * existuje alebo neexistuje na relativnej alebo absolutnej ceste.
	 * 
	 * A ako reprezentaciu tohto suboru nam ho umoznuje pouzivat dalej
	 * s moznostou invokacie roznych metod, pouzitia v podmienkach alebo 
	 * vstupnych, ci vystupnych prudoch.
	 */
	
	//modifikator 'static', aby sme ho mohli volat z hlavnej funkcie
	static File myFile = new File("C:\\devel\\zoznam.txt");
	
	public static void main(String[] args) {
		/*
		 * createNewFile metoda uvedena nizsie v podmienke vyhadzuje
		 * vynimku. Preto je nutne tieto prikazy obklucit blokmi 'try-catch'
		 */
		try {
			if (!myFile.exists()) {			//overuje sa podmienka, ci subor na danej ceste existuje
				myFile.createNewFile();		//ak neexistuje, je na neho volana metoda, ktora ho vytvori
				System.out.println("Bol vytvoreny novy subor: " + myFile.getName());
			} else {
				System.out.println("Subor uz existuje.");
			}
		} catch (IOException e) {			//v pripade, ze sme zadali zlu absolutnu cestu, dojde k chybe 
			System.err.println("Skontroluj cestu k suboru.");
		}
	}
}
