package h1_applety;

public class Applet1_definition {

	/*
	 * Applety su kratke aplikacie, ku ktorym sa pristupuje cez webovy server.
	 * Tieto aplikacie su tiez prenasane cez Internet, automaticky instalovane
	 * a spustane ako sucast weboveho dokumentu.
	 * Akonahle je applet doruceny na klienta, ziska pristup k prostriedkom, ktory
	 * je obmedzeny natolko, aby mohol applet vytvorit GUI a previest nejake zlozitejsie
	 * vypocty bez toho, aby sucasne predstavoval nejake riziko z hladiska nakazenia
	 * virusmi, ci nakazeniu integrity dat ulozenych na klientskom pocitaci.
	 * 
	 * Pre vytvorenie appletu je nutny import kniznic 'java.awt' a 'java.applet'.
	 * Vytvorena trieda musi dedit od triedy 'Applet'.
	 * Vo vnutri tela triedy musi byt definovana metoda 'paint()' - tato metoda sa vola,
	 * ked sa applet spusta. Metoda pracuje s jednym parametrom typu 'Graphic', obsahujucim
	 * ten graficky kontext, ktory popisuje graficke prostredie, v ktorom je applet spusteny.
	 * Tento kontext je potrebne pouzit vzdy, ked je pozadovany vystup appletu.
	 * 
	 * Pri appletoch plati, ze nemusia a vo vacsine pripadov ani neobsahuju metodu main.
	 * 
	 * Applet sa da spustit dvoma sposobmi:
	 * 1. Vo webovom prehliadaci podporujuci Javu
	 * 2. Standardnym prehliadacom appletViewer, ktory je sucastou JDK
	 * 	  -> Je to najjednoduchsi a najrychlejsi sposob ako otestovat applet.
	 */
	
}
