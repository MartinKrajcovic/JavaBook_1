package n1_genericke_typy;
/**
 * Jednoducha genericka trieda s dvoma typovymi parametrami T a V.
 * @param <T>
 * @param <V>
 */
class TwoGen<T, V> {	//ak chceme zadat viac typovych parametrov, pouzivame zoznam typov oddelenych ciarkami
	T obj1;
	V obj2;
	
	/*
	 * Predanie odkazu na objekt typu T a
	 * objekt typu V konstruktoru triedy.
	 */
	TwoGen(T o1, V o2) {	
		obj1 = o1;
		obj2 = o2;
	}
	
	T getObj1() {	
		return obj1;
	}
	
	V getObj2() {
		return obj2;
	}
	
	void showType() {	//zobrazenie typov T a V
		System.out.println("Premenna obj1 je typu " + obj1.getClass().getSimpleName());
		System.out.println("Premenna obj2 je typu " + obj2.getClass().getSimpleName());
	}
}

/**
 * Ukazka prace s triedou TwoGen
 */
public class Gen4_DvaTypoveParametre {
	public static void main(String[] args) {
		
		//vytvorenie objektu triedy TwoGen -> musia byt predane dva typove argumenty ako pri deklaracii triedy
		TwoGen<Integer, String> ob = new TwoGen<>(88, "Retazec");
		
		//zobrazenie typov
		ob.showType();
		
		//nacitanie a zobrazenie hodnot
		int i = ob.getObj1();
		System.out.println("Hodnota premennej obj1 je " + i);
		
		String s = ob.getObj2();
		System.out.println("Hodnota premennej obj2 je " + s);
	}
}
