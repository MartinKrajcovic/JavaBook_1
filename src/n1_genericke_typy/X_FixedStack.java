package n1_genericke_typy;

import b4_vynimky.EmptyStackException;
import b4_vynimky.FullStackException;
/**
 * <h3>class FixedStack</h3>
 * Tato trieda je nazornou ukazkou generickej implementacie zasobniku 
 * s pevnou velkostou.
 * <p>Pri vytvoreni instancie tejto triedy je fixne dana velkost 
 * zasosbiku predom neznameho typu na implicitnu velkost 10, alebo 
 * pri pouziti pretazeneho konstruktora prijmajuceho celociselny 
 * argument je mozne tuto fixnu velkost zasobniku zadat explicitne:<br>
 * <center><font face="courier"> X_FixedStack stack = new X_FixedStack(56); 
 * //zasobnik o velkosti 56</font></center><br>
 * Tato trieda implementuje dve metody pre pracu so zasobnikom:
 * <ul>
 * <li><font face="courier">push(T element)</font></li>
 * <li><font face="courier">pop()</font></li>
 * </ul></p>
 * @param <T> specifikuje typovy parameter. Tento typ bude nahradeny
 * skutocnym datovym typom pri vytvoreni objektu tejto triedy.
 */
public class X_FixedStack<T> implements X_Stack<T> {
	private T[] stack;
	private int pointer;
	
	@SuppressWarnings("unchecked")
	public X_FixedStack() {
		stack = (T[]) new Object[10];
		pointer = -1;
	}
	
	@SuppressWarnings("unchecked")
	public X_FixedStack(int length) {
		stack = (T[]) new Object[length];
		pointer = -1;
	}
	
	@Override
	public void push(T element) {
		if (pointer == stack.length-1)
			throw new FullStackException();
		stack[++pointer] = element;
	}

	@Override
	public T pop() {
		if (pointer < 0)
			throw new EmptyStackException();
		return stack[pointer--];
	}
}
