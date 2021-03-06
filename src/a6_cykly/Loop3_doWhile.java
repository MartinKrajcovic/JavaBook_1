package a6_cykly;
/**
 * Tato trieda demonstruje pripad pouzitia cyklu do-while
 */
public class Loop3_doWhile {

	public static void main (String[] args) {
		/*
		 * Rozdiel medzi cyklom do-while a while (alebo for), je len v tom,
		 * ze ukoncovacia podmienka cyklu do-while sa testuje az na konci 
		 * celeho cyklu.
		 * Najprv sa teda vykonaju prikazy vo vnutri tela cyklu a az potom
		 * sa zisti, ci ma cyklus pokracovat.
		 * 
		 * Vysledkom je to, ze k vykonaniu prikazu v tele tohto cyklu dojde
		 * aspon raz.	(Priklad - menu)
		 */
		int gentleman = 0;
		
		do {
			System.out.println("Good day, Sir.");
			gentleman--;
		} while (gentleman > 0);
	}
	
}
