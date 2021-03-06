package n1_genericke_typy;

/*
 * Zoliky sa daju obmedzit prakticky rovnakym sposobom akym sa obmedzuju typove parametre.
 * Obmedzeny zolik je dolezity predovsetkym vtedy, ked sa snazime vytvorit genericky typ, ktory
 * bude pracovat s celou hierarchiou tried. 
 */

class TwoD {				//trieda uchovavajuca 2 rozmery
	int x, y;				//-> vsetky ostatne triedy s rozmermi od nej dedia
	TwoD(int a, int b) {
		x=a;
		y=b;
	}
}
class ThreeD extends TwoD {	//trieda uchovavajuca 3 rozmery
	int z;
	ThreeD(int a, int b, int c) {
		super(a, b);
		z=c;
	}
}
class FourD extends ThreeD {//trieda uchovavajuca 4 rozmery 	
	int t;
	FourD(int a, int b, int c, int d) {
		super(a, b, c);
		t=d;
	}
}
/**
 * Tato trieda specifikuje typovy parameter obmedzeny typom TwoD. To znamena, ze do akehokolvek
 * pola ulozeneho v objekte typu Coordinates sa daju ulozit objekty typu TwoD alebo ktorakolvek
 * z jeho podtried.
 */
class Coordinates<T extends TwoD> {
	T[] coord;
	
	Coordinates(T[] coord) {
		this.coord = coord;
	}
}

public class Gen8_ObmedzeneZoliky {	
	/**
	 * Tato metoda zobrazujuca suradnice X a Y je schopna zobrazit obsah
	 * ktorehokolvek objektu typu Coordinates, pretoze kazda trieda od TwoD
	 * ma tieto dve az viacere suradnice. 
	 */
	static void showXY(Coordinates<?> c) {
		System.out.println("Suradnice X, Y: ");
		for (int i = 0; i < c.coord.length; i++) {
			System.out.println(c.coord[i].x + " " + c.coord[i].y);
		}
		System.out.println();
	}
	/**
	 * Nie kazda trieda s obmedzenim TwoD ma tri rozmery, aby ich bolo mozne
	 * vypisat. Preto pouzijeme obmedzeny zolik na triedu ThreeD a jeho potomkov.
	 * Pretoze kazda od triedy ThreeD ma bud tri alebo viacere suradnice.
	 */
	static void showXYZ(Coordinates<? extends ThreeD> c) {
		System.out.println("Suradnice X, Y, Z: ");
		for (int i = 0; i < c.coord.length; i++) {
			System.out.println(c.coord[i].x + " " + c.coord[i].y + " " + c.coord[i].z);
		}
		System.out.println();
	}
	/**
	 * Tato medota zobrazuje vsetky suradnice (kazdy rozmer).
	 * Zolikom je obmedzena horna hranica pre triedu, ci objekty typu FourD,
	 * pretoze kazda z nich bude mat viac ako tri suradnice (t.j. styri suradnice).
	 */
	static void showAll(Coordinates<? extends FourD> c) {
		System.out.println("Suradnice X, Y, Z, T: ");
		for (int i = 0; i < c.coord.length; i++) {
			System.out.println(c.coord[i].x + " " + c.coord[i].y + " " + c.coord[i].z + " " + c.coord[i].t);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TwoD td[] = {			//vytvorenie pola objektov typu TwoD a urcenie ich suradnic
				new TwoD(0, 0),
				new TwoD(7, 9),
				new TwoD(18, 4),
				new TwoD(-1, -23)
		};
		
		Coordinates<TwoD> tdObj = new Coordinates<>(td);	//Coordinates, ktory dostane objekt so suradnicami
		System.out.println("OBSAH OBJEKTU tdObj: ");
		showXY(tdObj);	// OK, je to objekt typu TwoD
//		showXYZ(tdObj);	// chyba, nie je to objekt ThreeD
//		showAll(tdObj);	// chyba, nie je to objekt FourD
		
		FourD fd[] = {			//vytvorenie pola objektov typu FourD a urcenie ich suradnic
				new FourD(1, 2, 3, 4),
				new FourD(6, 8, 14, 8),
				new FourD(22, 9, 4, 9),
				new FourD(3, -2, -23, 17)
		};
		Coordinates<FourD> fdObj = new Coordinates<>(fd);	//Coordinates, ktory dostane objekt so suradnicami
		System.out.println("OBSAH OBJEKTU fdObj: ");
		//vsetky volania uvedene nizsie su v poriadku
		showXY(fdObj);	// OK, pozadujeme X a Y od objektu FourD
		showXYZ(fdObj);	// OK, pozadujeme X, Y a Z od objektu FourD
		showAll(fdObj);	// OK, pozadujeme X, Y, Z a T od objektu FourD
	}	
}



