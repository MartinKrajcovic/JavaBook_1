package a2_operatory;
/**
 * Tato trieda demonstruje pouzitie ternarneho operatora na viacerych prikladoch.
 */
public class O5 {
	
	public static void main(String[] args) {
		
//INICIALIZACIE		
		int num1 = 1;
		int num2 = 2;
		
//DEKLARACIE		
		int result;			//vytvorenie pomocnej premennej, do ktorej budeme ukladat cisleny vysledok
		boolean result2;	//vytvorenie pomocnej premennej, do ktorej budeme ukladat logicky vysledok
		
		/*
		 * Ternarny operator je len jeden. A ako z nazvu vyplyva, potrebuje
		 * tri operandy. Jeho syntax je nasledovna:
		 * 
		 * 			podmienka ? ak plati : ak neplati;
		 * 
		 * V prvej casti definujeme podmienku, ktoru chceme overit.
		 * Pokial je logicka hodnota nasej podmienky pravdiva, tak sa vykona prvy prikaz za otaznikom.
		 * Ak je vsak logicka hodnota podmienky nepravdiva, tak sa vykona prikaz za dvojbodkou.
		 */
		
		//do premennej result sa ulozi vysledna ciselna hodnota po overeni podmienky
		result = (num1 < num2) ? num1 : num2;	//ak plati, ze num1 je mensie ako num2, do premennej sa ulozi hodnota num1, ak nie, ulozi sa do nej hodnota num2
		System.out.println(result);				//vypis vyslednej hodnoty po overeni ternarnym operatorom.
		
		result = (num2 != num1) ? 569 : 568;
		System.out.println(result);
		
		result = (num1 >= num2) ? num1 : (num1 + num2);
		System.out.println(result);
		
		//do premennej result2 sa ulozi vysledna logicka hodnota po overeni podmienky
		result2 = (num1 > num2) ? true : false;
		System.out.println(result2);
		
	}
}