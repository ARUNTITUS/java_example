package Class_Program.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<Integer>();
		System.out.println("is empty check: "+stack.isEmpty());
		
		
		stack.add(56);
		stack.push(10);
		stack.push(21);
		stack.push(23);
		stack.push(27);
		
		System.out.println(stack);
		
		int last_removed_value = stack.pop();
		
		
		System.out.println("last_removed_value: "+last_removed_value);
		System.out.println("updated; "+stack);
		
		
		/*stack.empty();
		String empty = null; */
	//	System.out.println("After;"+ empty);
		stack.peek();
		stack.capacity();
		stack.clone();
		
		System.out.println(stack.clone());
		
		
	}

}
