package a7_triedy;
/**
 * Tato trieda reprezentuje zakladnu strukturu kazdej triedy.
 * Demonstruje priblizne v akom poradi by mali byt dane prvky
 * definovane a akym sposobom na co vyuzite.
 */
public class C2_structure {

	//SUKROMNE ATRIBUTY (PREMENNE)
	/*Kazda trieda, by mala mat svoje atributy skryte pred ostatnymi triedami*/
	private int variable1;		
	public long variable2;		//porusuje princip zapuzdrenia
	
	
	//PRISTUPOVE METODY K SUKROMNYM ATRIBUTOM
	/*Kazda trieda, by mala mat svoje pristupove metody, ktorymi vie manipulovat
	  svoje skryte atributy. Tieto metody by mali byt verejne, pokial chceme, aby
	  sa dali v programe objektami tejto triedy pouzit.*/
	public void setVariable1(int var) {
		variable1 = var;					//nastavenie sukromnej premennej
	}
	
	public int getVariable1() {
		return variable1;					//ziskanie hodnoty sukromnej premennej
	}
	
	
	//METODY, KTORE SU SPECIFICKE PRE TUTO TRIEDU, ALEBO INE
	/*Kazda trieda moze mat definovane vseobecne metody, ktore budu dedit vsetci
	  jej potomkovia. Tieto metody by mali byt verejne, pokial chceme, aby sa dali
	  v programe objektami tejto triedy pouzit.*/
	public void convert() {
		//nieco
	}
	
	
	//KONIEC, PRIPADNE HLAVNA FUNKCIA
		/*hlavna funkcia je vacsinou
		 umiestnena do samotnej triedy*/
	public static void main(String[] args) { }
}
