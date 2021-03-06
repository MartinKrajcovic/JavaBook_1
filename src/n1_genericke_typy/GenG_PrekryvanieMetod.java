package n1_genericke_typy;

class GG<T> {
	T obj;
	
	GG(T o) {
		obj = o;
	}
	
	T getObj() {
		System.out.print("Metoda getObj() triedy GG: ");
		return obj;
	}
}

class GH<T> extends GG<T> {
	GH(T o) {
		super(o);
	}
	
	@Override
	T getObj() {
		System.out.print("Metoda getObj() triedy GH: ");
		return obj;	//vracia obj - referencia na objekt typu T (typovy argument tejto triedy)
	}
}

public class GenG_PrekryvanieMetod {
	public static void main(String[] ar) {
		
		GG<Integer> obj1 = new GG<>(66);
		GH<Integer> obj2 = new GH<>(77);
		GH <String> obj3 = new GH<>("Aa");
		
		System.out.println(obj1.getObj());
		System.out.println(obj2.getObj());
		System.out.println(obj3.getObj());	
	}	
}
