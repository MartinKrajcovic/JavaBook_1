package e1_anotacie_metadata;

import java.lang.reflect.Method;

public class MojaAnotacia2_Reflection1 {

	//anotacia metody
	@MojaAnotacia2(str = "Priklad anotacie.", val = 120)
	public static void myFunction() {
		
		MojaAnotacia2_Reflection1 obj = new MojaAnotacia2_Reflection1();
		
		/* Nacitanie anotacie tejto metody a zobrazenie hodnot jej clenov */
		try {
			//najprv je nutne ziskat objekt typu Class predstavujuci tuto triedu
			Class<?> c = obj.getClass();
			
			//teraz je mozne nacitat objekt typu Method predstavujuci danu metodu
			Method m = c.getMethod("myFunction");
			
			//potom je mozne nacitat anotacie tejto metody
			MojaAnotacia2 a = m.getAnnotation(MojaAnotacia2.class);
			
			//a nakoniec je mozne ziskane hodnoty zobrazit
			System.out.println(a.str() + " " + a.val());
		} catch (NoSuchMethodException e) {
			System.err.println("Dana metoda nebola najdena.");
		}
	}
	
	public static void main(String[] args) {
		myFunction();
	}
}
