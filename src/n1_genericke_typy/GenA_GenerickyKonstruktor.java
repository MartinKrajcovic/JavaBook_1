package n1_genericke_typy;

public class GenA_GenerickyKonstruktor {
	private double val;
	/**
	 * Genericky konstruktor, prijma akykolvek objekt
	 * ciselneho typu.
	 * @param x
	 */
	<T extends Number> GenA_GenerickyKonstruktor(T x) {
		val = x.doubleValue();
	}
	
	public void showVal() {
		System.out.println("Hodnota objektu: " + val);
	}
	
	
	public static void main(String[] args) {
		int a = 100;
		float b = 123.5F;
		double c = 3.14159;
		
		GenA_GenerickyKonstruktor obj1 = new GenA_GenerickyKonstruktor(a);	// autoboxing (Integer)
		GenA_GenerickyKonstruktor obj2 = new GenA_GenerickyKonstruktor(b);	// autoboxing (Float)
		GenA_GenerickyKonstruktor obj3 = new GenA_GenerickyKonstruktor(c);	// autoboxing (Double)
		
		obj1.showVal();
		obj2.showVal();
		obj3.showVal();
	}
}
