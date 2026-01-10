package ParallelStream;

import java.util.List;

public class Parallel {

	public static void main(String[] args) {
		
		// sequential
		List<Integer> list = List.of(1,2,3,4,5);

		list.stream()
		    .forEach(n ->
		        System.out.println("Sequential: " + n + " - " + Thread.currentThread().getName())
		    );

		// parallel
		list.parallelStream()
	    .forEach(n ->
	        System.out.println("Parallel: " + n + " - " + Thread.currentThread().getName())
	    );

	}
}
