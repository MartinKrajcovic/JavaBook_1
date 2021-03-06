package j1_instanceOf;
/*
 * V niektorych pripadoch je vhodne mat moznost v dobe behu programu, zistit
 * typ nejakeho objektu. Sucastou naseho programu moze byt napriklad nejake
 * vlakno generujuce objekty roznych typov a ine vlakno, ktore tieto objekty
 * spracovava.
 * V tejto situacii by pre spracovavajuce vlakno mohlo byt uzitocne poznat 
 * typ kazdeho objektu, ktory prijma. Dalsia situacia, v ktorej je znalost
 * typu objektu v dobe behu dolezita, suvisi s pretypovanim. V Jave totiz
 * plati, ze neplatne pretypovanie vedie k behovej chybe. Mnoho neplatnych
 * pretypovani je mozne zachytit uz v dobe kompilacie. Avsak pretypovenie
 * zahrnujuce hierarchie tried moze viest k takym neplatnym pretypovaniam,
 * ktore je mozne rozpoznat len v dobe behu.
 * Logicky operator instanceof je riesenim na tuto situaciu.
 * 
 * 		objref instanceof typ
 * 
 * objref je odkazom na instanciu nejakej triedy a typ je typom triedy. Ak
 * je objref zadaneho typu, ci je mozne ho na dany typ pretypovat, tak
 * vysledkom bude true.
 * To znamena, ze operator instanceof je tym prostriedkom, pomocou ktoreho
 * moze nas program ziskat informacie o type nejakeho objektu v dobe behu.
 * 
 * Da sa vsak povedat, ze vo vacsine programov operator instanceof zrejme
 * vobec nevyuzijeme, pretoze zvycajne pozname typy objektov, s ktorymi
 * pracujeme. Avsak pri zlozitej hierarchii tried je tento operator uzitocny.
 */
class A { int i, j; }
class B { int i, j; }
class C extends A { int i, j; }
class D extends A {	int i, j; }

public class InstanceOf {
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		if (a instanceof A)
			System.out.println("a je instanciou typu A");
		if (b instanceof B)
			System.out.println("b je instanciou typu B");
		if (c instanceof C)
			System.out.println("c je instanciou typu C");
		if (c instanceof A)
			System.out.println("c sa da pretypovat na typ A");
		if (a instanceof C)
			System.out.println("a sa da pretypovat na typ C");
		System.out.println();
		
		//porovnanie typov odvodenych typov
		A ob;
		ob = d; //odkaz na d
		System.out.println("ob sa odkazuje na d");
		if (ob instanceof D)
			System.out.println("ob je instanciou typu D");
		
		System.out.println();
		
		ob = c; //odkaz na c
		System.out.println("ob sa odkazuje na c");
		if (ob instanceof D)
			System.out.println("ob sa da pretypovat na typ D");
		else
			System.out.println("ob sa neda pretypovat na typ D");
		
		if (ob instanceof A)
			System.out.println("ob sa da pretypovat na typ A");
		else
			System.out.println("ob sa neda pretypovat na typ A");
		
		System.out.println();
		
		//vsetky objekty sa daju pretypovat na typ Object
		if (a instanceof Object)
			System.out.println("a sa da pretypovat na typ Object");
		if (b instanceof Object)
			System.out.println("b sa da pretypovat na typ Object");
		if (c instanceof Object)
			System.out.println("c sa da pretypovat na typ Object");
		if (d instanceof Object)
			System.out.println("d sa da pretypovat na typ Object");
	}
}

