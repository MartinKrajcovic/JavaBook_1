package n1_genericke_typy;
/*
 * V Jave je mozne, aby negenericka trieda bola
 * nadtriedou generickej podtriedy.
 */
class Non_Gen {
	int i;
	
	Non_Gen(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
}

/*
 * Kedze trieda rodicovska trieda nie je genericka, nie je specifikovany
 * ziaden typovy parameter. Aj ked dcerska trieda deklaruje typovy
 * parameter T, trieda Non_Gen ho nepotrebuje a ani ho nedokaze vyuzit.
 * To znamena, ze trieda GenE_GenerickaPodtrieda dedi triedu Non_Gen
 * celkom standardnym sposobom.
 */
public class GenE_GenerickaPodtrieda<T> extends Non_Gen {
	T o;			//deklaracia objektu typu T
	
	GenE_GenerickaPodtrieda(T o, int i) {
		super(i);	//volanie konstruktora predka a predavanie hodnoty
		this.o = o;	//predanie odkazu na objekt typu T
	}
	
	public T getO() {
		return o;
	}
	
	public static void main(String[] args) {
		
		//vytvorenie objektu triedy GenE_GenerickaPodtrieda pre typ String
		GenE_GenerickaPodtrieda<String> object = new GenE_GenerickaPodtrieda<>("Nieco", 74);
		System.out.println("hodnota 1 - " + object.getO());
		System.out.println("hodnota 2 - " + object.getI());
	}
	
}
