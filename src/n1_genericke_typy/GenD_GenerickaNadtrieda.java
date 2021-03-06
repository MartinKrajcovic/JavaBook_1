package n1_genericke_typy;
/**
 * Genericka trieda - rodic
 */
class GenParent<T> {
	T obj;					//deklaracia objektu typu T
	
	/*
	 * Predanie odkazu na objekt
	 * typu T konstruktoru triedy.
	 */
	GenParent(T o) {
		obj = o;
	}
	
	T getObj() {			//vratenie objektu obj
		return obj;
	}
}

/**
 * Genericka trieda - dedic od generickej triedy,
 * ktory definuje druhy typovy parameter V.
 */
class GenHier<T, V> extends GenParent<T> {
	V obj2;
	
	GenHier(T o1, V o2 ) {
		super(o1);			//volanie konstruktora predka
		obj2 = o2;
	}
	
	V getObj2() {
		return obj2;
	}
}

/**
 * Ukazka prace s generickou podtriedou
 */
public class GenD_GenerickaNadtrieda {
	public static void main(String[] args) {
		
		//vytvorenie objektu GenHier
		GenHier<String, Integer> x = new GenHier<>("Textova hodnota", 99);
		
		System.out.println("Hodnota obj1: " + x.getObj());
		System.out.println("Hodnota obj2: " + x.getObj2());	
	}	
}
