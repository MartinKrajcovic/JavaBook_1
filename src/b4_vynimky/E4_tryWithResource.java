package b4_vynimky;
/**
 * Tato trieda demonstruje holu syntax pouzitia 'try-with-resources' blok,
 * ktory za nas automaticky uzatvara prostriedky spojenia.
 */
public class E4_tryWithResource {

	/*
	 * Prakticke vyuzitie try-with-resources bude cvicene
	 * pri praci so subormi a dotazovanim databaze
	 */
	
	public void main(String[] args) {
		
		//gulate zatvorky a nasledne otorenie tela
//		try ( /* Zdroje - spojenia so subormi, s databazou a pod.. */ ){
//			
//			/*
//			 *	kod v ktorom moze prist k zachyteniu vynimky 
//			 */
//		
//		} catch ( /* Osetrovana vynimka */ ) {	//klasicky blok 'catch'
//			
//		} 
		
		/*
		 * Nie je potrebny ziaden blok 'finally', ani rucne uzatvaranie spojeni a prostriedkov.
		 * Technologia AutoClosable uzavrie spojenia sama, po tom ako prestaneme prostriedky vyuzivat.
		 */	
	}
	
}
