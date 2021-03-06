package f1_Input_Output;
/*
 * Sucastou Javy je silna a flexibilna podpora suboroveho a sietoveho I/O.
 * Javovy I/O system je z tohto pohladu kohezny a konzistentny.
 */
public class A0_Prudy {
	/*
	 * 									PRUDY
	 * 
	 * Prudom sa mieni abstrakcia, ktora bud vytvara alebo spotrebovava informacie.
	 * Prud je prepojeny s fyzickym zariadenim pomocou javoveho I/O systemu. Pritom
	 * plati, ze vsetky prudy sa spravaju rovnako, a to aj vtedy, ked sa skutocne
	 * fyzicke zariadenia, s ktorymi su prepojene, lisia.
	 * To znamena, ze pri praci s akymkolvek typom zariadenia mozeme vyuzivat rovnake
	 * triedy a metody I/O. Inak povedane, vstupny prud moze byt abstrakciou roznych
	 * druhov vstupu: vstupu z klavesnice, vstupu zo suboru ulozeneho na disku, ci 
	 * vstupu zo sietoveho socketu.
	 * Prudy su cistym sposobom riesenia vstupu a vystupu, vdaka ktoremu sa nemus
	 * kazda cast naseho kodu zaoberat rodielmi medzi napriklad klavesnicou a sietou.
	 * 
	 * Prudy sa delia do dvoch skupin:
	 * 		1. Bajtove prudy
	 * 		2. Znakove prudy
	 * 
	 * 								BAJTOVE PRUDY:
	 * 
	 * Bajtove prudu predstavuju vyhodny prostriedok pre spracovanie vstupu
	 * a vystupu bajtov. Bajtove prudysa pouzivaju napriklad pri citani, ci
	 * zapise binarnych dat.
	 * Bajtove prudy su definovane pomocou dvoch hierarchii tried. Na vrchole
	 * su dve abstraktne triedy InputStream a OutputStream.
	 * Kazda z tychto tried ma niekolko konkretnych podtried, riesiacich 
	 * rozdiely medzi roznymi zariadeniami, napriklad medzi subormi na disku
	 * a sietovymi pripojeniami, ci dokonca aj vyrovnavacou pamatou.
	 * Pre pracu s prudmi musime inportovat balicek java.io.
	 * Nachadzaju sa tam triedy pre pracu s bajtovymi prudmi ako su napriklad:
	 * 
	 * 		InputStream
	 * 		OutputStream
	 * 		BufferedInputStream		->	Vstupny prud vyuzivajuci vyrovnavaciu pamat
	 * 		BufferedOutputStream	->	Vystupny prud  -||-
	 * 		DataInputStream			->	Vstupny prud s metodami pre citanie standardnych typov
	 * 		DataOutputStream		->	Vystupny prud  -||-
	 * 		FileInputStream			->	Vstupny prud, ktory cita zo suboru
	 * 		FileOutputStream		->	Vystupny prud, ktory zapisuje do suboru
	 * 		ObjectInputStream		->	Vstupny prud pre objekty
	 * 		ObjectOutputStream		->	Vystupny prud  -||-
	 * 		PrintStream				->	Vystupny prud, ktoreho sucastou su metody print() a println()
	 * 
	 * Abstraktne triedy InputStream a OutputStream obsahuju niekolko klucovych
	 * metod implementovanych ostatnymi triedami pre pracu s prudmi. K tym
	 * najdolezitejsim patria metody read() a write(), zaistujuce citanie, resp.
	 * zapis dat.
	 * 
	 * 
	 * 								ZNAKOVE PRUDY:
	 * 
	 * Znakove prudy predstavuju vyhodny prostriedok pre riesenie vstupu a
	 * vystupu znakov. Vyuzivaju znakovu sadu Unicode, a preto je mozne ich
	 * vyuzit aj v medzinarodnom prostredi. V niektorych pripadoch su znakove
	 * prudy efektivnejsie ako bajtove prudy.
	 * Na tej najnizsej urovni prebiehaju vsetky I/O operacie stale na urovni
	 * bajtov. Znakove prudy predstavuju iba pohodlny a efektivny prostriedok
	 * pre spracovanie znakov.
	 * Znakove prudy su definovane pomocou dvoch hierarchii tried. Na ich
	 * vrchole su abstraktne triedy Reader a Writer. Tieto triedy spracovavaju
	 * znakove prudy obsahujuce znaky zo znakovej sady UNICODE.
	 * V balicku java.io sa nachadzaju aj triedy pre pracu so znakovymi prudmi:
	 * 
	 * 		Reader
	 * 		Writer
	 * 		BufferedReader		->	Vstupny znakovy prud vyuzivajuci vyrovnavaciu pamat
	 * 		BufferedWriter		->	Vystupny znakovy prud  -||-	
	 * 		CharArrayReader		->	Vstupny znakovy prud, ktory cita z pola znakov
	 * 		CharArrayWriter		->	Vystupny znakovy prud, ktory zapisuje do pola znakov
	 * 		InputStreamReader	->	Vstupny prud prevadzajuci bajty na znaky
	 * 		OutputStreamWriter	->	Vystupny prud prevadzajuci znaky na bajty
	 * 		StringReader		->	Vstupny prud, ktory cita z retazca
	 * 		StringWriter		->	Vystupny prud, ktory zapisuje do retazca
	 * 
	 * Sucastou tried Reader a Writer su tiez metody read() a write(), umoznujuce
	 * citanie, resp. zapis dat v podobe znakov.
	 */
}
