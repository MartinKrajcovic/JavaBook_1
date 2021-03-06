package n1_genericke_typy;
/*
 * POROVNAVANIE TYPOV V RAMCI GENERICKEJ HIERARCHIE V DOBE BEHU :
 */
class GenClass<T> {
	T obj;
	
	GenClass(T o) {
		obj = o;
	}
	
	T getObj() {
		return obj;
	}
}

class GenClass2<T> extends GenClass<T> {
	GenClass2(T o) {
		super(o);
	}
}

public class GenF_PorovnavanieTypov {
	public static void main(String[] args) {
		
		GenClass <Integer> obj1 = new GenClass <>(45);
		GenClass2<Integer> obj2 = new GenClass2<>(55);
		GenClass2<String>  obj3 = new GenClass2<>("s");
		
		if (obj2 instanceof GenClass2<?>)
			System.out.println("obj2 je instanciou triedy GenClass2");
		if (obj2 instanceof GenClass<?>)	//toto vrati true, pretoze obj2 je nejaka forma triedy GenClass
			System.out.println("obj2 je instanciou triedy GenClass");
			System.out.println();
			
		if (obj3 instanceof GenClass2<?>)
			System.out.println("obj3 je instanciou triedy GenClass2");
		if (obj3 instanceof GenClass<?>)
			System.out.println("obj3 je instanciou triedy GenClass");
			System.out.println();
		
		if (obj1 instanceof GenClass<?>)
			System.out.println("obj1 je instanciou triedy GenClass");
		if (obj1 instanceof GenClass2<?>)
			System.out.println("obj1 je instanciou triedy GenClass2");
		else
			System.out.println("obj1 nie je instanciou triedy GenClass2");
			System.out.println();
		
		/*
		 * Nasledujuci prikaz nemoze byt skompilovany, pretoze
		 * v dobe behu neexistuju informacie o generickom type.
		 */
//		if (obj2 instanceof GenClass2<Integer>)
//			System.out.println("obj2 je instanciou triedy GenClass2");
		
		
		/* JEDNU INSTANCIU GENERICKEJ TRIEDY JE MOZNE PRETYPOVAT NA DRUHU POD PODMIENKOU,
		 * ZE TIEDO DVE INSTANCIE SU KOMPATIBILNE A ICH TYPOVE ARGUMENTY SU ZHODNE !!! */
		
		System.out.println(obj1.getObj());
		obj1 = (GenClass<Integer>) obj2;
		System.out.println(obj1.getObj());
	}
}
