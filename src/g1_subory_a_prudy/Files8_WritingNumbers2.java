package g1_subory_a_prudy;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Files8_WritingNumbers2 {
	/*
	 * Predchadzajuci program sa da napisat aj pohodlnejsie pomocou
	 * triedy PrintWriter, ktora obsahuje metodu println().
	 */
	public static void main(String[] args) {
		try(PrintWriter pw = new PrintWriter(new FileWriter("numbers2.txt", false))) {
			int i = 9;
			while (i++ < 30) {
				pw.println(i + "");	//z cisla spravime retazec
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				Desktop d = Desktop.getDesktop();
				d.open(new File("numbers2.txt"));
			} catch (IOException e) {
				System.err.println("Subor sa nepodarilo otvorit.");
			}
		}
	}
}
