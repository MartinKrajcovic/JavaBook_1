package a6_cykly;
/**
 * Tato trieda demonstruje prevedenie skokoveho prikazu continue v cykle hlavnej metody.
 */
public class Loop7_continue {

	public static void main(String[] superman) {
	/*
	 * Prikaz continue je protipolom prikazu break.
	 * Tento prikaz preskoci zvysok tela cyklu a presunie vykonavanie programu
	 * spat na hlavicku cyklu.
	 */
		int iteration = 0;
		int summary = 0;
		int amount = 15;
		int price = 3;
		
		while (iteration < amount) {
			iteration++;			
			if (iteration % 13 == 0) {
				continue;
			}
			summary += price;			//summary = summary + price;
		}
		System.out.println(summary);
	}
}

/*
 * Keby bola inkrementacia iteracnej premennej zvysovana na konci cyklu ako byva zvykom, tak by
 * program nikdy neskoncil, pretoze by sa nikdy k inkrementacii nedostal.
 * Pociatocna hodnota iteracnej premennej je nula a po vydeleni nuly trinastkou dostaneme nula
 * a zvysok tak isto nula..
 * Podmienka tak bude platit naveky, a prikaz continue nas bude stale posielat za dalsou otackou.
 */
