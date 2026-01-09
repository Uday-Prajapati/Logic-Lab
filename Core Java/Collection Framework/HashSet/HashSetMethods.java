package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {

		// Creating HashSet object
		HashSet<Integer> hs = new HashSet<>();

		// ⭐ add() → adds element to HashSet
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10); // duplicate not allowed

		System.out.println(hs); // order not guaranteed

		// ⭐ size() → returns number of elements
		System.out.println(hs.size());

		// ⭐ contains() → checks element present or not
		System.out.println(hs.contains(20)); // true

		// ⭐ remove() → removes specified element
		hs.remove(30);
		System.out.println(hs);

		// ⭐ isEmpty() → checks HashSet is empty or not
		System.out.println(hs.isEmpty());

		// ⭐ Traversing using for-each loop (MOST COMMON)
		for(int no : hs) {
			System.out.println(no);
		}

		// Traversing using Iterator
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ⭐ clear() → removes all elements from HashSet
		hs.clear();
		System.out.println(hs);
	}
}
