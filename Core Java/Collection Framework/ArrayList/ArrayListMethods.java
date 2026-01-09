package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethods {

	public static void main(String[] args) {

		// Creating ArrayList object
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// add() → adds elements to ArrayList
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		// print ArrayList
		System.out.println(al);   // [10, 20, 30, 40]
		
		// ---------------- Traversing ----------------
		
		// normal for loop
		for(int i = 0; i < al.size(); i++) {
		    System.out.println(al.get(i));
		}
		
		// for-each loop → used to read elements one by one
		for(int no : al) {
			System.out.println(no);
		}
		
		// Iterator → used to traverse collection
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// using list itertor
		ListIterator<Integer> litr = al.listIterator();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		// ---------------- Important Methods ----------------
		
		// get(index) → retrieves element from given index
		System.out.println(al.get(1));   // 20
		
		// isEmpty() → checks ArrayList is empty or not
		System.out.println(al.isEmpty()); // false
		
		// remove(index) → removes element at given index
		System.out.println(al.remove(3)); // removes 40
		System.out.println(al);
		
		// set(index, element) → replaces element at index
		al.set(2, 100);
		System.out.println(al);
		
		// size() → returns total number of elements
		System.out.println(al.size());
		
		// add(index, element) → adds element at specific index
		al.add(1, 90);
		System.out.println(al);
		
		// contains(element) → checks element present or not
		System.out.println(al.contains(100)); // true
		
		// indexOf(element) → returns first index of element
		System.out.println(al.indexOf(100));
		
		// lastIndexOf(element) → returns last index of element
		al.add(100);
		System.out.println(al.lastIndexOf(100));
		
		// remove(Object) → removes first occurrence of object
		al.remove(Integer.valueOf(100));
		System.out.println(al);
		
		// toArray() → converts ArrayList to Array
		Object[] arr = al.toArray();
		for(Object obj : arr) {
			System.out.println(obj);
		}
		
		// clear() → removes all elements from ArrayList
		al.clear();
		System.out.println(al);
	}
}
