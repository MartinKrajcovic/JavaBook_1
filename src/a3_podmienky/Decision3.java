package a3_podmienky;
/**
 * Tato trieda demonstruje prakticke vyuzitie vnorenych podmienok.
 */
public class Decision3 {
	/**
	 * V tejto metode, sa overuje pristupne a nepristupne cislo.
	 * 
	 * Pristupne cislo moze vidiet kazdy pouzivatel, kazde meno,
	 * ktore zadame do premennej 'name'.
	 * Nepristupne cislo nemoze vidiet nikto, okrem pouzivatela
	 * s menom 'Martin'.
	 * 
	 * Tyto pouzivatelia sa logicky overuju vo vnutri podmienky 
	 * pre nepristupne cislo.
	 */
	public static void main(String[] args) {
		
		int available   = 10;
		int unavailable = 11;
		int showMe;				//sem vkladame hodnoty 'available' a 'unavailable'
		String name;			//sem vkladame mena uzivatelov
		
		// tu upravuj //
		showMe = unavailable;
		name   = "Dominik";
		
		
		if (showMe == unavailable) {
			if (name == "Martin") {			
				System.out.println("This user can see this number: " + unavailable);
			} else {
				System.out.println("This user can't see this number.");
			}
		}
		else if (showMe == available) {
			System.out.println("Everyone can see this number: " + available);
		}
		else
			System.out.println("You entered a wrong number!");
	}
}
