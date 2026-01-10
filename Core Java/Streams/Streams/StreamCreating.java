package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreating {

	public static void main(String[] args) {
		// how to use stream
		// source, intermediate oepration & terminal operation
		// ways to create stream
//		1. Using Colelction
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		System.out.println(numbers.stream().filter(x->x%2==0).count());

//		2. From Arrays	
		String[] array = {"a", "b", "c"};
		Stream<String> stream1 = Arrays.stream(array);
		
		// 3. Using Stream.of()
		Stream<String> stream2 = Stream.of("a", "b");
		
		// 4. Infinite streams
		Stream.generate(() ->1);
		Stream.iterate( 1, x->+1);
		
		// Stream from List
		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		 list.stream().forEach(System.out::println);
		 //stream() converts List → Stream
		 // forEach() prints elements
		 
		// Stream from Set
		 Set<String> set = new HashSet<>();
	        set.add("Java");
	        set.add("Python");
	        set.add("C++");

	        set.stream()
	           .forEach(System.out::println);
	        
	   // Stream from Map
	   // stream of key
//	      map.keySet().stream();
	        
	  // stream of key
//		  map.keyValue().stream();
	        
	  // Stream of Entries (MOST USED)
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Java");
	        map.put(2, "Python");
	        map.put(3, "C++");

	        map.entrySet()
	           .stream()
	           .forEach(entry ->
	               System.out.println(entry.getKey() + " = " + entry.getValue())
	           );
	        
	}
	
}
 