package b1_abstraktne_triedy;
/**
 * Tato trieda demonstruje vlastnosti abstraktnych tried.
 */
public abstract class AC2_structure {		//predstav si, ze tato trieda definuje zamestnanca firmy
//ATRIBUTY	
	private String name;
	private int identificationNumber;
	
		AC2_structure() { }					//konstruktor, no vytvorenie objektu nie je mozne
		
	//SETTER PRE MENO	
		public void setName(String name) {
			this.name = name;
		}
	//GETTER PRE MENO	
		public String getName() {
			return name;
		}
	//SETTER PRE ID	
		public void setID(int identificationNumber) {
			this.identificationNumber = identificationNumber;
		}
	//GETTER PRE ID	
		public int getID() {
			return identificationNumber;
		}
		
	//ABSTRAKTNA METODA BEZ DEFINICIE	
	/*
	 * Kazda abstraktna trieda, musi obsahovat aspon jednu abstraktnu metodu (bez definicie),
	 * aby bola abstraktna.
	 * POZOR - na uvadzanie klucovych slov 'abstract'
	 */
		public abstract void work();	/* Trieda, ktora zdedi vlastnosti tejto abstraktnej triedy, bude
		 								  musiet tuto metodu prepisat (prekryt) */
}
