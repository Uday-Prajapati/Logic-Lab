package DifferenceBetweenListAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		
		// 1. adding data with index position
		l.add(10); // automatically store at index 0
		l.add(1,20); // sote 20 at index 1
		l.add(30);
		
		l.add(30); //2. store duplicate
		
		// 3. Store multiple null value
		l.add(null);
		l.add(null);
		
		// . Follow insertion order i.e 10 20 30
//		System.out.println(l);
		
		// Iterate each element one by one using Iterator
//		Iterator itr = l.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		// using list Iterator
		ListIterator litr = l.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	}
}
