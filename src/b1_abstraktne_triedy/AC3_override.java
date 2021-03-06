package b1_abstraktne_triedy;

public class AC3_override extends AC2_structure {	//predstav si, ze tato trieda definuje oddelenie
	
	AC3_override() { }
	AC3_override(String name) { setName(name); }
	
	/*
	 * Ako je nizsie uvedene, musime prepisat metody work() z rodicovskej abstraktnej triedy
	 * (AC2_structure), aby sme konkretizovali vykonavanu pracu zamestnancom, ktory pracuje
	 * na tomto oddeleni. Je jasne, ze uctovnik bude mat inu napln prace ako technik.
	 * 
	 * Prekryvanie/prepisovanie metod sa vyznacuje anotaciou '@Override' a potom nasim
	 * vlastnym definovanim tela prekryvanej metody.
	 */
	@Override				//anotacia
	public void work() {	//definovanie tela metody
		System.out.println("Zamestnanec " + this.getName() + " zacal pracovat.");
	}
	
	/*
	 * Da sa este jedna vec. Pokial nam nevyhovuje aka kolvek metoda, ktora nie je deklarovana
	 * ako 'final' v nasej rodicovskej triede, tak je mozne prepisat a prisposobit si aj ine
	 * metody.
	 */
	@Override
	public String getName() {
		return (super.getName()+"*"); /*Klucove slovo 'super' ma rovnaky vyznam ako klucove slovo 'this'
		 								avsak 'super' poukazuje nie na tuto triedu, ale triedu predka.*/
	}
	
	public static void main(String[] args) {
		AC3_override employee = new AC3_override("Martin");
		employee.work();
		employee.getName();
	}
	
}
