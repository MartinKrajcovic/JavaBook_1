package b3_obalovane_typy;
/**
 * Tato trieda demonstruje moznost konverzie textovych retazcov
 * na hodnoty primitivnych datovych typov.
 */
public class X_Conversion2 {
	/*
	 * Pokial mame textovy retazec, z ktoreho potrebujeme ziskat hodnotu primitivneho
	 * typu pre nejaky vypocet a pod. obalovane typy tyhto primitivnych datovych typov
	 * maju rovnako ako objekt String pretazenu metodu 'valueOf()', ktora vie previest
	 * retazec na objekt reprezentujuci pozadovany typ.
	 * 
	 * Vysledkom tejto funkcie je objekt a prekladac nam nehlasi ziadnu chybu, pretoze
	 * Obalujuce typy podporuju Autoboxing a Unboxing. 
	 * 
	 * Pokial vsak chceme ziskat uz priamo hodnotu, ktoru obalovany typ (objekt)
	 * obsahuje, nakoniec mozeme zavolat metodu 'typValue()'
	 */
	public static void main(String[] args) {
		
		String number = "46";
		int targetNumber = Integer.valueOf(number);		//unboxing
		System.out.println(targetNumber);
		
		String logic = "true";
		boolean targetLogic = Boolean.valueOf(logic);	//unboxing
		System.out.println(targetLogic);
		
		
		double floating  = Double.valueOf("67");
		double floating2 = Double.valueOf("50").doubleValue();
		System.out.println(floating);		//objekt
		System.out.println(floating2);		//primitivny typ
	}
	
}
