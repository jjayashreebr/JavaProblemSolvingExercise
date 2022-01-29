package problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayListExample ex = new ArrayListExample();
		// 1)Create an ArrayList and add String elements to it
		List<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("Vanakkam");
		myList.add("Aloha");
		// print it using an iterator
		ex.printList(myList);
		// 2)Insert a new String element at a particular index position and print the
		// collection
		myList.add(1, "Namaste");
		System.out.println("-------------------");
		ex.printList(myList);
		System.out.println("-------------------");
		// 3)Check and display if the arraylist is empty?
		if (myList.isEmpty()) {
			System.out.println("Array list is Empty");
		} else {
			System.out.println("Array List is not empty");
		}
		// 4)Display the size of the array
		System.out.println("-------------------");
		System.out.println("Array size = " + myList.size());
		System.out.println("-------------------");

		// 5)Access an element at a given index position
		System.out.println("Array Element @ position 0 " + myList.get(0));
		System.out.println("-------------------");

		// 6)Remove an element from a given index position
		myList.remove(0);
		System.out.println("Removed Element @ position 0 ");
		ex.printList(myList);
		System.out.println("-------------------");

		// 7.ForEach

		for (String wel : myList) {
			System.out.println(wel);
		}
		System.out.println("-------------------");
		// 7. Getting ListIterator
		ListIterator<String> welIterator = myList.listIterator();

		// Traversing elements
		while (welIterator.hasNext()) {
			System.out.println(welIterator.next());
		}
	}

	public void printList(List<String> myList) {
		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
