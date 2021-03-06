package n1_genericke_typy;
/**
 * Ukazka pouzitia suroveho typu.
 */
class G<T> {
	T obj;			//deklaracia objektu typu T
	
	G(T o) {		//predanie odkazu na objekt typu T konstruktoru triedy
		obj = o;
	}
	
	T getObj() {	//vratenie objektu obj
		return obj;
	}
}
/**
 * Praca so surovym typom.
 */
public class GenC_RawTypes_a_LegacyKod {

	/*
	 * Kedze podpora generickych typov bola zavedena az v JDK 5, bolo nevyhnutne
	 * pripravit aj nejaku prechodnu cestu zo stareho kodu vytvoreneho v dobe pred
	 * zavedenim generickych typov. Kod vytvoreny v dobe pred zavedenim generickych
	 * typov musi byt schopny pracovat s kodom vytvorenym v dobe pred zavedenim
	 * generickych typov.
	 * A prave kvoli otazke prechodu ku generickym typom Java umoznuje pouzivanie
	 * generickych tried bez akychkolvek typovych argumentov. Takto vlastne vznika
	 * surovy typ triedy. Tento surovy typ je kompatibilny s Legacy kodom, ktory
	 * genericke typy vobec nepozna.
	 * Zakladnou nevyhodou pouzivania surovych typov je, ze dochadza k strate
	 * ich typovej bezpecnosti.
	 */
	
	public static void main(String[] args) {
		
		//vytvorenie objektu typu G pre typ Integer
		G<Integer> iOb = new G<>(88);
		
		//vytvorenie objektu typu G pre typ String
		G<String> strOb = new G<>("Objekt typu String");
		
		//vytvorenie suroveho objektu typu G a priradenie hodnoty typu Double
		G raw = new G(new Double(98.6));
		
		/*
		 * V tomto pripade je nutne explicitne pretypovanie
		 * pretoze typ nie je znamy.
		 */
		double rawVal = (Double) raw.getObj();
		System.out.println("Hodnota: " + rawVal);
		
		/*
		 * Pouzitie surovych typov moze ale viest k behovym chybam.
		 * Nizsie nasleduje niekolko prikladov.
		 */
		
		//nasledujuce pretypovanie vedie k behovej chybe
		int i = (Integer) raw.getObj(); 	// behova chyba
		
		//toto priradenie obchadza typovu bezpecnost
		strOb = raw;	// kod OK, ale potencialne chybny
		
		//toto priradenie tiez obchadza typovu bezpecnost
		raw = iOb;		// kod OK, ale potencialne chybny
		rawVal = (Double) raw.getObj();		// behova chyba
	}
}
