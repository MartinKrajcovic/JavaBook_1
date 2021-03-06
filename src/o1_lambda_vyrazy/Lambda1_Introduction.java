package o1_lambda_vyrazy;
/*
 * Novou crtou jazyka Java, ktora bola pridana vo verzii JDK 1.8 su takzvane
 * lambda vyrazi. Zavedenie niako neovplivnilo strukturu starsich programov,
 * napisanych v predchadzajucich verziach Javy.
 * Ich zavedenie prinieslo viacere znacne vyhody, medzi ktore patri napriklad
 * eliminacia boiler plate kodu (vela kodu / malo akcie) alebo mensie naroky
 * na pamat, ci zvysena rychlost kodu.
 * Lambda vyrazi prinasaju novu programovaciu paradigmu - funkcne programovanie.
 * Na rozdiel od objektovo orientovaneho programovania, pri funkcnom programovani
 * premenna uchovava hodnotu, ktora je v podstate samotna funkcia.
 * Nie vysledok volania funkcie ale prave implementacia nejakej funkcie, ktoru je
 * mozne predavat ako parameter inym funkciam a podobne.
 * V objektovo orientovanom programovani je vsetko doslova zapuzdrene do triedy.
 * Kazdopadne, obe tieto paradigmy su uzko spojene a navzajom sa niako neobmedzuju.
 */
public class Lambda1_Introduction {
	/*
	 * Predstavme si metodu, ktora ma vypisat nejaky text na konzolu.
	 * Ak jej nepredame ziaden argument a natvrdo zakodujeme spravu,
	 * ktora sa ma vypisat, je takato funkcia len zdaleko pouzitelna.
	 */
	public void greet() {
		System.out.println("Hello");
	}
	/*
	 * Omnoho lepsou variantou je pochopitelne moznost predania nejakeho
	 * argumentu tejto metode a ta uz nasledne spracuje poziadavku na
	 * zaklade predaneho argumentu.
	 */
	public void greet(String text) {
		System.out.println(text);
	}
	/*
	 * Teraz si predstavme, ze by sme takuto metodu chceli spravit viac
	 * efektivnou a chceli definovat napriklad nejaky mechanizmus, ktory
	 * specifickejsie spracovava predany parameter. 
	 */
	public void greetCount(String text) {
		System.out.println(text.length());
	}
	/*
	 * V pripade lambda vyrazov by bolo mozne takuto metodu napisat aj
	 * vseobecnejsim sposobom a to tak, ze by sme mohli predat ako
	 * argument priamo ten specificky mechanizmus, ktory chceme aby
	 * sa vykonal bez toho, aby to musela robit nasa metoda vo svojom tele.
	 * 
	 * 		public void greetCount(____) {
	 * 			______;
	 * 		}
	 * 
	 * V minulych verziach Javy toto bolo mozne urobit prostrednictvom Objektov,
	 * ktore implementovali nejake rozhranie a teda definovali spravanie
	 * metod tychto rozhrani.
	 * Napriklad:
	 * 
	 * 		interface Greeting { 
	 * 			public void perform(); 
	 * 		}
	 * 
	 * Teraz by sme mohli nasej metode odovzdat premennu rozhrania a 
	 * volat implementaciu jeho procedury v tele nasej metody:
	 * 
	 * 
	 * 		public void greetCount(Greeting greeting) {
	 * 			greeting.perform();
	 * 		}
	 * 
	 * K tomuto procesu je nutne, poskytnut metode aspon referenciu na 
	 * objekt, ktory tuto metodu rozhrania priamo implementuje.
	 * V skutocnosti stale nepredavame metode samotne spravanie, samotnu
	 * akciu, ale objekt, ktory definuje a vlastni tuto akciu.
	 * 
	 * Lambda vyrazi, nam umoznuju definovat samotne funkcie, ktore nie su
	 * metodami ziadnych tried, su to len hole akcie, ktore existuju v
	 * izolacii. Ich koncept sa da opisat takto:
	 * 
	 * 		public void greetCount(action) {
	 * 			action();
	 * 		}
	 * 
	 * Pritom action je samotna funkcia/samotne spravanie, ktore je predane
	 * metode ako "hodnota". (nasa metoda teda neprijma vysledok predanej akcie
	 * ale samotnu akciu, ktoru vykona az vo svojom vlastnom tele).
	 * 
	 * Ked vezmeme do uvahy prvu metodu tejto triedy, tak lambda vyraz moze
	 * obsahovat tuto metodu ako hodnotu a to nasledovne:
	 * 
	 * 		premennaLambda = public void greet() {
	 * 							System.out.println("Hello");
	 * 						 }
	 * 
	 * Lambda vyrazi su schopne determinovat a doplnit si syntax podla
	 * casti prikazu, ktore su jednoducho domyslitelne.
	 * Napriklad, premennej "premennaLambda", priradzovana metoda greet()
	 * nemusi obsahovat slovo public, pretoze akcia, ktoru reprezentuje
	 * lambda vyraz nepatri ziadnej triede, tym padom tento modifikator
	 * nie je v tomto kontexte vobec nutny.
	 * 
	 * 		premennaLambda = void greet() {
	 * 							System.out.println("Hello");
	 * 						 }
	 * 
	 * Ked sa pozrieme na priradzovanu funkciu teraz, je vidiet, ze
	 * pokial mame implementovat samotne spravanie funkcie, nie je nutny
	 * ani jej nazov, kedze tato funkcia sa bude predavat pomocou
	 * referencnej premennej na lavej strane ("premennaLambda").
	 * 
	 * 		premennaLambda = void () {
	 * 							System.out.println("Hello");
	 * 						 }
	 * 
	 * Lambda vyraz dokaze sam urcit podla tela metody aj navratovy typ.
	 * Ak v tele nie je uvedeny navratovy typ, ci nie je niako inak zrejme,
	 * ze akcia ma vraciat hodnotu nejakeho typu, tak ako v nasom pripade,
	 * implicitne dosadi void. Priradenie metody bude teraz vyzerat takto:
	 * 
	 * 		premennaLambda = () {
	 * 							System.out.println("Hello");
	 * 						 }
	 * 
	 * Tento stav je takmer platnou definiciou lambda vyrazu. Kedze lambda
	 * nepotrebuje modifikator pristupu a sama si vie odvodit navratovy typ,
	 * ci nazov, ostavaju tu pritomne len tie najpodstatnejsie veci a tym su
	 * zatvorky, ktore indikuju zoznam parametrov a blok kodu, ktory sa ma
	 * vykonat. Pre kompletizaciu, chyba este jeden syntakticky prvok a to
	 * symbol "->" (sipka), ktory sa v pripade labda vyrazov uvadza medzi
	 * zoznam parametrov a blok kodu.
	 * 
	 * 		premennaLambda = () -> {
	 * 							System.out.println("Hello");
	 * 						 }
	 * 
	 * V pripade, ze sa ma vykonat iba jeden jediny prikaz, tak nie je
	 * nutne pisat zlozene zatvorky a tak specifikovat blok kodu.
	 * Kedze ide o jeden jediny prikaz tak ako aj pri podmienke s 
	 * prikazom if, ci else, nemusime tieto zatvorky uvadzat, avsak
	 * chyba to nie je.
	 * 
	 * 		premennaLambda = () -> System.out.println("Hello"); 
	 */
}
