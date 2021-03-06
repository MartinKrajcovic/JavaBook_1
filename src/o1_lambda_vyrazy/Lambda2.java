package o1_lambda_vyrazy;

public class Lambda2 {
	public static void main(String...strings) {
		/*
	 	* Lambda vyraz je mozne pouzit pri vsetkych funkcnych rozhraniach, t.j.
	 	* rozhraniach ktore maju len jednu jedinu abstraktnu metodu.
	 	* Velmi dobrym prikladom je napriklad rozhranie Runnable.
	 	* 
	 	* Ukazka 1:
	 	* Tato ukazka demonstruje anonymnu vnutornu triedu.
	 	*/
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymna vnutorna trieda.");
			}			
		});
		t1.start();
		
		/*
		 * Ukazka 2:
		 * Tato ukazka demonstruje lambda vyraz, v ktorom je viditelne
		 * eliminovany boiler plate.
		 */
		Thread t2 = new Thread(() -> System.out.println("Lambda vyraz."));
		t2.start();
	}
}
