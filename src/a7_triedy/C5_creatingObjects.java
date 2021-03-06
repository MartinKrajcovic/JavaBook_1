package a7_triedy;
/**
 * Tato trieda je ukazkou viac-stupnovej hierarchie.
 * Demonstruje vytvaranie objektov z triedy, ktora dedi vlastnosti od dvoch predkov. 
 */
public class C5_creatingObjects extends C4_extendsKeyword {

	public static void main(String[] args) {
		/*
		 * Vytvorenie objektu je skoro rovnake ako deklaracia premennej, ci vytvorenie pola.
		 * Ked chceme vytvorit objekt tejto triedy, tak uvedieme jej nazov 'G5_creatingObjects'
		 * a nasledne nazov objektu napriklad 'Object1'.
		 * Pre moznost pouzitia objektu a jeho vlastnosti, treba objekt skonstruovat a dat
		 * Jave informaciu, aby vyhradila tomuto objektu miesto v pamati. Potom ho budeme moct
		 * pouzivat.
		 * To sa robi pomocou operatora 'new' , ktory uvedieme za operator priradenia '=', nasledne
		 * za operator 'new' vpiseme nazov triedy so zatvorkou '= new C5_creatingObjects();'.
		 * 
		 * Zatvorka je prazdny konstruktor triedy. Konstruktor bude vysvetleny v nasledujucom ucive.
		 */
//VYTVORENIE OBJEKTU		
		C5_creatingObjects Object1 = new C5_creatingObjects();
		
//VOLANIE SETTEROV OBJEKTU
		/*Ked mame vytvoreny objekt, mozeme mu nastavovat jeho atributy pomocou pristupovych metod.*/
		Object1.setName("Eugen");		//nastavenie mena	(definicia v triede C3_thisKeyword)
		Object1.setAge(26);				//nastavenie veku	(definicia v triede C3_thisKeyword)
		Object1.setNickName("Geno");	//nastavenie prezyvky	(definicia v triede C4_extendsKeyword)
	
//VYPIS - VOLANIE GETTEROV OBJEKTU		
		System.out.println(Object1);				//vypisanie objektu (package, trieda, adresa v pamati)
		System.out.println(Object1.getName());		//vypisanie mena objektu
		System.out.println(Object1.getAge());		//vypisanie veku objektu
		System.out.println(Object1.getNickName());	//vypisanie prezyvky objektu
	}	
}
