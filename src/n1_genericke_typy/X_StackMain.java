package n1_genericke_typy;

import b4_vynimky.FullStackException;
import b4_vynimky.EmptyStackException;

public class X_StackMain {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread();
		
		//vytvorenie fixneho zasobniku a dynamickeho zasobniku
		X_Stack<String> stack_1 = new X_FixedStack<>(3);
		X_DynamicStack<Integer> stack_2 = new X_DynamicStack<>(2);

		
		//naplnenie a vypis zasobniku s fixnou velkostou
		System.out.println("Naplnenie zasobniku: stack_1: ");
		try {
			stack_1.push("stack_1: prvok_1");
			stack_1.push("stack_1: prvok_2");
			stack_1.push("stack_1: prvok_3");
			stack_1.push("stack_1: prvok_4");
		} catch (FullStackException fse) {
			System.err.println("stack_1 je plny..");
		} finally {
			System.out.println("Koniec naplnania zasobniku: stack_1\n");
		}
				
		Thread.sleep(500);
		
		System.out.println("Vypis hodnot zasobniku: stack_1: ");
		try {
			for (int i = 0; i < 4; i++)
				System.out.println(stack_1.pop());
		} catch (EmptyStackException ese) {
			System.err.println("stack_1 je prazdny..");
		} finally {
			System.out.println("Koniec vypisu hodnot zasobniku: stack_1\n");
		}

		
		//naplnenie a vypis zasobniku s dynamickou velkostou
		System.out.println("Naplnenie zasobniku: stack_2");
		for (int i = 0; i < 10; i++)	//velkost zasobnika sa zvacsuje (length * 2)
			stack_2.push(i + 1);
		System.out.println("Koniec naplnania zasobniku: stack_2");
		
		Thread.sleep(500);
		
		System.out.println("Vypis hodnot zasobniku: stack_2: ");
		try {
			for (int i=0; i<stack_2.getSize(); i++) {
				System.out.println(stack_2.pop());
			}
		} catch (EmptyStackException ese) {
			System.err.println("stack_2 je prazdny..");
		} finally {
			System.out.println("Koniec vypisu hodnot zasobniku: stack_2");
		}
	}
}
