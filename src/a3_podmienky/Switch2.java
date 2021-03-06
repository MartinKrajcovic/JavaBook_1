package a3_podmienky;
/**
 * Tento program demonstruje prepadanie v prikaze 'switch'
 */
public class Switch2 {
/**
 * Tento program vykonava nasledovne:
 * Inicializujeme premennu typu 'char', do ktorej sa bude ukladat zakaznikova
 * poziadavka na typ licencie, ktoru chce zakupit.
 * Program vypise informacne hlasenie/popis pre zakaznika.
 * Nasledne prikaz 'switch' kontroluje zakaznikovu volbu s danymi moznostami.
 * Zakaznik si moze vybrat zo 4 licencii : 3x Windows a 1x Office, pricom
 * pri vybere Windows Pro verzie dostane zakaznik automaticky Office zadarmo
 * ako darcek.
 */
	public static void main(String[] args) {
		char licenciaMicrosoft = 's';
		
		System.out.println("VYBRALI STE SI LICENCIU: \n");
		
		//chyba je v citlivosti na velkosti pismen
		switch (licenciaMicrosoft) {
		case 'S' :		//prepadanie -> takto mozeme do premennej zadat velke ale aj male 's'
		case 's' :		
			System.out.println("Windows 10 Standard");
			break;
		case 'H' :
			System.out.println("Windows 10 Home");
			break;
		case 'P' :		//prepadanie -> v tejto moznosti chyba prikaz 'break', takze vypis pokracuje
			System.out.println("Windows 10 Pro");		
		case 'O' :
			if(licenciaMicrosoft == 'P') {
				System.out.println("Microsoft Office 365 - zadarmo");
			} else
				System.out.println("Microsoft Office 365");
			break;
		default :
			System.out.println("Takuto licenciu nemame v ponuke!");
		}
	}
}
