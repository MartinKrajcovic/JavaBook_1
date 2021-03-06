package g1_subory_a_prudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Tento program sluzi na bajtove citanie jedneho suboru a 
 * skopirovanie jeho obsahu do druheho, prazdneho suboru.
 */
public class Files2_copy {

	public static void main(String[] args) {
		int i;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//kopirovanie suboru
		try {
			//pokus o otvorenie suboru
			fis = new FileInputStream("C:\\devel\\Files1_read.txt");	//z tohto sa cita
			fos = new FileOutputStream("C:\\devel\\Files2_copy.txt");	//do tohto sa zapisuje
			do {
				i = fis.read();		//citanie zo suboru
				if (i != -1)
					fos.write(i);	//zapis do suboru
			} while (i != -1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {					//explicitne uzavretia suborov
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.err.println("Chyba pri uzatvarani vstupneho suboru.");
			}
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e2) {
				System.err.println("Chyba pri uzatvarani vystupneho suboru.");
			}
		}
	}	
}
