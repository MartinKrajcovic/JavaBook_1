package c1_vlakna;
/*
 * Niekedy vsak vlakna musia svoju cinnost koordinovat, a preto
 * potrebuju prostriedky k vzajomnej komunikacii behom spracovania.
 * 
 * K zaisteniu komunikacie medzi vlaknami v programe sluzia metody
 * wait(), notify() a notifyAll().
 * Tieto metody musia byt volane zo synchronizovaneho kontextu.
 * 
 * Metoda wait()      -> hovori vlaknu, ze ma opustit monitor a pozastavit
 * 					     svoju cinnost. Pretazena verzia tejto metody umoznuje
 * 					     definovat cas v ms, ktorym urcime dobu cakacej doby
 * 					     pozastaveneho vlakna.
 * Medota notify()    -> hovori vlaknu, ktore bolo pozastavene metodou wait(),
 * 					     aby sa zobudilo a prevzalo vlastnicvo monitoru.
 * Metoda notifyAll() -> prebudi vsetky vlakna cakajuce na monitor. Avsak vlakno
 * 						 s najvyssou prioritou sa stane prvym  vlastnikom monitoru.
 */
class Q {
	int n;
	boolean valueSet = false;
	/**
	 * V tejto metode je volana metoda wait(), ktora sposobi pozastavenie
	 * vykonavania tejto metody az do doby, kedy instancia triedy Maker
	 * oznami, ze nejake data su pripravene.
	 * Po nacitani dat, metoda get() vola metodu notify(), ktora vravi
	 * instancii triedy Maker, ze je mozne vlozit dalsie data do radu.
	 */
	synchronized int get() {
		while(!valueSet) {	//ak je hodnota valueSet false, co pri starte programu je
			try {			//metoda get() bude cakat, kym nebude upozornena na
				wait();		//vlozenie nejakych dat metodou put(), pre ktoru podmienka plati
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vybrata hodnota: " + n);
		valueSet = false;
		notify();
		return n;
	}
	/**
	 * V tejto metode, je volana metoda wait(), ktora pozastavuje beh do
	 * okamihu kym instancia triedy Consumer odstrani data z rady.
	 * Hned ako sa beh metody obnovi, su do rady vlozene dalsie data a
	 * nasledne je volana metoda notify().
	 * Na zaklade toho sa instancia triedy Consumer dozveda, ze moze z
	 * radu nacitat dalsie data.
	 */
	synchronized void put(int num) {
		while (valueSet) {	//pri starte je premenna rovna false, to znamena, ze metoda
			try {			//vlakno nezastavi, ale vlozi hodnotu do premennej instancie n
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		n = num;
		valueSet = true;	//zmeni premennu na hodnotu true -> udaj bol vlozeny
		notify();			//notifikuje cakajuce vlakno, ktore chce udaj vybrat
							//pomocou metody get()
		System.out.println("Vlozena hodnota: " + n);
	}
 }

class Maker implements Runnable {
	Q q;	//odkaz na objekt triedy Q, ktorej metodu bude vlakno volat
	
	Maker(Q q) {
		this.q = q;	//ziskanie odkazu na vytvoreny objekt typu Q
		new Thread(this, "Maker").start();	//vytvorenie vlakna
	}
	
	@Override
	public void run() {
		int i = 0;
		while (i < 100) {
			q.put(i++);	//tato metoda sa vykona, len v pripade, ze druhe vlakno
		}				//uz vybralo prvu vlozenu hodnotu.
	}
}

class Consumer implements Runnable {
	Q q;	//odkaz na objekt triedy Q, ktorej metodu bude vlakno volat
	
	Consumer(Q q) {
		this.q = q;	//ziskanie odkazu na vytvoreny objekt typu Q
		new Thread(this, "Consumer").start();	//vytvorenie vlakna
	}
	
	@Override
	public void run() {
		int i = 0;
		while (i < 100) {
			q.get();	//tato metoda sa vykona len v pripade, ze druhe vlakno
			i++;		//uz vlozilo nejaku hodnotu pomocou metody put()
		}
	}
}
/**
 * Vysledkom celeho tohto kodu je synchronne spravanie.
 */
public class V7_komunikaciaMedziVlaknami {
	
	@SuppressWarnings("unused")	//lebo objekty m a c nie su pouzite nikde
	public static void main(String[] args) {
	
		Q q = new Q();
		Maker m = new Maker(q);
		Consumer c = new Consumer(q);
	}
}