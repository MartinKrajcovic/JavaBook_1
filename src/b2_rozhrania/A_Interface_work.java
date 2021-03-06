package b2_rozhrania;
/**
 * Tato trieda implementuje rozhranie Interface_structure, ktoreho vsetky deklarovane
 * metody su v tejto triede povinne prepisane tak, aby vyhovovali poziadavkam tejto triedy.
 */
public class A_Interface_work implements A_Interface_structure {
	
//PREKRYTE METODY	
	@Override
	public void read() {
		System.out.println("I'm reading now.");
	}

	@Override
	public String discuss() {
		return "I'm discussing an issue.";
	}

	@Override
	public void sendEmail(String message) {
		System.out.println("I'm sending an email with content below: ");
		System.out.println(message);
	}
	
//HLAVNA FUNKCIA	
	public static void main(String[] args) {
		
		A_Interface_work myObject = new A_Interface_work();		 //vytvorenie objektu
		myObject.read();									 //volanie funkcie read()
		System.out.println(myObject.discuss());				 //vypis vysledku funkcie discuss()
		myObject.sendEmail("Prosim vydat NTB do spotreby..");//vypis odoslanej spravy funkciou sendEmail()
	}
}
