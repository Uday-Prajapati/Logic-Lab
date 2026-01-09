package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListMethods {

	public static void main(String[] args) {

		// Creating LinkedList object
		LinkedList<Integer> ll = new LinkedList<>();

		// ⭐ add() → adds element to LinkedList
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		System.out.println(ll); // [10, 20, 30, 40]

		// ⭐ addFirst() → adds element at beginning
		ll.addFirst(5);

		// ⭐ addLast() → adds element at end
		ll.addLast(50);

		System.out.println(ll); // [5, 10, 20, 30, 40, 50]

		// ⭐ add(index, element) → adds element at specific index
		ll.add(2, 15);
		System.out.println(ll);

		// ⭐ get(index) → retrieves element from given index
		System.out.println(ll.get(3));

		// getFirst() → retrieves first element
		System.out.println(ll.getFirst());

		// getLast() → retrieves last element
		System.out.println(ll.getLast());

		// ⭐ set(index, element) → replaces element at index
		ll.set(3, 100);
		System.out.println(ll);

		// ⭐ remove() → removes first element
		ll.remove();
		System.out.println(ll);

		// ⭐ remove(index) → removes element at given index
		ll.remove(2);
		System.out.println(ll);

		// removeFirst() → removes first element
		ll.removeFirst();

		// removeLast() → removes last element
		ll.removeLast();

		System.out.println(ll);

		// ⭐ size() → returns total number of elements
		System.out.println(ll.size());

		// ⭐ contains(element) → checks element present or not
		System.out.println(ll.contains(100));

		// ⭐ isEmpty() → checks LinkedList is empty or not
		System.out.println(ll.isEmpty());

		// indexOf(element) → returns first index of element
		System.out.println(ll.indexOf(20));

		// lastIndexOf(element) → returns last index of element
		ll.add(20);
		System.out.println(ll.lastIndexOf(20));

		// ⭐ Traversing using normal for loop (index based)
		for(int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// ⭐ Traversing using for-each loop (most common)
		for(int no : ll) {
			System.out.println(no);
		}

		// Traversing using Iterator
		Iterator<Integer> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// toArray() → converts LinkedList to array
		Object[] arr = ll.toArray();
		for(Object obj : arr) {
			System.out.println(obj);
		}

		// ⭐ clear() → removes all elements from LinkedList
		ll.clear();
		System.out.println(ll);
	}
}
