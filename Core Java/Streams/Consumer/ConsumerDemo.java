package Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> print = s -> System.out.println(s);
		print.accept("Hello");
		
//		Consumer with andThen()
		Consumer<Integer> c1 = n -> System.out.println("Number: " + n);
		Consumer<Integer> c2 = n -> System.out.println("Square: " + (n * n));

		c1.andThen(c2).accept(5);

		// Consumer with Stream for each
		List<String> names = List.of("Ram", "Shyam", "Mohan");
		names.forEach(name -> System.out.println(name));


	}

}
