package stack;

import java.util.Stack;

public class MyClass {
	public static void main(String[] args) {
		Stack<String> stack = new  Stack<String>();
		stack.add("Tom");
		stack.add("and");
		stack.add("Jerry");
		stack.add("Ben-10");
		stack.add("Chotta Bheem");
		stack.add("movies");
		System.out.println(stack);
		stack.remove("movies");
		System.out.println(stack);
	}

}
