package o1_lambda_vyrazy;

import java.util.function.BiConsumer;

public class Lambda5_Exceptions {
	
	public static void main(String[] args) {	
		int[] nums = {1, 2, 3, 4};
		int key = 0;	//co ak je kluc 0 ?
		
		/*
		 * Nasledujuci prikaz predava metode process() ako argument pole celych cisel,
		 * celociselny kluc, ktorym maju byt prvky modifikovane a nakoniec lambda vyraz
		 * ktory urcuje akciu, co sa ma vykonat s danymi argumentami.
		 * V pripade delenia moze nastat vynimocna situacia a to v pripade, ze delitel
		 * je rovny 0. To ukonci program.
		 * Zachytavat vynimku nie je efektivne priamo v lambda vyraze, ktory predavame
		 * ako argument. Jednym z klucovych vyuziti takehoto prikazu je to, ze je
		 * prakticky v jednom riadku a je lahko porozumitelny.
		 */
		process(nums, key, (v, k) -> System.out.println(v / k));
		
		/*
		 * Nasledujuci prikaz vyuziva takzvany wrapper, ktorym obalujeme predchadzajuci
		 * lambda vyraz a to pomocou metody wrapperLambda(), ktora prijma ako argument
		 * lambda vyraz, ktory sme pouzili v predchadzajucom volani a tak isto vracia
		 * tento lambda vyraz metode process, pritom s jednym rozdielom...
		 * Aby sme mohli volat metodu process bezpecne a s pouzitim lambda vyrazu
		 * efektivne a v jednom riadku, tak sme blok try-catch vlozili do obalovej
		 * metody wrapperLambda(), ktora zachytava vynimku, co moze nastat pri
		 * deleni nulou.
		 */
		process(nums, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}
	
	public static void process(int[] nums, int key, BiConsumer<Integer, Integer> action) {
		for (int n : nums)
			action.accept(n, key);
	}
	
	/**
	 * Tato metoda obaluje metodu process, pricom vracia akciu v podobe
	 * lambda vyrazu, ktoru metoda process prijma. Aj ked ide o inu
	 * metodu, pri volani process je mozne ako argument predat namiesto
	 * cisteho lambda vyrazu tento wrapper, ktory je vytvoreny preto, aby
	 * osetroval mozne vyvolanie aritmetickej vynimky a pri volani v 
	 * hlavnej metode mohol byt stale pouzity efektivne.
	 */
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> process) {
		return (v, k) -> {	//vraciame to, co je tejto metode predane
			try {
				process.accept(v, k);
			} catch (ArithmeticException e) {
				System.err.println("Vynimka chytena vo wrapperLambda");
			}
		};
	}
}
