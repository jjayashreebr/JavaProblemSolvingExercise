package problems;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Set;

public class FindUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 3, 4, 4, 2, 2, 5, 6, 7, 6, 7 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		// iterate the map
		Set<Integer> mySet = map.keySet();
		Iterator<Integer> it = mySet.iterator();
		while (it.hasNext()) {
			Integer in = it.next();
			if (map.get(in) > 1) {
				System.out.println("the number " + in + " is repeated " + map.get(in));
			} else {
				System.out.println(in + " is the unique number");
			}

		}

	}

}
