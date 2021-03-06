package l1_staticky_import;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class StaticImport {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 13;
		
		//pri pouziti statickeho importu kniznic, nie je nutne uvadzat nazvy tried statickych funkcii
		System.out.println(sqrt(pow(a, b) * pow(b, a)));
		
	}
	
}
