// compareTo() Method:- int compareTo(Object o)

// Return values meaning:
//Return value		Meaning
//	 0			Both objects are equal
//	+ve			Current object > other object
//	-ve			Current object < other object

import java.util.ArrayList;
import java.util.Collections;

class ComparableMethod implements Comparable<ComparableMethod> {

	int marks;

	// Constructor
	ComparableMethod(int marks) {
		this.marks = marks;
	}

	// ⭐ compareTo() defines sorting logic
	@Override
	public int compareTo(ComparableMethod s) {
		return this.marks - s.marks; // ascending order
	}

	public static void main(String[] args) {

		ArrayList<ComparableMethod> list = new ArrayList<>();

		// Adding objects
		list.add(new ComparableMethod(60));
		list.add(new ComparableMethod(30));
		list.add(new ComparableMethod(90));

		// Sorting using Comparable
		Collections.sort(list);

		// Traversing sorted list
		for (ComparableMethod s : list) {
			System.out.println(s.marks);
		}
	}
}
