package b4_vynimky;
/**
 * Tato prisposobena vynimka ma opisovat podtecenie limitu
 * zasobniku, ktory je deklarovany ako pole.
 * Vyhodenie tejto vynimky sa hodi vtedy, ak sa ma program po
 * vytiahnuti uz posledneho prvku zo zasobniku pokusat o dalsie
 * vytiahnutie prvku z daneho zasobniku.
 * Ked je uz zasobnik plny, tato vynimka na to upozornuje.
 * @see n1_genericke_typy.X_FixedStack
 * @see n1_genericke_typy.X_DynamicStack
 */
@SuppressWarnings("serial")
public class EmptyStackException extends ArrayIndexOutOfBoundsException {
	private String message;
	
	public EmptyStackException() {
		super();
		message = "Stack is empty !";
	}
	
	public EmptyStackException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": " + message;
	}
}
