package b2_rozhrania;

public class StackTest {
	
	public static void main(String[] args) {
		Stack stackReference;
		
		stackReference = new FixedStack(2);
		
		//Naplnenie zasobniku s pevnou velkostou
		stackReference.push(4);
		stackReference.push(44);
		stackReference.push(13); // sposobi pretecenie zasobniku, 13 sa nevlozi
		
		//Vypisanie hodnot ulozenych v zasobniku
		System.out.println(stackReference.pop());
		System.out.println(stackReference.pop());
		System.out.println(stackReference.pop()); //tu uz zasobnik podtecie a vypise -1
		
		
		stackReference = new DynamicStack(2);
		
		//Naplnenie dynamickeho zasobniku, ktoreho velkost sa zvacsuje podla potreby
		for (int i=0; i<8; i++)	//zasobnik sa zvacsi z 2 na 4 a z 4 na 8
			stackReference.push(i+1);
		
		//Vypisanie hodnot ulozenych v zasobniku
		for (int i=0; i<stackReference.getSize(); i++)
			System.out.println(stackReference.pop());
	}
}
