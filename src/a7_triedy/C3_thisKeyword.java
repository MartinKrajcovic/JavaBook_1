package a7_triedy;

public class C3_thisKeyword {

	private String name;				//atribut meno
	private int age;					//atribut vek
	
	/**
	 * Tato metoda je pristupovou metodou pre skryty atribut, reprezentujuci meno niekoho, niecoho.
	 * Metoda aktualizuje premennu triedy na hodnotu vlozenu do parametra tejto pristupovej metody.
	 * @param name - retazec reprezentujuci meno, ktory v programe odovzdavame funkcii.
	 */
	public void setName(String name) {
		this.name = name;	//priradenie hodnoty premennej z parametru do sukromneho atributu triedy
	}
	
	/**
	 * Tato metoda je pristupovou metodou pre skryty atribut, reprezentujuci meno niekoho, niecoho.
	 * Metoda nam vracia sukromny atribut tejto triedy pre informativne pouzitie v programe.
	 * @return name - hodnotu sukromnej premennej, ktorej hodnota bola nastavena setterom.
	 */
	public String getName() {
		return name;		//ziskanie hodnoty premennej (to iste ako 'this.name')
	}
	
	
	public void setAge(int age) {
		/*Java umoznuje aby sa lokalne premenne volali rovnako ako atributy. Pre zprehladnenie
		  a pochopenie vzdy kvalifikujeme atribut klucovim slovom 'this', ktory hovory o tom,
		  ze dana premenna patri tejto triede. Programatory tak mozu pomenovat lokalnu premennu
		  (premennu v parametri) rovnako ako je pomenovana premenna v triede. Programatori, si 
		  tak usetria dalsiu pracu s vymyslanim adekvatneho nazvu, charakteristicky v podstate
		  rovnakej premennej.*/
		this.age = age;			//premennej age (tejto triedy) sa priradi hodnota premennej age (metody)
	}
	
	public int getAge() {
		/*Java ma vyspelu vlastnost dohadzovat kvalifikator 'this', tam kam ho treba.
		  Pri getteroch je jasne, (pokial neprijmaju ziadne argumenty) ze sa odkazujeme na
		  atribut tejto triedy, tak ho tam netreba pisat. Technicky ho netreba uvadzat ani
		  pri setteroch, no tak sa nam len program zneprehladni. Je dobre ho tam pisat, pokial
		  pomenovavame rovnako atributy a lokalne premenne.*/
		return age;
	}
}

