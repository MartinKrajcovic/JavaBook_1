package a4_funkcie;
/**
 * Tato trieda ukazuje moznost pretazenia metod a ich pouzitie.
 */
public class F4_Overload {
	/*
	 * V ramci jednej triedy je mozne definovat viac metod s rovnakym nazvom a
	 * rovnakym navratovym typom, pokial sa ich formalne parametre lisia.
	 * Formalne parametre musia byt zmenene, no navratovy typ sa moze tiez lisit.
	 * Definovanie takejto metody sa nazyva pretazenie.
	 * Takymto metodam tiez hovorime ako 'metody so zmenenou signaturou'
	 * 
	 * PRIKLAD:
	 * 			void f (int a) {}
	 * 			void f (double a) {}
	 * 
	 * Ide o rovnake funkcie, s rozlicnou signaturou. Jedna pracuje s datovym typom
	 * int a druha pracuje s datovym typom double.
	 */
	
	public static void main(String[] args) {
		
//volanie pretazovanych metod
		getNumber();
		getNumber(5);
		getNumber(10, "4");
	}
	
	
	static void getNumber() {
		System.out.println("There is no number");
	}
	
	static void getNumber(int a) {
		System.out.println(a);
	}
	
	static void getNumber(int a, String b) {
		System.out.print(a);
		System.out.print(", ");
		System.out.println(Integer.valueOf(b)); 	//prevod textoveho retazca na cele cislo (typ int)
	}
	
}
