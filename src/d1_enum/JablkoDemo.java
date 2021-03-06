package d1_enum;

public class JablkoDemo {

	public static void main(String... a) {
		Jablko ap;
		ap = Jablko.RedDel;

		System.out.println("Hodnota premennej ap: " + ap);
		System.out.println();

		//priradenie hodnoty
		ap = Jablko.GoldenDel;

		//porovnanie
		if (ap == Jablko.GoldenDel) {
			System.out.println("Premenna ap obsahuje hodnotu GoldenDel.");
			System.out.println();
		}

		//prikaz switch
		switch (ap) {
		case Johnatan:	//tu vidiet, ze kvalifikacia typom Jablko. nie je treba
			System.out.println("Jablko Johnatan je cervene.");
			break;
		case GoldenDel:
			System.out.println("Jablko Golden Delicious je zlte.");
			break;
		case RedDel:
			System.out.println("Jablko Red Delicious je cervene.");
			break;
		case Winesap:
			System.out.println("Jablko Winesap je cervene.");
			break;
		case Cortland:
			System.out.println("Jablko Cortland je cervene.");
			break;
		}
	}
}
