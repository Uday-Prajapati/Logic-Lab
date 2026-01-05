package Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		
//		System.out.println(l);
		
		// forward
		ListIterator litr = l.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
//		
//		// backword
//		while(litr.hasPrevious()) {
//			System.out.println(litr.previous());
//		}
		
		// set replace the 10 with 200 coz cursor move to backword
		litr.next();       
        litr.set(200);     

        System.out.println(l);
	}
}
