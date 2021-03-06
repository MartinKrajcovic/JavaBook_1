package e1_anotacie_metadata;

import java.lang.reflect.Method;

public class MojaJednoclennaAnotacia_Test {
	
		@MojaJednoclennaAnotacia("Priamo zadana hodnota.")
		public static void myMethod() {
			
			MojaJednoclennaAnotacia_Test obj = new MojaJednoclennaAnotacia_Test();
			
			try {
				Class<?> c = obj.getClass();
				Method m = c.getMethod("myMethod");
				MojaJednoclennaAnotacia mja = m.getAnnotation(MojaJednoclennaAnotacia.class);
				System.out.println(mja.value());
			} catch(NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			myMethod();
		}
	}