package n1_genericke_typy;
/*
 * V tomto kode je vytvorene rozhranie, ktore ma definovane
 * metody min() a max(), od ktorych sa ocakava, ze vratia
 * minimum a maximum nejakej sady objektov.
 */
interface MinMax <T extends Comparable<T>> {
	T min();
	T max();
}
/**
 * V tomto pripade je parameter T s hornym obmedzenim Comparable,
 * co je rozhranie definovane v balicku java.lang. Trieda, ktora
 * implementuje rozhranie Comparable definuje objekty, ktore mozu
 * byt radene. Z toho vyplyva, ze rozhranie MinMax bude mozne pouzit
 * iba pre objekty, ktore mozu byt radene a porovnavane.
 * 
 * Kedze rozhranie MinMax vyzaduje typ implementujuci rozhranie
 * Comparable, implementujuca trieda musi specifikovat zhodne obmedzenie.
 * Naviac plati, ze pokial je toto obmedzenie raz definovane, nie je nutne
 * ho specifikovat v klauzuli implements.
 */
public class GenB_GenerickeRozhrania<T extends Comparable<T>> implements MinMax<T> {
	T[] values;
	
	public GenB_GenerickeRozhrania(T[] vals) {
		this.values = vals;
	}
	
	@Override
	public T min() {
		T v = values[0];	//inicializacia objektu v na hodnotu prveho prvku pola
		
		for (int i=0; i<values.length; i++) {
			if (values[i].compareTo(v) < 0)		//ak je vysledok porovnania hodnot objektu v poli a objektu v zaporny
				v = values[i];					//t.j. ak je objekt v poli mensi ako objekt v, tak sa do objektu v priradi
		}										//hodnota objektu v poli
		return v;
	}
	
	@Override
	public T max() {
		T v = values[0];
		
		for (int i=0; i<values.length; i++) {
			if (values[i].compareTo(v) > 0)		//ak je vysledna hodnota kladna, tak hodnota objektu v poli je vacsia
				v = values[i];					//-> v sa prepise na tuto (vacsiu) hodnotu
		}
		return v;
	}

	public static void main(String[] args) {
		Integer inums[] = {3, 6, 2, 8, 6, 9, 7};
		Character chs[] = {'b', 'r', 'w', 'p', 's', 'c'};
		
		GenB_GenerickeRozhrania<Integer> obj1 = new GenB_GenerickeRozhrania<>(inums);
		GenB_GenerickeRozhrania<Character> obj2 = new GenB_GenerickeRozhrania<>(chs);
		
		System.out.println("Max pre pole inums: " + obj1.max());
		System.out.println("Min pre pole inums: " + obj1.min());
		
		System.out.println("Max pre pole chs:   " + obj2.max());
		System.out.println("Min pre pole chs:   " + obj2.min());	
	}
}
