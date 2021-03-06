package g1_subory_a_prudy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import g1_subory_a_prudy.Files5_WritingText;
/**
 * Tato trieda demonstruje pouzitie obalovaneho prudu na citanie
 * zo suboru, ktory je definovany v triede 'f_subory.Files3_Writing'
 */
public class Files6_ReadingText {
	
	static File myFile = Files5_WritingText.myFile;
	
	public static void main(String[] args) {
		/*
		 * Ak subor neexistuje, program vypise error o tejto skutocnosti.
		 * Nasledne ukonci program, pretoze nema zmysel pokracovat dalej
		 * ked nemame k dispozicii subor, z ktoreho potrebujeme udaje ziskat. 
		 */
		if (!myFile.exists()) {
			System.err.println("Subor neexistuje!");
			return;
		}
		/*
		 * Trieda 'BufferedReader' je obalovanym prudom pre triedu 'FileReader'.
		 * Ako znaci slovo 'Reader' ide o vystupny prud vyuzivajuci buffer.
		 * 
		 * Pouzivame try-with-resource, ktory automaticky uzavrie spojenie so
		 * suborom, ked z neho prestaneme ziskavat udaje. Uzavretim spojenia
		 * umoznime inemu programu citanie alebo zapis do tohto suboru.
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(myFile));) {
			String line;			//pomocna premenna do ktorej sa bude ukladat obsah riadka
			while ((line = br.readLine()) != null) {	//podmienka, riadok nesmie byt prazdny
				System.out.println(line);				//ak podmienka plati, vypise riadok
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
