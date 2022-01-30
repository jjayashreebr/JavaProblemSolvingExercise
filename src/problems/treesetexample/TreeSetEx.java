package problems.treesetexample;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a) Create a new tree set, add some colors (string) and print out the tree
		// set.
		TreeSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("Red");
		ts.add("Blue");
		ts.add("Cyan");
		ts.add("Cyan");

		System.out.println(ts);
		System.out.println("-----------------------");
		// b) Iterate through all elements in a tree set.
		for (String value : ts)

			// Printing the values inside the object
			System.out.print(value + "\t");

		System.out.println("\n" + "-----------------------");

		// c) Add all the elements of a specified tree set to another tree set.
		TreeSet<String> tSet2 = new TreeSet<String>();

		ts.add("Black");
		ts.add("White");
		ts.add("Yellow");

		/*
		 * To merge two TreeSet objects, use the addAll method
		 */
		ts.addAll(tSet2);

		System.out.println("Merged TreeSet contains: " + ts);
		System.out.println("-----------------------");

		// Create a reverse order view of the elements contained in each tree set.

		TreeSet<String> reverse = (TreeSet<String>) ts.descendingSet();
		for (String value : reverse)

			// Printing the values inside the object
			System.out.print(value + "\t");

		System.out.println("\n" + "-----------------------");

		// e) Get the first and last elements in a tree set.

		System.out.println("First Element " + ts.first());
		System.out.println("last Element " + ts.last());

		// f) Get the number of elements in the tree set.
		System.out.println("Number of elements in tree set " + ts.size());
		System.out.println("-----------------------");

		/*
		 * g) Create a TreeSet to store employee objects sorted by their name
		 */
		
		TreeSet<Employee> tsEmp = new TreeSet<Employee>(new EmployeeComparator());
		tsEmp.add(new Employee("Jay"));
		tsEmp.add(new Employee("Alex"));
		tsEmp.add(new Employee("Bama"));
		tsEmp.add(new Employee("Zeus"));
		
		for (Employee value : tsEmp)

			// Printing the values inside the object
			System.out.print(value.getName() + "\t");

		System.out.println("\n" + "-----------------------");


	}

}
