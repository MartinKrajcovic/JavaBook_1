package b4_vynimky;
/**
 * Tato trieda demonstruje zachytenie viacerych vynimiek pomocou viacerych blokov 'catch'
 * a pridava ukazku pouzitia bloku 'finally'.
 */
public class E3_tryCatchFinally {
	/*
	 * Ako je uvedene nizsie, blokov 'catch' moze byt aj viac, ked vieme, ze program moze vyhodit
	 * viacere vynimky, ci uz kontrolovane alebo nekontrolovane.
	 * 
	 * To co sa nachadza v bloku 'finally' sa vykona vzdy, ci uz vynimka zachytena bola alebo nie.
	 * Programatori vyuzivaju tento blok pre uzatvaranie spojeni s db, subormi alebo pod..
	 */
	public static void main(String[] args) {
		try {
//			int b = 42/a;				//ArithmeticException - delenie nulou
			int c[] = new int[1];
			c[42] = 99;					//ArrayIndexOutOfBoundsException - index mimo rozsah
		}
		  catch (ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		} catch (ArithmeticException aiobe) {
			aiobe.getMessage();
		} finally {
			System.out.println("Za blokom try-catch..");	//tento prikaz sa vzdy vykona
		}
	}
	
}
