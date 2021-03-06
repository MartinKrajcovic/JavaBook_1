package n1_genericke_typy;

import b4_vynimky.EmptyStackException;
/**
 * <h3>class DynamicStack</h3>
 * Tato trieda je nazornou ukazkou generickej implementacie zasobniku
 * s dynamickou/automaticky rozsirovanou velkostou.
 * <p>Pri vytvoreni instancie tejto triedy je vytvoreny zasobnik s
 * implicitnou pociatocnou velkostou 10, alebo pri pouziti pretazeneho 
 * konstruktora prijmajuceho celociselny argument je mozne tuto pociatocnu
 * velkost explicitne nastavit:<br>
 * <center><font face="courier"> X_DynamicStack stack = new X_DynamicStack(2); 
 * //zasobnik s pociatocnou hodnotou 2</font></center><br>
 * Tu vsak plati, ze pri prekroceni limitu zasobniku sa jeho velkost automaticky
 * zvysuje na dvojnasobok aktualnej velkosti (z 2 na 4, z 4 na 8 atd.)<br>
 * Tato trieda implementuje dve metody pre pracu so zasobnikom:
 * <ul>
 * <li><font face="courier">push(T element)</font></li>
 * <li><font face="courier">pop()</font></li>
 * </ul></p>
 * @param <T> specifikuje typovy parameter. Tento typ bude nahradeny
 * skutocnym datovym typom pri vytvoreni objektu tejto triedy.
 */
public class X_DynamicStack<T> implements X_Stack<T> {
	private T[] stack;
	private int pointer;
	
	@SuppressWarnings("unchecked")
	public X_DynamicStack() {
		stack = (T[]) new Object[10];
		pointer = -1;
	}
	
	@SuppressWarnings("unchecked")
	public X_DynamicStack(int initLength) {
		stack = (T[]) new Object[initLength];
		pointer = -1;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void push(T element) {
		if (pointer == stack.length-1) {
			T[] temp = (T[]) new Object[stack.length * 2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
			stack[++pointer] = element;
		} else
			stack[++pointer] = element;
	}

	@Override
	public T pop() {
		if (pointer < 0)
			throw new EmptyStackException();
		return stack[pointer--];
	}
	/**
	 * Tato metoda vracia aktualnu velkost zasobniku.
	 * Tento udaj je viac nez vhodny pri vytahovani
	 * prvkov zo zasobniku pomocou cyklu, kde moze byt
	 * jeho aktualna velkost pouzita ako podmienka
	 * iteracnej premennej.
	 * @return Aktualnu velkost zasobniku
	 */
	public int getSize() {
		return stack.length;
	}
}
