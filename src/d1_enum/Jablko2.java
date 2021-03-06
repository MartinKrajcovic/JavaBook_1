package d1_enum;
/*
 * Uz je zname, ze z vyctu nie je mozne vytvorit objekt pomocou operatora new.
 * Avsak v ostatnych ohladoch sa enum sprava ako kazda ina trieda. Napriklad
 * aj vycet moze mat konstruktor, vlastne premenne instancie, ci metody a
 * dokonca mozu implementovat aj rozhrania.
 * Kazda vyctova konstana je objektom svojho vyctoveho typu.
 * To znamena, ze pokial vytvorime konstruktor, tak sa bude volat pri vytvarani
 * kazdej vyctovej konstanty samostatne.
 */
public enum Jablko2 {
	/*
	 * Premenna cena, definuje cenu kazdej vyctovej konstanty osobitne, kedze
	 * kazdy z tyhto objektov ma vlastnu premennu instancie.
	 */
	Johnatan(10),
	GoldenDel(9),
	RedDel(12),
	Winesap(15),
	Cortland(8);

	//premenna
	private int price;
	
	//konstruktor
	/*
	 * Konstruktor moze byt v tomto pripade uplne kludne pretazeny.
	 * Mozeme pridat konstruktor, ktory bude bezparametricky a bude nastavovat
	 * cenu kazdeho typu jablka na -1, cim bude jasne, ze nema priradenu realnu
	 * cenu.
	 */
	Jablko2(int p){ 
		price = p; 
	}
	
	
	//getter
	public int getPrice() { return price; }
	
}
