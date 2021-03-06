package a7_triedy;

public class C7_constructorOverload {
//ATRIBUTY
	private String matter;
	private int amountInGrams;
	
//KONSTRUKTORY	
	/*
	 * Tak ako aj metody, je mozne pretazovat aj konstruktory tried.
	 * Predvolenym konstruktorom triedy je prazdny (bezparametricky konstruktor), ktory je implicitne
	 * dosadeny, aj ked ho neuvedieme.
	 * 
	 * Pokial chceme vytvorit objekt s nejakou pociatocnou informaciou, ktoru bude objekt uchovavat,
	 * tak mozeme pouzit konstruktor s jednym alebo viacerymi parametrami. 
	 * Avsak, vytvorenie objektu pomocou bezparametrickeho konstruktora uz nebude mozne, preto ho treba
	 * uviest nech je hoci aj uplne prazdny.
	 */
	public C7_constructorOverload() {
		System.out.println("Vytvoreny nehmotny objekt.\n");
	}
	
	public C7_constructorOverload(String matter) {
		setMatter(matter);													//this.setMatter();
		System.out.println("Objekt vytvoreny z hmoty: "+this.matter+"\n");	//hodnota atributu
	}
	
	public C7_constructorOverload(String matter, int amountInGrams) {
		setMatter(matter);
		setAmountOfMatter(amountInGrams);
		System.out.println("Objekt vytvoreny z hmoty: " + this.matter);
		System.out.println("Pouzite mnozstvo hmoty: " + this.amountInGrams+"g");
	}
	
//SETTER PRE NAZOV HMOTY	
	public void setMatter(String matter) {
		this.matter = matter;
	}
//GETTER PRE NAZOV HMOTY	
	public String getMatter() {
		return matter;
	}
//SETTER PRE MNOZSTVO HMOTY V GRAMOCH	
	public void setAmountOfMatter(int amountInGrams) {
		this.amountInGrams = amountInGrams;
	}
//GETTER PRE MNOZSTVO HMOTY V GRAMOCH	
	public int getAmountOfMatter() {
		return amountInGrams;
	}
	
//HLAVNA FUNKCIA
	public static void main(String[] args) {
	/*Vytvorenie objektu bezparametrickym konstruktorom.*/
		C7_constructorOverload predmet1 = new C7_constructorOverload();
		predmet1.setMatter("Drevo");
		predmet1.setAmountOfMatter(826_100);
		
	/*Vytvorenie objektu jednoparametrickym konstruktorom.*/	
		C7_constructorOverload predmet2 = new C7_constructorOverload("Hlina");
	
	/*Vytvorenie objektu dvojparametrickym konstruktorom.*/	
		C7_constructorOverload predmet3 = new C7_constructorOverload("Zlato", 6);	
	}
}







