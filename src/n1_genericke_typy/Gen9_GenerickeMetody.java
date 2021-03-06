package n1_genericke_typy;
/**
 * Tato trieda demonstruje pouzitie statickej generickej metody
 */
public class Gen9_GenerickeMetody {
/**
 * Tato genericka metoda ma dva vlastne typove parametre.
 * Cielom metody je zistit, ci dany objekt je clenom pola.
 * Tato metoda moze byt pouzita s lubovolnym typom objektu
 * a pola za podmienky, ze pole obsahuje objekty kompatibilne
 * s typom hladaneho objektu.
 * @param x - je akykolvek objekt
 * @param y - je pole objektov, ktore musi byt typu x alebo jeho podtyp
 * @return true - ak sa v danom poli (y) nachadza objekt typu (x)
 */
	public static <T, V extends T> boolean isIn(T x, V[] y) {	//genericka metoda s obmedzenym typovym parametrom V
		for (int i=0; i<y.length; i++) {
			if (y[i].equals(x)) 			//porovnanie objektu s objektom pola
				return true;
		}
			return false;
	}
	
	public static void main(String[] args) {
		
		//pouzitie metody isIn() pre objekty typu Integer
		Integer nums[] = {1, 2, 3, 4, 5};
		if (isIn(2, nums))
			System.out.println("Cislo 2 je v poli nums");
		if (!isIn(7, nums))
			System.out.println("Cislo 7 nie je v poli nums");
		System.out.println();
		
		
		//pouzitie metody isIn() pre objekty typu String
		String snums[] = {"jeden", "dva", "tri", "styri", "pat"};
		if (isIn("tri", snums))
			System.out.println("Retazec tri je v poli snums");
		if (!isIn("sedem", snums))
			System.out.println("Retazec sedem nie je v poli snums");
		System.out.println();
	}
	
	/*
	 * Typy argumentov su rozpoznavane automaticky a typy T a V su im prisposobene.
	 * Na 28. riadku je prvy argument metody typu Integer (to vdaka autoboxingu),
	 * co znamena, ze typovy parameter T je nahradeny typom Integer. Zakladny typ
	 * druheho argumentu je tiez Integer, vdaka comu je aj typovy parameter V
	 * nahradeny typom Integer.
	 * 
	 * Tato schopnost vynutit typovu bezpecnost je jednou z najdolezitejsich
	 * vyhod generickych metod.
	 */
}
