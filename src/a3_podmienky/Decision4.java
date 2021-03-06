package a3_podmienky;
/**
 * Trieda demonstruje prakticke pouzitie zlozenych podmienok.
 */
public class Decision4 {

	public static void main(String[] args) {
		
		int vek = 18;
		boolean obcan = true;
		
		/*
		 * Pripad, kedy potrebujeme pouzit viac podmienok a typicky
		 * niekolko moznych vysledkov maju rovnake riesenie, sa daju
		 * osetrit zlozenou podmienkou.
		 * 
		 * Ako priklad nizsie: V otazke volieb, riesime vek a obcianstvo
		 * obcanov.
		 * 
		 * Jednotlive podmienky musia byt oddelene niektorym z logickych
		 * (relacnych) operatorov.
		 */
		
		if ((vek >= 18) && (obcan == true)) {
			System.out.println("Mozete volit.");
		} 
		else if ((vek < 18) && obcan) {
			System.out.println("Volit nemozete, nemate dostatocny vek.");
		}	
		else if ((vek >= 18) && !obcan) {
			System.out.println("Volit nemozete, nemate obcianstvo.");
		}
	}
}
