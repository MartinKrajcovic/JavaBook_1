package c1_vlakna;
//							UVOD K VLAKNAM
/*
 * Da sa povedat, ze program vyuzivajuci multithreading pozostava z dvoch, ci
 * viacerych casti, ktore mozu bezat sucasne. Kazda cast takehoto programu sa
 * nazyva vlaknom. Kazde vlakno vlastne definuje samostatnu cestu k vykonavaniu
 * programu. To znamena, ze mutithreading predstavuje specialnu podobu
 * multitaksingu.
 * 
 * Multitasking sa deli do dvoch skupin:
 * 		1. Multiprocesovy multitasking
 * 		2. Multithreadovy multitasking
 * 
 * Multiprocesovy multitasking je vlastnost OS, vdaka ktorej je pocitac schopny
 * sucasne vykonavat dva ci viacere programy. Procesom sa rozumie beziaci program.
 * V pripade tohto typu plati, ze najmensou jednotkou kodu, ktoru je schopny
 * planovac nejako riadit je prave program.
 * 
 * Naopak v pripade multithreadoveho multitaskingu je najmensou jednotkou kodu,
 * ktoru je planovac schopny riadit, vlakno. To znamena, ze jeden program je 
 * schopny vykonavat dve, ci viac uloh naraz.
 * 
 * Dalej plati, ze multithreadovy multitasking vyzaduje mensiu reziu nez ten
 * multiprocesovy.
 * Vsetky vlakna jedneho programu totiz zdielaju roznaky adresny priestor a
 * kooperativne zdielaju tiez rovnaky proces. Vzajomna komunikacia medzi vlaknami
 * nie je niako nakladna, to iste plati aj pri prepinani kontextu z jedneho vlakna
 * do druheho.
 * Multithreading nam umoznuje pisat efektivne programy maximalne vyuzivajuce
 * vypocetny vykon dostupny v nasom systeme. Jednym z dolezitych sposobov, akym
 * mutithreading toto dosahuje je minimalizacia necinneho casu procesora.
 * V pripade jednovlaknoveho prostredia nas program musi cakat na dokoncenie
 * kazdej ulohy a potom moze prejst k vykonavaniu dalsej, a to aj cez to, ze 
 * po vacsinu casu ostane program necinny, pretoze bude cakat na dalsie vstupy.
 * Multithreading nam umoznuje znizenie tyhto necinnych casov, kedze v dobe cakania
 * jedneho vlakna moze bezat druhe, ine vlakno.
 * 
 * V skutocnosti je to tak, ze Java vyuziva vlakna k tomu, aby sa cele prostredie
 * stalo asynchronnym. To pomaha znizovat neefektivitu a to predovsetkym vdaka
 * znizeniu plytvanim cyklov procesoru.
 * 
 * Vlakna mozu mat viacero stavov:
 * 		1. Vlakno moze byt beziace
 * 		2. Vlakno moze byt pripravene na beh
 * 		3. Vlakno moze byt pozastavene
 * 		4. Pozastavene vlakno moze byt obnovene
 * 		5. Vlakno moze byt blokovane
 * 		6. Vlakno moze byt zastavene - neda sa obnovit
 * 
 * Vlakno moze byt pozastavene inym vlaknom, ktore ma vyssiu prioritu.
 * Vlakno sa moze vzdat riadenia aj dobrovolne.
 * 
 */

//							VYTVORENIE VLAKNA
/*
 * Ak chceme vytvorit vlakno, staci ked vytvorime instanciu triedy Thread.
 * Java definuje 2 sposoby, ktore mozeme k tomuto ucelu pouzit:
 * 		1.	implementovat rozhranie Runnable
 * 		2.	rozsirit samotnu triedu Thread
 */
class V0_definicia {
	/**
	 * Metoda main() ako zaciatok programu, vytvara tzv. hlavne vlakno.
	 * To znamena, ze kazdy nas program ma aspon jedno vlakno, ktore sa
	 * prikaz po prikaze vykonava.
	 * Pokial ziskame odkaz na objekt vlakna, tak mozeme manipulovat s
	 * hlavnym vlaknom tak, ako s kazdym inym vlaknom.
	 */
	public static void main(String[] args) {
		/*
		 * Trieda Thread zapuzdruje vlakno.
		 * Pomocou statickej metody currentThread() tejto
		 * triedy, mozeme ziskat odkaz na aktualne vlakno. 
		 */
		Thread hlavneVlakno = Thread.currentThread();
		
		//zobrazenie definicie vlakna
		System.out.println(hlavneVlakno);
		
		/*
		 * Vo vystupe je vidiet Thread[main,5,main]
		 * 		1. Slovo 'Thread' signalizuje, ze ide o vlakno.
		 * 		2. V hranatych zatvorkach je vypisana definicia vlakna:
		 * 		   a) nazov vlakna
		 * 		   b) priorita vlakna (1=MIN_PRIORITY, 5=NORM_PRIORITY, 10=MAX_PRIORITY)
		 * 		   c) skupina, v ktorej sa vlakno nachadza 
		 */
	}
}