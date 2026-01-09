package BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
		
		System.out.println(isGreater.test(10, 5));
		System.out.println(isGreater.test(3, 7));
		
		// and(), or() and negate()
		
		BiPredicate<Integer, Integer> sumGreaterThan10 = (a, b) -> a + b > 10;
		BiPredicate<Integer, Integer> bothEven = (a, b) -> a % 2 == 0 && b % 2 == 0;

		System.out.println(sumGreaterThan10.and(bothEven).test(6, 6)); // true
		System.out.println(sumGreaterThan10.or(bothEven).test(6, 6)); // true
		System.out.println(sumGreaterThan10.negate().test(6, 6)); // falsef

	}
}
