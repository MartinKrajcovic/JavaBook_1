package g1_subory_a_prudy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files5_WritingText {
//DEFINOVANIE SUBORU
   static File myFile = new File("C:\\devel\\sss.txt");
	
	public static void main(String[] args) {
//OVERENIE EXISTENCIE SUBORU / VYTVORENIE SUBORU		
		try {
			if (myFile.exists()) {
				myFile.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * Trieda 'FileWriter' nam vytvara vstupny prud pre nas subor.
		 * Sluzi na zapisovanie textovych znakov do suboru. (char)
		 */
		try {
			FileWriter fw = new FileWriter(myFile);
			fw.append("Tovar 1");
			fw.append("Tovar 2");
			fw.append("Tovar 3");
			fw.close();				//uzavretie spojenia suboru s programom
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 * Pri tychto spojeniach/pracami so subormi, od teraz budeme vzdy
 * pouzivat 'try-with-resource' bloky.
 */

