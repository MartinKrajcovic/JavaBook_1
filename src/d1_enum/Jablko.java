package d1_enum;
// * Vycet * je cesky vyraz, neviem to prelozit, tak to bude takto.
/* 
 * Vycet (zoznam konstant) sa vytvara pomocou klucoveho slova enum.
 * Identifikatorom ako je "Johnatan", "GoldenDel" a pod. sa hovori
 * vyctove konstanty. Kazda z nich je implicitne deklarovana ako
 * public static final a su clenmi triedy Jablko.
 * 
 * Akonahle nadefinujeme vycet, mozeme vytvarat premenne daneho typu.
 * Aj ked vycty definuju typ triedy, nie je mozne vytvorit instanciu
 * typu enum pomocou operatora new. Namiesto toho deklarujeme a
 * pouzivame vyctovu premennu prakticky rovnakym sposobom akym
 * deklarujeme a pouzivame premennu primitivneho typu.
 * 
 * (Vid trieda J) :
 * Ked ze "apple" je typu Jablko jedine hodnoty, ktore mozu byt tejto
 * premennej priradene su definovane samotnym vyctom (zoznzamom konst.).
 */
public enum Jablko {
	Johnatan,
	GoldenDel,
	RedDel,
	Winesap,
	Cortland
}

class J {
	Jablko apple;
	
	//napriklad prikaz v metode priradzuje premennej apple hodnotu RedDel
	public void assign() {
		
		//Vsimnime si ze pred symbolom RedDel je uvedene Jablko
		apple = Jablko.RedDel;
		
		/*
		 * K porovnaniu dvoch vyctovych konstant je mozne pouzit operator
		 * rovnosti ==, aby sme zistili, ci su hodnoty vyctu zhodne.
		 */
		if (apple == Jablko.Cortland)
			System.out.println("apple ma hodnotu Cortland");
	}
	//vycet je mozne pouzit aj v prikaze switch, ktory bude prechadzat
	//jednotlive konstanty, na ktore sa uz netreba odkazovat staticky
}
