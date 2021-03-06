package o1_lambda_vyrazy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Vyriesenie uloh pomocou lambda vyrazov.
 * Ako je vidiet, riesenie zabralo 3 riadky.
 */
public class Lambda4 {
	
	// uloha 1: zoradit zoznam osob podla priezviska
	
	// uloha 2: vypisat vsetky prvky v zozname na konzolu
				
	// uloha 3: vytvorit metodu, co vypise ludi, ktorych priezvisko zacina na C
				
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Martin", "Bane", 32),
				new Person("Bruce", "Ane", 20),
				new Person("Peter", "Clement", 26),
				new Person("Richard", "Dickson", 44),
				new Person("Lee", "Child", 21));
		
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		Lambda4.printPersons(persons, p -> true, p -> System.out.println(p));
		
		/* Ked je lava aj prava strana lambda vyrazu zhodna (parameter, parameter, ci bez, bez..a pod.)
		 * je mozne pouzit skratenu formu lambda vyrazu a tou su referencne metody. Staci zapisat triedu,
		 * ktorej tato metoda patri, dva krat dvojbodku a nasledne nazov metody, ktora sa ma volat v 
		 * lambda vyraze.
		 * 
		 * PRIKLAD: 
		 * 		public static void p() { //vracia void
		 * 			System.out.println("metoda bez parametra"); 
		 * 		}	
		 * 	
		 * 		public static void main(String[] args) {
		 * 			Thread t = new Thread(Lambda4::p);	//lambda pre metodu run, ktora je bez parametra a vracia void
		 * 			t.start();
		 * 		}
		 */
		Lambda4.printPersons(persons, p -> p.getLastName().startsWith("C"), System.out::println);
	}
	
	/**
	 * Tato metoda je pouzitelna pre akukolvek podmienenu akciu, ktoru je mozne
	 * definovat lambda vyrazom predanym ako argument. Metoda by mohla byt genericka
	 * a prijmat akykolvek zoznam objektov, dalsim argumentom by prijala podmienku,
	 * ktoru by musel konkretny objekt splnat, aby sa vykonala akcia dana tretim
	 * argumentom.
	 * @param roster specifikuje zoznam osob
	 * @param condition specifikuje podmienku ktoru musi osoba splnat
	 * @param action specifikuje akciu, ktora sa ma vykonat v pripade ze podmienka plati
	 */
	public static void printPersons(List<Person> roster, 
			Predicate<Person> condition, Consumer<Person> action) {
		for (Person p : roster) {
			if (condition.test(p))
				action.accept(p);
		}
	}
}
