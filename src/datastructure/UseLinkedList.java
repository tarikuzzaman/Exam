package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		LinkedList<String> ob = new LinkedList<String>();
		ob.add("Victor");
		ob.add("Charles");
		ob.add(2,"Zaman");
		ob.add(3,"Kazi");
		ob.addFirst("First element");
		ob.addLast("Last element");
		ob.remove(2);
		ob.remove("Kazi");
		System.out.println(ob);
		//Retrieve element using for each loop
		for(String str: ob){
			System.out.println(str);
		}
		//Retrieve element using for iterator and while loop
		Iterator it = ob.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}

