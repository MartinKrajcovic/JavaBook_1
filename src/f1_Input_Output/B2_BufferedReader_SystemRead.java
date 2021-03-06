package f1_Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_BufferedReader_SystemRead {

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("Zadavajte riadky textu.");
		System.out.println("Program ukoncite zadanim slova 'stop'.");
		
		do {
			str = br.readLine();
		} while(!str.equals("stop"));	
	}
}
