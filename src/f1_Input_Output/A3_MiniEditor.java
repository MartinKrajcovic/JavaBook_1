package f1_Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Tento program demonstuje jednoduchu interakciu s pouzivatelom.
 * Program vyuziva pouzivatelom zadane udaje a na zaklade jeho vstupov sa dalej rozhoduje.
 */
public class A3_MiniEditor {

public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String name;						// premenna pre meno pouzivatela
		String[] notes = new String[20];	// premenna pre poznamky pouzivatela
		char decision;						// premenna pre znakove rozhodnutie pouzivatela
		
		System.out.print("Tvoje meno: ");
		name = input.readLine();			// zapis mena pouzivatelom
		
		System.out.println();
		System.out.println("Napis nieco o sebe: ");
		System.out.println("(ked budes hotovy/a, napis 'stop'.)" + System.lineSeparator());
		for(int i=0; i<notes.length; i++) {	// cyklus umoznujuci pisat poznamky do riadkov
			notes[i] = input.readLine();	
			if (notes[i].equals("stop")) 	// ak pouzivatel zada 'stop', zadavanie skonci
				break;
		}
		
		System.out.println();
		System.out.println(name + " chces vidiet svoje poznamky?");
		System.out.print("(A / N) : ");
		decision = (char) input.read();		// tu sa pouzivatel rozhodne
		System.out.println();
		switch (decision) {					// pouzivatelove rozhodnutie sa preveruje
		case 'a' :
		case 'A' :
			System.out.println("Tvoje poznamky: " + System.lineSeparator());
			for (String n : notes) {		// cyklus vypise vsetky poznamky pouzivatela
				if (n.equals("stop"))		// okrem slova 'stop', ktore zadal pre ukoncenie zadavania
					break;
				System.out.println(n);
			}
			break;
		case 'n' :
		case 'N' :
			System.out.println("Tvoje poznamky nebudu zobrazene.");
			System.out.println("Dakujeme.");
			break;							// v pripade za pouzivatel nebude chciet vidiet poznamky
		default :
			System.out.println("Dakujeme.");
			break;
		}
	}//koniec hlavnej funkcie
}//koniec triedy
