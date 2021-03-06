package f1_Input_Output;
/*
 * 							PREDDEFINOVANE PRUDY
 * 
 * Vsetky programy automaticky importuju balicek java.lang, ktory obsahuje
 * triedu s nazvom System, ktora predstavuje zapuzdrenie niekolko aspektov
 * behoveho prostredia.
 * Trieda System obsahuje tri preddefinovane premenne typu in, out a err.
 * Tieto polia su v ramci triedy System deklarovane ako public, static a final.
 * Prud System.out predstavuje standardny vystupny prud.
 * Vo vychodzom nastaveni plati, ze tymto prudom je konzola. Prud System.in
 * zase predstavuje standardny vstupny prud, ktorym je vychodzim nastavenim
 * klavesnica. Nakoniec System.err predstavuje standardny chybovy prud, pricom
 * vo vychodzom nastaveni plati, ze tymto prudom je opat konzola.
 * 
 * System.in je objektom typu InputStream, zatial co System.out a System.err
 * su objektami typu PrintStream. Je nutne zdoraznit, ze ide o bajtove prudy
 * pretoze sa typycky pouzivaju pre citanie znakov z konzoly a zapis znakov
 * na konzolu.
 */
public class A1_SystemOutput {

	public static void main(String[] args) {
		/*
		 * Standardny Systemovy vystup, resp. vypis udajov na
		 * standardny vystup monitor/konzola je nam uz znami.
		 * Pouzivame ho uz bez toho, aby sme sa nad nim zamyslali.
		 * 
		 * Pre zopakovanie, vid tri rozne prikazy uvedne nizsie.
		 */
		System.err.println("Chybova sprava so zalomenym riadkom.");
		System.out.println("Text so zalomenym riadkom.");
		System.out.print  ("Text bez zalomenia riadku.");
		
	}
	
}
