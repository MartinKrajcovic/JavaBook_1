package p1_stream_API;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/*
 * Streamy su sekvencie prvkov podporujuce sekvencne a paralelne
 * agregacne operacie.
 * Streamy su definovane najma pre Collections Framework,
 * vyuzitelne aj pri poliach, ci I/O kanaloch.
 * Stream nie je datova struktura, ktora uchovava hodnoty.
 * Ake kolvek operacie vykonane na nejakej kolekcii pomocou
 * streamov, nebudu modifikovat data, na ktorych su volane.
 * Prvky na ktorych je stream zavolany, su streamom navstivene
 * iba jeden krat, tak ako je to aj pri Iterator-e.
 * 
 * Stream je mozne ziskat roznymi sposobmi, napriklad cez kolekcie,
 * ktora je znazornena nizsie, alebo pomocou volania Arrays.stream(),
 * ci Stream.of() a podobne.
 */
public class Stream1 {
	public static void main(String[] args) {
		//pracovna zlozka
		File directory = new File("C://devel");
		
		//ziskanie obsahu pracovnej zlozky do zoznamu suborov
		List<File> content = Arrays.asList(directory.listFiles());
		
		//standardny vypis obsahu zlozky na vystup
		System.out.println("=== FOR-EACH: Directory content ===");
		for (File f : content) {
			System.out.println(f);
		}
		
		//vypis obsahu zlozky na vystup pomocou lambda vyrazu
		System.out.println("\n=== LAMBDA: Directory content ===");
		content.forEach(System.out::println);
		
		/*
		 * Na kazdej kolekcii je mozne volat metodu stream().
		 * Stream ma mnoho metod, ktore je na nej mozne volat.
		 * Tieto metody sa delia na stredne a terminalne operacie.
		 * Stream pozostava z troch veci:
		 * 		1. Zdroj dat, na ktorom chceme robit operacie
		 * 		2. Operacie, ktore maju byt vykonane
		 * 		3. Terminalna operacia, ktora tvori vysledky streamu
		 * 
		 * Iba prvok, ktory uspesne prejde cez strednu operaciu, je
		 * posunuty dalej do terminalnej operacie na spracovanie.
		 */
		System.out.println("\n=== STREAM: Not a directory ===");
		content.stream()
				.filter(f -> !f.isDirectory())	//stredna operacia
				.forEach(System.out::println);	//terminalna operacia
												//pouzity method reference
		/*
		 * K dispozicii mame rozne stredne aj terminalne operacie.
		 * Nasledujuci prikaz vypisuje na konzolu pocet suborov
		 * nachadzajucich sa v zlozke devel:
		 */
		System.out.println("\n=== STREAM: Directory file count ===");
		System.out.println(content.stream().count());
	}
}
