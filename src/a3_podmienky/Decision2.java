package a3_podmienky;
/**
 * 
 */
public class Decision2 {

	public static void main(String[] args) {
		
		int vahaKotuca = 49;
		
		/*
		 * Osetrenie pripadu len ked je podmienka splnena castokrat nestaci.
		 * K tomu, aby sme urcili, co sa ma stat v pripade jej nesplnenia 
		 * sluzia podmienky typu: 	if - else
		 * 
		 * Ich pouzitie je prakticky rovnake.
		 */
		
		if (vahaKotuca <= 50) {
			System.out.println("Zdvihnem");			//ak podmienka plati
		} else {
			System.out.println("Nezdvihnem");		//ak podmienka neplati
		}	
	}
}
