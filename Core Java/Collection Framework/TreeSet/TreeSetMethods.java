package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;
//
//public class TreeSetMethods {
//
//	public static void main(String[] args) {
//
//		// Creating TreeSet object
//		TreeSet<Integer> ts = new TreeSet<>();
//
//		// ⭐ add() → adds element in sorted (ascending) order
//		ts.add(30);
//		ts.add(10);
//		ts.add(20);
//		ts.add(10); // duplicate → ignored
//
//		System.out.println(ts); // [10, 20, 30]
//
//		// ⭐ size() → returns number of elements
//		System.out.println(ts.size());
//
//		// ⭐ contains() → checks element present or not
//		System.out.println(ts.contains(20)); // true
//
//		// ⭐ remove() → removes specified element
//		ts.remove(20);
//		System.out.println(ts);
//
//		// ⭐ first() → returns smallest element
//		System.out.println(ts.first());
//
//		// ⭐ last() → returns largest element
//		System.out.println(ts.last());
//
//		// lower(element) → returns element just smaller than given
//		System.out.println(ts.lower(30));
//
//		// higher(element) → returns element just greater than given
//		System.out.println(ts.higher(10));
//
//		// floor(element) → returns ≤ given element
//		System.out.println(ts.floor(25));
//
//		// ceiling(element) → returns ≥ given element
//		System.out.println(ts.ceiling(25));
//
//		// ⭐ headSet(element) → elements less than given element
//		System.out.println(ts.headSet(30));
//
//		// ⭐ tailSet(element) → elements greater than or equal to given
//		System.out.println(ts.tailSet(10));
//
//		// ⭐ subSet(from, to) → range (from ≤ x < to)
//		System.out.println(ts.subSet(10, 30));
//
//		// ⭐ Traversing using for-each loop
//		for(int no : ts) {
//			System.out.println(no);
//		}
//
//		// Traversing using Iterator
//		Iterator<Integer> itr = ts.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
//		// pollFirst() → removes and returns first element
//		System.out.println(ts.pollFirst());
//
//		// pollLast() → removes and returns last element
//		System.out.println(ts.pollLast());
//
//		System.out.println(ts);
//
//		// ⭐ isEmpty() → checks TreeSet is empty or not
//		System.out.println(ts.isEmpty());
//
//		// ⭐ clear() → removes all elements
//		ts.clear();
//		System.out.println(ts);
//	}
//}


// TreeSet with Comparable


import java.util.TreeSet;

// ⭐ Comparable → compareTo() method
class Student implements Comparable<Student> {

	int age;
	String name;

	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// ⭐ compareTo() → natural sorting logic
	@Override
	public int compareTo(Student s) {
		return this.age - s.age; // ascending order by age
	}

	public String toString() {
		return age + " " + name;
	}
}

public class TreeSetMethods {
	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<>();

		ts.add(new Student(22, "Rahul"));
		ts.add(new Student(20, "Aman"));
		ts.add(new Student(25, "Neha"));

		System.out.println(ts);
	}
}

