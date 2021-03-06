package l1_staticky_import;

public class NonStaticImport {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 13;
		
		/*pri pouziti nestatickeho importu kniznic, je nutne uvadzat nazvy tried statickych funkcii
		  -> tu nie je import uvedeny, pretoze kazda trieda automaticky importuje kniznicu 'java.lang'*/
		System.out.println(Math.sqrt(Math.pow(a, b) * Math.pow(b, a)));
	}
	
}
