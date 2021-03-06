package n1_genericke_typy;
/**
 * Tato trieda je z funkcneho hladiska ekvivalentom
 * triedy 'Gen' ale na rozdiel od nej nevyuziva genericke typy.
 */
class NonGen {
	Object obj;
	
	NonGen(Object o) {	//predanie odkazu na objekt typu Object konstruktoru triedy
		obj = o;
	}
	
	Object getObj() {	//vratenie typu Object
		return obj;
	}
	
	void showType() {	//zobrazenie typu premennej obj
		System.out.println("Premenna je typu " + obj.getClass().getSimpleName());
	}	
}
/**
 * Ukazka vyuzitia negenerickej triedy.
 */
public class Gen3_TypovaBezpecnost {
	public static void main(String[] args) {
		NonGen ob;
		
		/*
		 * Vytvorenie objektu typu NonGen a ulozenie objektu
		 * typu Integer do tohoto objektu.
		 * K autoboxingu dochadza aj v tomto pripade.
		 */
		ob = new NonGen(88);
		ob.showType();		//zobrazenie typu dat ulozenych do 'ob'
	
		int i = (Integer) ob.getObj();	//teraz je nutne pretypovanie
		System.out.println("Hodnota premennej ob je " + i);
		System.out.println();
		
		/*
		 * Vytvorenie objektu typu NonGen a ulozenie objektu
		 * typu String do tohoto objektu.
		 */
		NonGen ob2 = new NonGen("Toto je odkaz na String");
		ob2.showType();		//zobrazenie typu dat ulozenych do 'ob2'
		
		String s = (String) ob2.getObj();//aj tu je nutne pretypovanie
		System.out.println("Hodnota premennej ob2 je '" + s + "'");
		
		/*
		 * Nasledujuci kod sa skompiluje ale z
		 * koncepcneho hladiska je zly!
		 * V druhom kode pride k chybe Runtime.
		 */
		ob = ob2;					// priradenie objektu s odkazom na String objektu odkazu na Integer
		i = (Integer) ob2.getObj();	// pokus o priradenie retazca do celociselnej premennej
	}
}
