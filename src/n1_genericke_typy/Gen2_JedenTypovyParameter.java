package n1_genericke_typy;
/*
 * Jednoducha genericka trieda.
 * Tu je T typovy parameter, ktory bude nahradeny skutocnym
 * typov v momente vytvarania objektu typu Gen.
 */
class Gen<T> {
	T obj;			//deklaracia objektu typu T
	
	Gen(T o) {		//predanie odkazu na objekt typu T konstruktoru triedy
		obj = o;
	}
	
	T getObj() {	//getter - vratenie objektu 'obj'
		return obj;
	}
	
	//zobrazenie typu T
	void showType() {
		System.out.println("T je typu " + obj.getClass().getSimpleName());	//alebo 'getName();'
	}
}

/**
 * Tato trieda demonstruje jednoduche vyuzitie generickej triedy.
 */
public class Gen2_JedenTypovyParameter {
	public static void main(String[] args) {
		
		//vytvorenie odkazu typu Gen pre cele cisla
		Gen<Integer> ob;
		
		/*
		 * Vytvorenie objektu Gen<Integer> a priradenie odkazu na tento objekt
		 * premennej ob. Vid pouzitie autoboxingu k zapuzdreniu hodnoty 88 do
		 * objektu typu Integer.
		 */
		ob = new Gen<>(8);	//bez autoboxingu je to 'new Gen<>(new Integer(8));'
		
		//zobrazenie typu dat vyuzivaneho premennou ob
		ob.showType();
		
		/*
		 * Nacitanie hodnoty premennej 'ob'.
		 * Vid, ze nie je potrebne ziadne pretypovanie.
		 */
		int val = ob.getObj();
		System.out.println("Hodnota ob je: " + val);
		System.out.println();
		
		//vytvorenie objektu typu Gen pre typ String
		Gen<String> ob2 = new Gen<>("Test prace s generickou triedou.");
		
		//zobrazenie typu dat vyuzivaneho premennou ob2
		ob2.showType();
		
		/*
		 * Nacitanie hodnoty premennej 'ob2'.
		 * Vid, ze opat nie je potrebne pretypovanie.
		 */
		String val2 = ob2.getObj();
		System.out.println("Hodnota ob2 je: " + val2);
	}
}
