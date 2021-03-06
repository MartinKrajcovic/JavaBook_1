package a2_operatory;
/**
 * Tato trieda demonstruje moznost pretypovania premennych a vypoctov.
 */
public class O7 {
	
	public static void main(String[] args) {
		/*
		 * Pretypovanie sa vyuziva, ked potrebujeme preniest nejaku hodnotu
		 * urciteho typu do typu s inou charakteristikou alebo presnostou.
		 * 
		 * Pretypovanie moze byt implicitne alebo explicitne.
		 * 
		 * Implicitne pretypovanie nastava ked chceme priradit hodnotu premennej
		 * datoveho typu s mensou presnostou do premennej, ktora ma vacsiu presnost.
		 * Priklad: chceme priradit hodnotu 10 typu 'int' datovemu typu 'double'
		 * Implicitne pretypovanie sa deje automaticky.
		 * 
		 * Explicitne pretypovanie uvadzame do gulatych zatvoriek, v ktorych je datovy
		 * typ, na ktory sa ma hodnota pretypovat.
		 * Vacsinou tak ide o pretypovanie z vyssej presnosti na nizsiu.
		 * Priklad: chceme aby cislo typu 'double' zahodilo desatinne miesta a stalo sa 
		 * 			premennou typu 'short'
		 * 
		 * 			float x = 4.2;
		 * 			short y = (short) x;
		 */
		double x = 10.487;
		int y, z;
		
		System.out.println(x);
		
//		y = x;
		y = (int) x;	
		
		System.out.println(y);
		
		z = 9;	//int delime int
		System.out.println(z/y);	/*ked spravime manualne z celeho cisla desatinne, cely vysledok
									  bude desatinny, pretoze sa vypocet implicitne pretypuje */
		x = z;
		System.out.println(x);		/*dalsi priklad implicitneho pretypovania
		 								-> int sa zmeni na double				*/
		
		y = (short) (x - z * 2);	/*vdaka spravnemu pouzitiu priority operatorov mame zaporny vysledok*/
		System.out.println(y);
	}
}
