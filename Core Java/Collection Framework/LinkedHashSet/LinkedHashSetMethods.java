package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetMethods {

	public static void main(String[] args) {

		// Creating LinkedHashSet object
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		// ⭐ add() → adds element (no duplicates, order maintained)
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10); // duplicate → ignored
		lhs.add(null); // only one null allowed

		System.out.println(lhs); // insertion order maintained

		// ⭐ size() → returns number of elements
		System.out.println(lhs.size());

		// ⭐ contains() → checks element present or not
		System.out.println(lhs.contains(20)); // true

		// ⭐ remove() → removes specified element
		lhs.remove(30);
		System.out.println(lhs);

		// ⭐ isEmpty() → checks LinkedHashSet is empty or not
		System.out.println(lhs.isEmpty());

		// ⭐ Traversing using for-each loop (MOST COMMON)
		for(Integer no : lhs) {
			System.out.println(no);
		}

		// Traversing using Iterator
		Iterator<Integer> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// toArray() → converts LinkedHashSet to array
		Object[] arr = lhs.toArray();
		for(Object obj : arr) {
			System.out.println(obj);
		}

		// ⭐ clear() → removes all elements
		lhs.clear();
		System.out.println(lhs);
	}
}
