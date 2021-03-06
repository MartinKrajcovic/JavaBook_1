package a6_cykly;

import java.util.Arrays;
/**
 * Tato trieda znazornuje pouzitie normalneho a dvojbodkoveho cyklu for.
 */
public class Loop5_forEach {
	static int numbers[] = new int[5];
	
	public static void main(String[] args) {
		Arrays.fill(numbers, 1);
		
		forLoop();		//spustenie funkcie s normalnym cyklom for
		forEach();		//spustenie funkcie s dvojbodkovym cyklom for
	}
	
	/**
	 * Tato metoda spusta cyklus for so vsetkymi definicnymi castami.
	 * Cyklus vypisuje na vystup hodnoty prvkov prechadzaneho pola.
	 */
	public static void forLoop() {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
	}
	
	/**
	 * Tato metoda spusta cyklus forEach (dvojbodkovy cyklus for), ktory
	 * sluzi ako zjednodusenie prechodu cez jednorozmerne a viacrozmerne polia.
	 * Na prechod daneho pola staci deklarovat premennu, do ktorej sa prvky z
	 * pola budu ukladat, vlozit dvojbodku ':' a za nu uviest nazov pola bez
	 * hranatych zatvoriek. (forEach vie, ze pojde o pole)
	 */
	public static void forEach() {
		int sum = 0;
		for (int i : numbers) {
			System.out.println(i);
			sum += i;
		}
		System.out.println();
		System.out.println("Sucet hodnot vsetkych prvkov je " + sum);
	}
}
