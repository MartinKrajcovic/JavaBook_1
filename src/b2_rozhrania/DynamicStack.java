package b2_rozhrania;

public class DynamicStack implements Stack {

	private int[] stack;
	private int pointer;
	
	public DynamicStack() {
		stack = new int[10];
		pointer = -1;
	}
	
	public DynamicStack(int initialSize) {
		stack = new int[initialSize];
		pointer = -1;
	}
	
	@Override
	public void push(int item) {
		if (pointer == stack.length-1) {
			int[] temp = new int[stack.length * 2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
			stack[++pointer] = item;
		} else
			stack[++pointer] = item;
	}

	@Override
	public int pop() {
		if (pointer < 0) {
			System.err.println("DynamicStack is empty!");
			return -1;
		}
		return stack[pointer--];
	}
	
	public int getSize() {
		return stack.length;
	}
}
