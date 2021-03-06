package a2_operatory;
/**
 * Tato trieda poukazuje na vyuzitie unarneho operatora negacie ('!')
 */
public class O4 {
	
	public static void main(String[] args) {
		/*
		 * Vykricknik/operator negacie sa v praxy pouziva najma pri
		 * overovani podmienok.
		 * Jej ucinok je ukazany nizsie, kde prevracia hodnotu booleanovskej
		 * premennej z true na false a naopak. 
		 */
		
		boolean state = true;		//inicializacia premennej na hodnotu true
		state = !state;				//zmena hodnoty premennej na znegovanu hodnotu true (t.j.false)
				
		System.out.println(state);	//vypis aktualnej hodnoty premennej
		System.out.println(!state); //vypis znegovanej aktualnej hodnoty premennej
	}	
}

