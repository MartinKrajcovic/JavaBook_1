package b2_rozhrania;
/**
 * Toto rozhranie demonstruje strukturu, ktorej by sa malo kazde rozhranie drzat.
 * (Tak ako trieda, aj hlavny interface moze mat dva modifikatory pristupu: public a default)
 */
public interface A_Interface_structure {
	
	/*
	 * Rozhranie moze definovat aj premenne, no iba v podobe konstant.
	 * Aj posledna deklaracia je konstantou, kedze interface implicitne
	 * definuje vsetky svoje premenne ako static a final.
	 */
	
	public static final int KONSTANTA = 1;
	
	public final int KONSTANTA_2 = 2;
	
	final int KONSTANTA_3 = 3;
	
	int KONSTANTA_4 = 4;
	
	/*
	 * Nizsie su uvedene deklaracie (nie definicie) metod, ktore
	 * ako je uvedene, mozu mat navratovy typ, parametre, no ziadne
	 * telo.
	 * 
	 * Tieto metody budu musiet byt prepisane/prekryte v triede, ktora
	 * sa o toto rozhranie rozsiri. (V nasom pripade ide o triedu 'Interface_work')
	 */
	
	public void read();
	
	public String discuss();
	
	public void sendEmail(String message);
	
}

