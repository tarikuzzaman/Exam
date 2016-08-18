package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Stack stack = new Stack();
		stack.push("One");
		stack.push("Two");
		stack.push("Three");

		stack.push("Four");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.push("Element");
		System.out.println(stack.peek());
		if(!stack.empty())
			System.out.println("Stack isnt empty");

	}

}
