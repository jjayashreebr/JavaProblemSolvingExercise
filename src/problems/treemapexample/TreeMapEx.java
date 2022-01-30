package problems.treemapexample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	/*
	 * Create a TreeMap Collection to Store Name and mobile number of a person.The
	 * Program should have methods to add new entries to the collection, get the
	 * mobile number of a person if name is passed
	 */

	TreeMapEx() {

	}

	public static void main(String[] args) {
		TreeMap<String, String> mapD = new TreeMap<String, String>();
		mapD.put("jay", "123");
		mapD.put("jack", "1323");
		mapD.put("japple", "223");
		TreeMapEx map = new TreeMapEx();
		printMap(mapD);
		addMap(mapD, "jojo", "789");
		addMap(mapD, "jojo", "789");
		printMap(mapD);
		findMobile(mapD, "jappl");

	}

	public static void findMobile(TreeMap<String, String> mapD, String key) {
		// TODO Auto-generated method stub
		if (mapD.containsKey(key)) {
			System.out.println("The mobile number of " + key + " is " + mapD.get(key));
		} else {
			System.out.println("Name not found");
		}
	}

	public static void addMap(TreeMap<String, String> mapD, String key, String value) {
		// TODO Auto-generated method stub
		mapD.put(key, value);
	}

	public static void printMap(TreeMap<String, String> tree_map) {
		// TODO Auto-generated method stub
		System.out.println("\nTraversing the TreeMap:");

		for (Map.Entry<String, String> e : tree_map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

	}

}
