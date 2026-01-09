package Vector;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class VectorMethods {

	public static void main(String[] args) {

		// Creating Vector object
		Vector<Integer> v = new Vector<>();

		// ⭐ add() → adds element to Vector
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		System.out.println(v); // [10, 20, 30, 40]

		// ⭐ addElement() → legacy method to add element
		v.addElement(50);

		System.out.println(v);

		// ⭐ add(index, element) → adds element at specific index
		v.add(2, 15);
		System.out.println(v);

		// ⭐ get(index) → retrieves element from given index
		System.out.println(v.get(1));

		// elementAt(index) → legacy method to retrieve element
		System.out.println(v.elementAt(0));

		// ⭐ set(index, element) → replaces element at given index
		v.set(3, 100);
		System.out.println(v);

		// setElementAt(element, index) → legacy replace method
		v.setElementAt(200, 4);
		System.out.println(v);

		// ⭐ remove(index) → removes element at given index
		v.remove(2);
		System.out.println(v);

		// ⭐ removeElement(object) → removes first occurrence
		v.removeElement(Integer.valueOf(100));
		System.out.println(v);

		// removeAllElements() → removes all elements (legacy)
		// v.removeAllElements();

		// ⭐ size() → returns number of elements
		System.out.println(v.size());

		// ⭐ capacity() → returns current capacity of Vector ⭐⭐
		System.out.println(v.capacity());

		// ⭐ contains(element) → checks element present or not
		System.out.println(v.contains(30));

		// ⭐ isEmpty() → checks Vector is empty or not
		System.out.println(v.isEmpty());

		// indexOf(element) → returns first index of element
		System.out.println(v.indexOf(30));

		// lastIndexOf(element) → returns last index of element
		v.add(30);
		System.out.println(v.lastIndexOf(30));

		// ⭐ Traversing using normal for loop (index based)
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		// ⭐ Traversing using for-each loop
		for(int no : v) {
			System.out.println(no);
		}

		// Traversing using Iterator
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ⭐ Traversing using Enumeration (LEGACY – IMPORTANT)
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// toArray() → converts Vector to array
		Object[] arr = v.toArray();
		for(Object obj : arr) {
			System.out.println(obj);
		}

		// ⭐ clear() → removes all elements from Vector
		v.clear();
		System.out.println(v);
	}
}
