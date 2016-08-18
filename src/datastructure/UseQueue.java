package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue q = new LinkedList();
		q.add("First");
		q.add("Second");
		q.add("Third");
		System.out.println(q.poll()); //Remove and retrieve the highest priority element
		System.out.println(q.element()); // Retrieves/Displays the head element/highest priority element
		System.out.println(q.peek()); //Displays the element with highest priority

	}

}

