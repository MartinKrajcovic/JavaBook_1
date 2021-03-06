package b2_rozhrania;

public class FixedStack implements Stack {

	private int[] stack;
	private int pointer;
	
	public FixedStack() {
		stack = new int[10];
		pointer = -1;
	}
	
	public FixedStack(int size) {
		stack = new int[size];
		pointer = -1;
	}
	
	@Override
	public void push(int item) {
		if (pointer == stack.length-1)
			System.err.println("FixedStack is full!");
		else
			stack[++pointer] = item;
	}

	@Override
	public int pop() {
		if (pointer < 0) {
			System.err.println("FixedStack is empty!");
			return -1;
		}
		return stack[pointer--];
	}
	
	public int getSize() {
		return stack.length;
	}
}
