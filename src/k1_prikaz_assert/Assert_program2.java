package k1_prikaz_assert;

public class Assert_program2 {

	static int val = 6;
	
	public static int getNum() {
		return val--;
	}
	
	public static void main(String[] args) {
		int n;
		
		for (int i = 0; i < 10; i++) {
			n = getNum();
			
			//druhy sposob ako zaviest prikaz assert, druha cast urcuje retazec, ktory sa zobrazi vo vynimke
			assert (n > 0) : "Hodnota n je nula!";
			
			System.out.println("Hodnota n je " + n);
		}
		
	}
	
}
