package IntermediateOeprtaion;

import java.util.*;
import java.util.stream.*;

public class OthersOperation {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 10);

        numbers.stream()

            // filter():
            // Selects elements based on a condition (Predicate)
            // Returns only elements that satisfy the condition
            .filter(n -> n > 2)

            // map():
            // Transforms each element into another form (Function)
            // One input → one output
            .map(n -> n * 2)

            // peek():
            // Used ONLY for debugging
            // Does not modify the stream
            .peek(n -> System.out.println("After map: " + n))

            // distinct():
            // Removes duplicate elements
            // Uses equals() method internally
            .distinct()

            // sorted():
            // Sorts elements in natural (ascending) order
            .sorted()

            // skip():
            // Skips the first N elements
            // Useful for pagination
            .skip(1)

            // limit():
            // Takes only the first N elements
            // Useful for top-N records
            .limit(5)

            // mapToInt():
            // Converts Stream<Integer> to IntStream (primitive stream)
            // Improves performance (no boxing/unboxing)
            .mapToInt(Integer::intValue)

            // boxed():
            // Converts primitive stream back to object stream
            // IntStream → Stream<Integer>
            .boxed()

            // forEach(): (Terminal Operation)
            // Consumes the stream and triggers execution
            // Uses Consumer
            .forEach(System.out::println);


        // ---------------- FLATMAP EXAMPLE ----------------

        List<List<String>> names = Arrays.asList(
                Arrays.asList("Ram", "Shyam"),
                Arrays.asList("Mohan", "Sita")
        );

        names.stream()

            // flatMap():
            // Flattens nested streams
            // Converts Stream<Stream<T>> → Stream<T>
            .flatMap(list -> list.stream())

            // sorted():
            // Sorts flattened elements
            .sorted()

            // forEach():
            // Terminal operation
            .forEach(System.out::println);


        // ---------------- takeWhile & dropWhile (Java 9+) ----------------

        List<Integer> nums = Arrays.asList(2, 4, 6, 7, 8, 10);

        nums.stream()

            // takeWhile():
            // Takes elements WHILE condition is true
            // Stops when condition fails
            .takeWhile(n -> n % 2 == 0)

            .forEach(System.out::println);

        nums.stream()

            // dropWhile():
            // Skips elements WHILE condition is true
            // Starts when condition fails
            .dropWhile(n -> n % 2 == 0)

            .forEach(System.out::println);
    }
}
