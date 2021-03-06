package o1_lambda_vyrazy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Tato trieda plni zadane ulohy stylom vhodnym pre Java 7.
 * V rieseniach nie su pouzite lambda vyrazy.
 */
public class Lambda3 {
	
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
		
		//uloha 1
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		//uloha 2
		System.out.println("ULOHA 2:");
		printAll(persons);
		
		//uloha 3
		System.out.println("ULOHA 3:");
		lastNameEndsWith(persons);
		
		/*
		 * Tretia uloha sa moze dat vykonat napisanim jednej metody, pre rozne
		 * definicie vyhladavacej podmienky.
		 * Jednej metode moze byt zakazdym predana ina podmienka, na zaklade
		 * ktorej ma metoda vypisat obsah.
		 * To docielime rozhranim, ktoreho metoda bude preberat objekt Person
		 * ako argument a navratovy typ tejto metody bude boolean.
		 */
		//uloha 3
		System.out.println("DRUHA ULOHA 3:");
		showConditionally(persons, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		//uloha 3 s vypisom pomocou inej podmienky
		System.out.println("TRETIA ULOHA 3:");
		showConditionally(persons, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("M") || p.getFirstName().startsWith("B");
			}
		});
	}
	
	public static void printAll(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p);
		}
	}
	
	public static void lastNameEndsWith(List<Person> list) {
		for (Person p : list) {
			if (p.getLastName().startsWith("C"))
				System.out.println(p);
		}
	}
	
	/*
	 * Tato metoda moze byt pouzita na rozdielne vyhladavania.
	 * Ak objekt typu Person vyhovuje vyhladavacim kriteriam, t.j.
	 * ak je vysledok metody test true, tak bude tento objekt vypisany.
	 */
	public static void showConditionally(List<Person> persons, Condition condition) {
		for (Person p : persons) {
			if (condition.test(p))
				System.out.println(p);
		}
	}
	
	interface Condition {
		boolean test(Person p);
	}
}
