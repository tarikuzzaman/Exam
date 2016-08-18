package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		ArrayList<String> ob = new ArrayList<String>();

		ob.add("77877");
		ob.add("88988");
		ob.add("99199");
		ob.add("10101");
		ob.remove(2);
		//For each loop to retrieve data
		for(String word: ob){
			System.out.println(word);
		}
		//WHile loop with iterator to retrieve data
		Iterator it = ob.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}





	}
}
