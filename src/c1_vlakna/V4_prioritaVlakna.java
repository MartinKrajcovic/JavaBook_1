package c1_vlakna;

/*
 * Priority vlakien su vyuzivane planovacom vlakien k rozhodnutiu
 * o tom, kedy by kazde z vlakien malo dostat povolenie k behu.
 * Plati, ze vlakna s vyssou prioritou maju ziskat viac procesoroveho
 * casu nez vlakna s nizsou prioritou. V skutocnosti tomu ale nemusi
 * byt tak.
 * Vlakno s vyssou prioritou si moze vynutit pozastavenie vlakna s
 * nizsou prioritou.
 * Teoreticky plati, ze vlakna s rovnakou prioritou by mali ziskat
 * rovnaky pristup k procesorovemu casu.
 */

public class V4_prioritaVlakna {
	/*
	 * Plati, ze priorita vlakna sa moze definovat pomocou metody objektu
	 * zapuzdrujuceho vlakno setPriority() a to hodnotami 1 az 10, pricom
	 * 1 ja najmensia priorita a 10 najvacsia priorita vlakna.
	 * Plati aj to, ze pokial nie je priorita vlakna explicitne definovana,
	 * tak vlakno ma normalnu prioritu co je priorita stupna 5.
	 * Trieda Thread definuje aj konstanty priority:
	 * 	
	 * 		Thread.MIN_PRIORITY  = 1
	 * 		Thread.NORM_PRIORITY = 5
	 * 		Thread.MAX_PRIORITY  = 10
	 * 
	 * Normalnu prioritu, cize 5, resp. NORM_PRIORITY ma standardne aj
	 * hlavne vlakno, cize hlavna metoda programu.
	 */
	public static void main(String[] args) {
		Thread t;
		t = Thread.currentThread();	//informacie o tomto konkretnom, aktualnom vlakne
		
		System.out.println(t); 		//vypis vlakna
		System.out.println();
		
		System.out.println("Nazov vlakna: " + t.getName());
		System.out.println("Priorita vlakna: " + t.getPriority());
		
		t.setName("Hlavne");
		t.setPriority(9);
		System.out.println("Po zmene nazvu: " + t.getName());
		System.out.println("Po zmene priority: " + t.getPriority());
	}
}
