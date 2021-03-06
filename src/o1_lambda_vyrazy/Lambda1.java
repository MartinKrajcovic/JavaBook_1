package o1_lambda_vyrazy;
/*
 * V uvode sme dospeli k lambda vyrazu jednoduchej bezparametrickej metody greet()
 * a to nasledovnym sposobom:
 * 
 * 		premennaLambda = () -> System.out.println("Hello");
 * 
 *  Co je na lambda vyrazoch zaujimave je to, ze ich mozeme predavat ako argumenty
 *  metodam a to nie len cez referencne premenne, no aj kludne na priamo.
 *  
 *  	public void show(() -> System.out.println("Hello"));
 *  
 *  Toto je typicky priklad, ako sa lambda vyraz pouziva.
 *  Spominany lambda vyraz nepracuje so ziadnym parametrom, avsak mozeme ich definovat.
 *  Napriklad, lambda vyraz by bolo mozne spravit aj z nasledujucej funkcie:
 *  
 *  	lambdaVyraz = public int doubleNum(int a) {
 *  							return a * 2;
 *  				  }
 *  
 * Prvou vecou, co mozeme odstranit je modifikator, kedze vyraz nie je sucastou
 * ziadnej triedy. Druhy mozeme odstranit nazov, pretoze sa bude pouzivat ten,
 * ktoremu sa mechanizmus tejto funkcie priradzuje. Nakoniec, mozeme odstranit
 * navratovy typ. Kompilator ho dokaze dosadit sam.
 * 
 * 		lambdaVyraz = (int a) -> return a * 2;
 * 
 * V pripade, ze je nas lambda vyraz opat jednoriadkovy (bez celeho bloku kodu),
 * mozeme odstranit aj klucove slovo return.
 * 
 * 		lambdaVyraz = (int a) -> a * 2;
 * 
 * Ako dalsi priklad je mozne uviest funkciu, ktora by mala preberat dva argumenty
 * a vratit ich sucet:
 * 
 * 		lambdaVyraz = (int a, int b) -> a + b;
 * 
 * Teraz povedzme, ze chceme metodu, ktora bude robit bezpecne delenie jedneho
 * argumentu druhym:
 * 
 * 		lambdaVyraz = (int a, int b) -> {
 * 						if (b == 0)
 * 							return 0;
 * 						return a / b;
 * 					  }
 * 
 * Povedzme, ze teraz by sme chceli len pre ukazku, napisat lambda vyraz, ktory
 * nam da dlzku predaneho retazca ako argument:
 * 
 * 		lambdaVyraz = (String str) -> str.length();
 * 
 * Existuje este jedno syntakticke skratenie, ktore sa da vyuzit pri lambda vyraze.
 * Ak deklaracia metody prebera nejaky parameter, ci viacero parametrov, tak lambda 
 * vyraz dokaze rozpoznat aj ich typy, co znamena, ze ich netreba uvadzat.
 * Predchadzajuci priklad by mohol byt napisany aj takto: 
 * 
 * 		lambdaVyraz = str -> str.length();
 * 
 * Vsimnime si, ze pri jednom argumente, nie je nutne dokonca uviest ani zatvorky
 * specifikujuce zoznam parametrov metody.
 */
public class Lambda1 {
	public static void main(String[] args) {
		/*
		 * Lambda vyraz, ktory sme ukladali do premennej mala do teraz nezmany typ.
		 * Tymto typom je rozhranie.
		 */
		Greeting lambda;
		
		/*
		 * Rozhranie, z ktoreho ma lambda vyraz vychadzat, musi mat deklarovanu len
		 * jednu jedinu abstraktnu metodu.
		 * Metody, ktore su staticke, ci s modifikatorom default mozu byt pritomne v
		 * lubovolnom pocte.
		 * Taketo rozhranie sa nazyva funkcne rozhranie, ktore zvykne byt oznacene
		 * anotaciou @FunctionalInterface()
		 * 
		 * Dalsou podmienkou je, ze lambda vyraz musi splnat signaturu deklarovanej
		 * metody rozhranim.
		 */
		lambda = () -> System.out.println("Hello Lambda!");
		
		/*
		 * Nasledujuci priklad znazornuje lambda vyraz, ktory je sam o sebe implementaciou
		 * DoubleValue rozhrania s jednym rozdielom. V tomto pripade sa nevytvara objekt
		 * triedy, ktora implementuje toto rozhranie.
		 * Lambda vyraz sa podoba anonymnej vnutornej triede, avsak aj od nej je odlisny.
		 */
		DoubleValue lambdaDoubleValue = x -> x * 2;
		
		/*
		 * Tuto hodnotu (t.j. akciu) mozeme predat inej metode, ktora tuto akciu 
		 * vykona vo svojom tele.
		 */
		lambda.perform();
		System.out.println(lambdaDoubleValue.doubleValue(8));
	}
}

@FunctionalInterface
interface DoubleValue {
	public int doubleValue(int number);
}
