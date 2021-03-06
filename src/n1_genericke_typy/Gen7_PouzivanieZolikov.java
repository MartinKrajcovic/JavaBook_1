package n1_genericke_typy;
/**
 * Pouzitie zolika (zastupneho argumentu).
 * Zolik predstavuje neznamy typ.
 */
class Stats3<T extends Number> {
	T[] number;	//pole typu Number, alebo podtriedy
	/*
	 * Predanie odkazu na pole typu Number, alebo podtriedy
	 */
	Stats3(T[] n) {
		this.number = n;
	}
	/*
	 * Vratenie typu double vo vsetkych pripadoch
	 */
	double average() {
		double sum = 0.0;
		for (int i=0; i<number.length; i++) {
			sum += number[i].doubleValue();
		}
		return sum/number.length;
	}
	/*
	 * Tato metoda pouziva zolika ako typovy argument predavaneho objektu do parametru tejto metody.
	 * Vdaka tomu, mozeme porovnavat hodnoty vsetkych objektov typu Stats3, avsak iba tych ciselnych,
	 * ktore dedia od triedy Number, ako je ohranicene pri deklaracii triedy Stats3.
	 * 
	 * Vysledok funkcie je true, ked sa volajuci objekt zhoduje s volanym objektom.
	 * To zabezpecuje zolik -> akykolvek objekt typu Number alebo jeho podtriedy bude platny.
	 */
	boolean sumAvg(Stats3<?> obj) {	//zistenie, ci su parametre dvoch roznych objektov rovnake
		if (average() == obj.average())
			return true;
		return false;
	}
}
/**
 * Ukazka prace so zolikom (zastupnym argumentom)
 */
public class Gen7_PouzivanieZolikov {
	public static void main(String[] args) {
		double val;
		
		Integer[] iNums = {1, 2, 3, 4, 5};
		Stats3<Integer> iOb = new Stats3<>(iNums);
		val = iOb.average();
		System.out.println("Priemerna hodnota pola iNums je " + val);
		
		Float[] fNums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
		Stats3<Float> fOb = new Stats3<>(fNums);
		val = fOb.average();
		System.out.println("Priemerna hodnota pola fNums je " + val);
		
		Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats3<Double> dOb = new Stats3<>(dNums);
		val = dOb.average();
		System.out.println("Priemerna hodnota pola dNums je " + val);
			
		/*
		 * Zistenie, ktore z poli objektov
		 * maju zhodny priemer.
		 */
		System.out.print("Priemery poli iOb a fOb ");
		if (iOb.sumAvg(fOb))
			System.out.println("su zhodne.");
		else
			System.out.println("su odlisne.");
		
		System.out.print("Priemery poli iOb a dOb ");
		if (iOb.sumAvg(dOb))
			System.out.println("su zhodne");
		else
			System.out.println("su odlisne");
		
		System.out.print("Priemery poli fOb a dOb ");
		if (fOb.sumAvg(dOb))
			System.out.println("su zhodne.");
		else
			System.out.println("su odlisne.");
	}
}
