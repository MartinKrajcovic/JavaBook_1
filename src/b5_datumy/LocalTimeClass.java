package b5_datumy;

import java.time.LocalTime;
import java.time.ZoneId;
/*
 * Trieda LocalTime zapuzdruje cas v podobe hodina, minuta, sekunda.
 * Tieto objekty pracuju s milisekundami a nanosekundami.
 * Tato trieda nesluzi na ulozenie datumu ako LocalDate trieda.
 * Co znamena, ze nie je mozne do objektu tejto triedy ulozit den, mesiac..
 */
public class LocalTimeClass {
	/*
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("    AKTUALNE CASY SVETA :");
		System.out.println("==============================");
		
		//inicializacie premennych typu LocalTime na specifikovane zony (svetadiel/hl.mesto)
		LocalTime bratislava = LocalTime.now(ZoneId.of("Europe/Bratislava"));
		LocalTime praha 	 = LocalTime.now(ZoneId.of("Europe/Prague"    ));
		LocalTime moskva	 = LocalTime.now(ZoneId.of("Europe/Moscow"    ));
		LocalTime newYork	 = LocalTime.now(ZoneId.of("America/New_York" ));
		LocalTime hongKong	 = LocalTime.now(ZoneId.of("Asia/Hong_Kong"   ));
		LocalTime tokyo		 = LocalTime.now(ZoneId.of("Asia/Tokyo"       ));
		
		//vypisi aktualnych casov hlavnych miest sveta
		System.out.println("Bratislava: " + bratislava);
		System.out.println("Praha:      " + praha     );
		System.out.println("Moskva:     " + moskva    );
		System.out.println("New York:   " + newYork   );
		System.out.println("Hong Kong:  " + hongKong  );
		System.out.println("Tokyo:      " + tokyo     );	
	}
}
