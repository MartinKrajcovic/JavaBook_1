package e1_anotacie_metadata;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MojaAnotacia2(str = "Prva anotacia triedy.", val = 45)
@MojaAnotacia3(description = "Druha anotacia triedy.")
public class MojaAnotacia2_Reflection3 {
	
	@MojaAnotacia2(str = "Prva anotacia metody.", val = 6)
	@MojaAnotacia3(description = "Druha anotacia metody.")
	public static void myFunction() {
		
		MojaAnotacia2_Reflection3 obj = new MojaAnotacia2_Reflection3();
		Class<?> c = obj.getClass();
		
		try {
			
			Annotation[] a = c.getAnnotations();
			
			System.out.println("Vsetky anotacie triedy: ");
			for (Annotation a2 : a) {
				System.out.println(a2);
			}
			System.out.println();
			
			System.out.println("Vsetky anotacie metody: ");
			Method m = c.getMethod("myFunction");
			
			a = m.getAnnotations();
			
			for (Annotation a2 : a) {
				System.out.println(a2);
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myFunction();
	}
	
}