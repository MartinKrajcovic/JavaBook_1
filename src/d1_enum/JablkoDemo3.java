package d1_enum;

public class JablkoDemo3 {

	public static void main(String[] args) {
		Jablko apple1;
		Jablko apple2;
		Jablko apple3;
		/*
		 * Vsetky vyctove typy dedia automaticky (implicitne) vsetko od triedy
		 * java.lang.Enum. Napriek tomu, vycty nie je mozne rozsirovat.
		 * Vycty dedia teda aj metody, ako je napriklad ordinal(), ktora nam
		 * umoznuje ziskat hodnotu ordinalnu hodnotu, co je hodnota indikujuca
		 * poziciu konstanty vo vycte. Ordinalna hodnota sa pocita od 0.
		 * Inymi slovami, ordinalna hodnota je nieco ako index, na ktorom sa
		 * v poradi dana konstanta v zozname konstant nachadza.
		 * Ordinalne hodnoty mozeme zas porovnat metodou compareTo(), ktora je
		 * tiez zdedena od triedy Enum. Rovnako aj metoda equals().
		 */
		System.out.println("Vyps vsetkych konstant z Enum Jablko a ich ordinalne hodnoty: ");
		for (Jablko j : Jablko.values()) {
			System.out.println("Jablko " + j + ": " + j.ordinal());
		}
		
		apple1 = Jablko.RedDel;
		apple2 = Jablko.GoldenDel;
		apple3 = Jablko.RedDel;
		
		System.out.println();
			if(apple1.compareTo(apple2) < 0) 
				System.out.println(apple1 + " sa v zozname nachadza pred " + apple2);
		
			if(apple1.compareTo(apple2) > 0)
				System.out.println(apple2 + " sa v zozname nachadza pred " + apple1);
		
			if(apple1.compareTo(apple3) == 0) {
				System.out.println(apple1 + " je umiestnene na rovnakom mieste ako " + apple3);
			
		System.out.println();
			if(apple1.equals(apple2)) {
				System.out.println("Chyba!");
			}
			if(apple1.equals(apple3)) {
				System.out.println(apple1 + " je zhodne s " + apple3);
			}
			if(apple1 == apple3) {
				System.out.println(apple1 + " == " + apple3);
			}
		}
	}
}
