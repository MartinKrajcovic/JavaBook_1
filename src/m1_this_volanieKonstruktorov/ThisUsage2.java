package m1_this_volanieKonstruktorov;
/**
 * Demonstracia pouzitia klucoveho slova 'this' pri volani pretazenych konstruktorov triedy.
 */
public class ThisUsage2 {
	int a;		//lokalna premenna a
	int b;		//lokalna premenna b
	
	//inicializacia premennych rozdielnymi hodnotami
	ThisUsage2(int i, int j) {	//dvojparametricky konstruktor 
		a=i;					//predane hodnoty sa priradzuju lokalnym premennym
		b=j;
	}
	
	//inicializacia premennych na rovnake hodnoty
	ThisUsage2 (int i) {		//jednoparametricky konstruktor
		this(i, i);				//volanie dvojparametrickeho konstruktora a predanie jednej
								//hodnoty, ktora inicializuje obe lokalne premenne
	}
	
	//inicializacia premennych na hodnotu 0
	ThisUsage2() {				//bezparametricky konstruktor
		this(0);				//volanie jednoparametrickeho konstuktora, ten vola dvojparametricky
								//a predava hodnotu 0 na inicializovanie oboch premennych
	}
	
	public static void main(String[] args) {
		
		/*
		 * Pri prevedeni prikazu 'this()' je najskor prevedeny ten pretazeny konstruktor, ktoreho zoznam
		 * parametrov odpoveda zoznamu parametrov prikazu 'this()'.
		 * Nasledne su prevedene dalsie prikazy, ktore su sucastou kodu povodneho konstruktoru.
		 * Pritom plati, ze volanie 'this()' musi byt prvym prikazom kodu konstruktoru.
		 */
		
		ThisUsage2 noParameter = new ThisUsage2();
		System.out.println("BEZPARAMETRICKY KONSTRUKTOR (this(0))");
		System.out.println("premenna a = " + noParameter.a);
		System.out.println("premenna b = " + noParameter.b);
		System.out.println();
		
		ThisUsage2 oneParameter = new ThisUsage2(5);
		System.out.println("JEDNOPARAMETRICKY KONSTRUKTOR (this(i, i))");
		System.out.println("premenna a = " + oneParameter.a);
		System.out.println("premenna b = " + oneParameter.b);
		System.out.println();
		
		ThisUsage2 twoParameter = new ThisUsage2(8, 9);
		System.out.println("DVOJPARAMETRICKY KONSTRUKTOR (a=i; b=j;)");
		System.out.println("premenna a = " + twoParameter.a);
		System.out.println("premenna b = " + twoParameter.b);
		System.out.println();
	}
	
	/*
	 * Hlavnym prinosom pouzivania volania pretazenych konstruktorov pomocou 'this()' je to, ze
	 * toto volanie zabranuje zbytocnemu duplikovaniu kodu. Vo vela pripadoch redukcia duplicitneho
	 * kodu skracuje cas potrebny pre nacitanie triedy, kedze je kod objektu mensi.
	 * Toto je dolezite predovsetkym v programoch sirenych prostrednictvom Internetu, pri ktorych
	 * je doba nacitania zasadnou otazkou.
	 * 
	 * Pouzivanie volania 'this()' moze tiez viest k zvyseniu strukturovanosti kodu, a to predovsetkym
	 * v pripade, ked jednotlive pretazovane konstruktory obsahuju vela duplicitneho kodu.
	 */
}
