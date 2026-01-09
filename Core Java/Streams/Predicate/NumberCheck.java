package Predicate;

import java.util.function.Predicate;

public class NumberCheck {

	public static void main(String[] args) {
		Predicate<Integer> isGreaterThan10 = n -> n > 10;
		
		// behinf the Preficate it is lile boolean test(T t);
		// Integer check
//		System.out.println(isGreaterThan10.test(15));
//		System.out.println(isGreaterThan10.test(8));
//		
//		// String Check
//		Predicate<String> isLongWord = word -> word.length() > 5;
//		System.out.println(isLongWord.test("Hello"));     // false
//		System.out.println(isLongWord.test("Welcome"));   // true
		
		// and(), or(), and negate() method
		// Predicate to check if number is positive
        Predicate<Integer> isPositive = n -> n > 0;

        // Predicate to check if number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // and(): number must be positive AND even
        Predicate<Integer> positiveAndEven = isPositive.and(isEven);

        // or(): number can be positive OR even
        Predicate<Integer> positiveOrEven = isPositive.or(isEven);

        // negate(): opposite of isPositive
        Predicate<Integer> notPositive = isPositive.negate();

        System.out.println("Positive AND Even:");
        System.out.println(positiveAndEven.test(4));   // true
        System.out.println(positiveAndEven.test(-2));  // false

        System.out.println("\nPositive OR Even:");
        System.out.println(positiveOrEven.test(-2));   // true
        System.out.println(positiveOrEven.test(-3));   // false

        System.out.println("\nNOT Positive:");
        System.out.println(notPositive.test(-5));      // true
        System.out.println(notPositive.test(5));       // false
        
        // isEqual() method
        Predicate<String> p = Predicate.isEqual("Java");

        System.out.println(p.test("Java"));   // true
        System.out.println(p.test("Python")); // false

	}

}
