package n1_genericke_typy;
/**
 * Trieda Stats je neuspesnym pokusom o vytvorenie generickej triedy
 * schopnej vypocitat priemer pola cisel akehokolvek zadaneho typu.
 * 
 * Kod triedy obsahuje chybu!
 * @param <T>
 */
class Stats<T> {
	T[] nums;
	
	/*
	 * Predanie odkazu na pole
	 * typu T konstruktoru triedy 
	 */
	Stats(T[] o) {
		nums = o;
	}
	
	/**
	 * Metoda average, ktora je sucastou triedy Stats sa volanim metody doubleValue snazi previest
	 * kazdu hodnotu z pola nums na typ double. Kedze vsetky triedy pre pracu s cislami su podtriedami
	 * triedy Number a ta definuje metodu doubleValue, je tato metoda dostupna vo vsetkych obalovanych
	 * typoch pre pracu s cislami.
	 * Problemom je vsak to, ze kompilator sam nevie zistit, ze nasim cielom je vytvarat instancie triedy
	 * Stats len s ciselnymi typmi. Preto sa pri kompilacii triedy Stats zobrazi hlasenie, ktore hovori,
	 * ze metoda doubleValue nie je znama.
	 */
	double average() {		//vratenie typu double vo vsetkyc pripadoch
		double sum = 0.0;
		for (int i=0; i<nums.length; i++) {
//			sum += nums[i].doubleValue();	//chyba!!!
		}
		return sum/nums.length;
	}
}

public class Gen5_ObmedzeneGenTypy1 { }
