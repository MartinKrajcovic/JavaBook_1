package n1_genericke_typy;
/*
 * Chyby nejednoznacnosti vznikaju vtedy, ked vymazanie typov
 * pri dvoch zdaleka odlisnych generickych deklaracii vedie k
 * tomu, ze su tieto genericke deklaracie prekladane na zhodny
 * vymazany typ.
 * 
 * Ako uz bolo spomenute, genericke typy sa pri vytvarani objektu
 * vymazu a implicitne budu nahradene typom Object.
 * Z tohto vyplyvaju aj obmedzenia generickych typov, uvedenych
 * v dalsej triede.
 */
public class GenH_Nejednoznacnost<T, V> {
	private T obj1;
	private V obj2;
	
	/*
	 * Nasledujuce metody vykazuju chybu nejednoznacnosti v dobe
	 * kompilacie. Aj ked ide o odlisne genericke typy, pri 
	 * vytvarani objektu sa tieto typy vymazu a nahradia typom
	 * Object.
	 * 
	 * V skutocnosti budu mat tieto pretazene metody takuto signaturu:
	 * 
	 * 		public void setObj(Object obj1)
	 * 		public void setObj(Object obj2)
	 * 
	 * Ked si vsimneme, dokonca ani nemusi ist o dva odlisne typy,
	 * nakolko oba typove parametre mozu obsahovat typ rovnakeho
	 * objektu t.j.
	 * 
	 * 		GenH_Nejednoznacnost<String, String> 
	 * 
	 * V tomto pripade budu obe metody setObj() identicke kedze
	 * parameter T aj V su typu String. A to je samozrejme chyba.
	 * To znamena, ze pretazenie metody setObj() o ktore sme sa
	 * pokusili v tejto triede je prirodzene nejednoznacne.
	 */
//	public void setObj(T obj1) {
//		this.obj1 = obj1;
//	}
	
//	public void setObj(V obj2) {
//		this.obj2 = obj2;
//	}
	/*
	 * Poznamka:
	 * 
	 * V takychto pripadoch je lepsie sa vyhnut pretazovaniu metod,
	 * a zvolit adekvatne rozlicne nazvy danych metod.
	 */
}
