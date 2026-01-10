package IntermediateOeprtaion;

import java.util.*;

public class ImportantOperations {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 10, 3, 20, 5, 30, 40);

        numbers.stream()

            // filter():
            // Used to SELECT elements based on a condition
            // Takes Predicate and returns only matching elements
            .filter(n -> n > 5)

            // map():
            // Used to TRANSFORM each element into another form
            // Takes Function and returns modified value
            .map(n -> n * 2)

            // distinct():
            // Removes DUPLICATE elements
            // Uses equals() internally
            .distinct()

            // sorted():
            // Sorts elements
            // Default: ascending order
            .sorted()

            // skip():
            // Skips FIRST N elements
            // Useful for pagination
            .skip(1)

            // limit():
            // Takes ONLY first N elements
            // Useful for top N records
            .limit(3)

            // forEach(): (Terminal operation)
            // Executes the stream and CONSUMES each element
            // Uses Consumer
            .forEach(System.out::println);
    }
}
