package CollectionInterfaceMethod;

import java.util.ArrayList;
import java.util.Collection;

public class Methods1 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		
//		System.out.println(al1.add("aaa")); // print true
		System.out.println(al1); // print [100, 200, 300, aaa]
		
		ArrayList al2 = new ArrayList();
		al2.add("a");
		al2.add("b");
		al2.add("c");
		
//		System.out.println(al2); // print [a, b, c]
		 
		// transfer al1 element into al2
//		al1.addAll(al2);
//		System.out.println(al1); // print [100, 200, 300, aaa, a, b, c]
		
		// delete al1 element form al2
//		al1.removeAll(al2);
//		System.out.println(al1);
//		System.out.println(al2);
		
		// remove all element from al1
//		al1.clear();
//		System.out.println(al1);
		
		
//		
//		// check if value present or not (contains) print true or false
//		System.out.println(al1.contains(900)); 
//		
//		// check if collection object is empty or not return true or false
//		System.out.println(al1.isEmpty());
//		
//		// print the size
//		System.out.println(al1.size());
//		
//		// remove the element from collection
//		al1.remove(1);
//		System.out.println(al1);
//		
//		// remove the character from collection
//		al1.remove("a");
//		System.out.println(al1);

	}
}
