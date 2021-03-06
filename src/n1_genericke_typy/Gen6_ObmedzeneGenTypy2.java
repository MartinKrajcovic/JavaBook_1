package n1_genericke_typy;
/**
 * V tejto verzii programu musi byt typovy argument
 * triedy Stats2, ktory bude predavany typovemu parametru T,
 * bud typu Number, alebo typom akejkolvek triedy odvodenej
 * od triedy Number.
 * @param <T>
 */
class Stats2<T extends Number> {
	T[] obj;		//pole triedy Number, ci podtriedy
	
	/*
	 * Predanie odkazu na pole typu Number,
	 * ci podtriedy konstruktoru triedy
	 */
	Stats2(T[] o) {
		obj = o;
	}
	
	double average() {		//vratenie typu double vo vsetkych pripadoch
		double sum = 0.0;
		for (int i=0; i<obj.length; i++) {
			sum += obj[i].doubleValue();
		}
		return sum/obj.length;
	}
}

/**
 * Ukazka prace s triedou Stats2.
 */
public class Gen6_ObmedzeneGenTypy2 {
	public static void main (String[] args) {
		
		Integer[] inums = {1, 2, 3, 4, 5};
		Stats2<Integer> iOb = new Stats2<>(inums);
		double v = iOb.average();
		System.out.println("Priemerna hodnota pola inums je " + v);
		
		Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats2<Double> dOb = new Stats2<>(dnums);
		v = dOb.average();
		System.out.println("Priemerna hodnota pola dnums je " + v);
		
		/*
		 * Nizsie uvedeny kod sa ani neskompiluje
		 * pretoze trieda String nie je podtriedou
		 * triedy Number.
		 */
//		String[] snums = {"1", "2", "3", "4", "5"};
//		Stats2<String> strOb = new Stats2<>(snums);
//		v = strOb.average();
//		System.out.println("Priemerna hodnota pola snums je " + v);
	}
}

