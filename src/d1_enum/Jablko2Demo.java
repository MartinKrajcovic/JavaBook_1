package d1_enum;

public class Jablko2Demo {

	public static void main(String[] args) {
		Jablko2 apple;
		
		System.out.println("Cena jablka Winesap je " + Jablko2.Winesap.getPrice() + " SK.");
		System.out.println();
		
		System.out.println("Ceny vsetkych jablk: ");
		for (Jablko2 j2 : Jablko2.values()) {
			System.out.println("Jablko " + j2 + " stoji " + j2.getPrice() + " SK.");
		}
	}
}
