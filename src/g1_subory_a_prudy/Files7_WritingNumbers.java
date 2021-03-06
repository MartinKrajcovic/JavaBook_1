package g1_subory_a_prudy;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files7_WritingNumbers {
	/*
	 * Pre zapis cisiel do suboru je mozne pouzit znakovy prud, ktoreho metode
	 * predame cislo spojene s retazcom, tak sa zapise doslovna hodnota cisla
	 * do suboru. Pri pokuse o zapis cisel pomocou metody write() bajtoveho 
	 * prudu sa budu cisla interpretovat podla ASCII.
	 */
	public static void main(String[] args) {
		/*
		 * Je pouzita metoda append(), avsak kludne sa da pouzit metoda
		 * write(String str).
		 */
		try(FileWriter fw = new FileWriter("numbers.txt", false)) {
			int i = 9;
			while (i++ < 30) {
				fw.append(i + " ");	//k cislu sa pripoji retazec
				if (i % 3 == 0)	//ak je cislo delitelne tromi
					fw.append(System.lineSeparator());	//subor ide o riadok nizsie
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			/*
			 * Po dokonceni operacie so suborom, bude subor automaticky
			 * otvoreny do popredia, aby bolo mozne vidiet zmeny.
			 */
			try {
				Desktop d = Desktop.getDesktop();
				d.open(new File("numbers.txt"));
			} catch (IOException e) {
				System.err.println("Subor sa nepodarilo otvorit.");
			}
		}
	}
}
