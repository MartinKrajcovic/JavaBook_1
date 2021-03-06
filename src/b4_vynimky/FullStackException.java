package b4_vynimky;
/**
 * Tato prisposobena vynimka ma opisovat pretecenie limitu
 * zasobniku, ktory je deklarovany ako pole.
 * Tuto vynimku je vhodne vyhodit ked ma zasobnik fixnu 
 * velkost, a ak tato velkost moze byt presiahnuta pri
 * pokuse vlozit do zasobniku prvok nad specifikovany ramec.
 * @see n1_genericke_typy.X_FixedStack
 */
@SuppressWarnings("serial")
public class FullStackException extends IndexOutOfBoundsException {
	private String message;
	
	public FullStackException() {
		super();
		message = "Stack is full !";
	}
	
	public FullStackException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": " + message;
	}
}
