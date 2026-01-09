package BiFunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> multiply = (a,b) -> a * b;
		System.out.println(multiply.apply(5, 4));
		
		// andThen() - Used to process result further
		
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println(
		    add.andThen(result -> result * 2).apply(3, 4)
		); // 14

	}
}
