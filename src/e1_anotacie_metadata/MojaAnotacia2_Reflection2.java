package e1_anotacie_metadata;

import java.lang.reflect.Method;

public class MojaAnotacia2_Reflection2 {

	//metoda ma teraz dva parametre
	@MojaAnotacia2(str = "Metoda s dvoma parametrami.", val = 125)
	public static void myFunction(String s, int i) {
		MojaAnotacia2_Reflection2 obj = new MojaAnotacia2_Reflection2();
		
		try {
			Class<?> c = obj.getClass();	
			//tu je nutne zadat typy parametrov
			Method m = c.getMethod("myFunction", String.class, int.class);
			MojaAnotacia2 a = m.getAnnotation(MojaAnotacia2.class);
		
			System.out.println(a.str() + " " + a.val());
			
		} catch (NoSuchMethodException e) {
			System.err.println("Takato funkcia neexistuje.");
		}
	}
	
	public static void main(String[] args) {
		myFunction("Prvy parameter", 5);
	}
}

