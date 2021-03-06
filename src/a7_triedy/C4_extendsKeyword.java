package a7_triedy;
/**
 * Tato trieda reprezentuje druhy koncept OOP, ktorym je dedicnost.
 * Vysvetluje ako sa dedicnost v praxi vyuziva.
 */
public class C4_extendsKeyword extends C3_thisKeyword {
	/*
	 * Tato trieda (C4_extendsKeyword) pomocou klucoveho slova 'extends' v hlavicke triedy
	 * uvadza dalsiu triedu (C3_thisKeyword), od ktorej bude tato trieda (C4_extendsKeyword)
	 * dedit vsetky vlastnosti, atributy a metody.
	 * 
	 * Tato trieda (C4_extendsKeyword) vsak moze pridat specifickejsie atributy, ktore su pre
	 * nu klucove alebo charakteristickejsie.
	 * 
	 * Klucove slovo 'extends' moze byt v hlavicke triedy pouzite iba raz, z coho vypliva, ze
	 * dana trieda moze mat iba jedneho priameho predka od ktoreho dedi svoje vseobecne vlastnosti.
	 */
	private String nickName;		//definicia sukromneho atributu 'prezyvka'
									//tato trieda ma vsak zdedene atributy 'meno' a 'vek'

//SETTER PRE PREZYVKU	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
//GETTER PRE PREZYVKU	
	public String getNickName() {
		return this.nickName;
	}
	
}
/*
 * Az dalsia trieda (C5_creatingObjects) demonstruje ako vyzera dedenie a pristup k rodicovskym
 * clenom v praxi. Teraz si je vsak dolezite zapamatat pouzitie klucoveho slova 'extends' a co znamena.
 */