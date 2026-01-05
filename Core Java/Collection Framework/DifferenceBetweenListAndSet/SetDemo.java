package DifferenceBetweenListAndSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s = new HashSet();
		// 1. no need of index positon automatically store
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		
		s.add(400); //2. does not store duplicate
		
		// 3. Store only one null value
		s.add(null);
		s.add(null);
		
		// 4. Does not follow insertion order i.e 400 , 100, 200, 300
//		System.out.println(s);
		
		// Iterate each element one by one using Iterator
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
