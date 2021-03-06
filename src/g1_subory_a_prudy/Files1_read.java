package g1_subory_a_prudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Tento program sluzi na vytvorenie spojenia s textovym suborom.
 * Ulohou programu je citat jednotlive znaky pokial nedojde na koniec suboru.
 * Pouzivame neobaleny vstupny prud s metodou read(), takze kazdy znak je v 
 * podobe ASCII kodu. Ten sa pri vypise na standardny vystup pretypuje datovym 
 * typom 'char', aby sme dostali pozadovany vysledok.
 */
public class Files1_read {
	
	public static void main(String[] args) {
		int i;
		FileInputStream fis = null;
		
		//nasledujuci blok cita znaky zo suboru az do okamihu nez narazi na koniec suboru
		try { 
			fis = new FileInputStream("C:\\devel\\Files1_read.txt");
			do {
				i = fis.read();						//citanie bajtov (ASCII)
				if (i != -1)
					System.out.println((char) i);	//pretypovanie ASCII kodu na znak
			} while (i != -1);
		} catch (FileNotFoundException a) {
			System.err.println("Subor sa nepodarilo najst.");
		} catch (IOException e) {
			System.err.println("Chyba pri citani suboru.");
		} finally {		//uzatvorenie suboru
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.err.println("Chyba pri zatvarani suboru.");
			}
		}
	}
	
}
