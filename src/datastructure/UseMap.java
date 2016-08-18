package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> city = new ArrayList<String>();
		city.add("VA");
		city.add("Alexandria");
		city.add("Woodbridge");

		List<String > cityDhaka = new ArrayList<String>();
		cityDhaka.add("Gulshan");
		cityDhaka.add("Jatrabari");

		List<String> cityNewyork = new ArrayList<String>();
		cityNewyork.add("Manhattan");
		cityNewyork.add("Queens");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("VA",city);
		map.put("Gulshan",cityDhaka);
		map.put("Queens",cityNewyork);
		for(Map.Entry<String, List<String>> mentry: map.entrySet()){
			System.out.println(mentry.getKey()+" : "+mentry.getValue());
		}
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry mentry = (Map.Entry)it.next();
			System.out.println(mentry.getKey()+" : "+mentry.getValue());

		}
	}

}
