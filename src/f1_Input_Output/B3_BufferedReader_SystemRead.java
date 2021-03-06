package f1_Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Maly textovy editor.
 * @author mkrajcovic
 *
 */
public class B3_BufferedReader_SystemRead {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		
		System.out.println("MALY TEXTOVY EDITOR");
		System.out.println("Zadavajte text do riadkov:");
		
		for (int i=0; i<str.length; i++) {
			str[i] = br.readLine();
			if (str[i].equals("stop"))
				break;
		}
		
		System.out.println();
		System.out.println("Historia vasho zadaneho textu: ");
		for (String s : str) {
			if (s.equals("stop"))
				break;
			System.out.println(s);
		}
		
	}
	
}
