package e1_anotacie_metadata;

import java.lang.reflect.Method;
/**
 * Tato trieda demonstruje ako mozeme dostat defaultne hodnoty
 * clenov deklarovanych anotacii.
 */
public class MojaAnotacia4_Reflection1 {

	@MojaAnotacia4()
	public static void myMethod() {
		
		MojaAnotacia4_Reflection1 obj = new MojaAnotacia4_Reflection1();
		
		// ziskanie anotacie tejto metody
		// a zobrazenie hodnot jej clenov
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("myMethod");
			MojaAnotacia4 ma = m.getAnnotation(MojaAnotacia4.class);
			System.out.println(ma.s() + " " + ma.val());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myMethod();
	}
}
