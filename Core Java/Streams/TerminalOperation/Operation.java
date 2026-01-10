package TerminalOperation;

import java.util.*;
import java.util.stream.*;

public class Operation {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        // =====================================================
        // forEach()
        // Definition:
        // Terminal operation used to CONSUME each element of the stream.
        // Takes Consumer and returns NOTHING (void).
        // =====================================================
        numbers.stream()
               .forEach(n -> System.out.println("forEach: " + n));

        // =====================================================
        // collect()
        // Definition:
        // Terminal operation used to CONVERT stream into Collection or Map.
        // Uses Collectors class.
        // =====================================================
        List<Integer> collectedList =
                numbers.stream().collect(Collectors.toList());
        System.out.println("collect: " + collectedList);

        // =====================================================
        // count()
        // Definition:
        // Terminal operation that RETURNS number of elements in the stream.
        // Return type is long.
        // =====================================================
        long count = numbers.stream().count();
        System.out.println("count: " + count);

        // =====================================================
        // reduce()
        // Definition:
        // Terminal operation that COMBINES all elements into a SINGLE result.
        // Uses BinaryOperator.
        // =====================================================
        int sum =
                numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("reduce (sum): " + sum);

        // =====================================================
        // findFirst()
        // Definition:
        // Terminal operation that RETURNS the FIRST element of stream.
        // Result is wrapped in Optional.
        // =====================================================
        Optional<Integer> first =
                numbers.stream().findFirst();
        System.out.println("findFirst: " + first.get());

        // =====================================================
        // findAny()
        // Definition:
        // Terminal operation that RETURNS ANY element from stream.
        // Mostly used in parallel streams.
        // =====================================================
        Optional<Integer> any =
                numbers.stream().findAny();
        System.out.println("findAny: " + any.get());

        // =====================================================
        // anyMatch()
        // Definition:
        // Terminal operation that checks if AT LEAST ONE element
        // matches given condition.
        // Returns boolean.
        // =====================================================
        boolean anyMatch =
                numbers.stream().anyMatch(n -> n > 20);
        System.out.println("anyMatch (>20): " + anyMatch);

        // =====================================================
        // allMatch()
        // Definition:
        // Terminal operation that checks if ALL elements
        // match given condition.
        // Returns boolean.
        // =====================================================
        boolean allMatch =
                numbers.stream().allMatch(n -> n > 0);
        System.out.println("allMatch (>0): " + allMatch);

        // =====================================================
        // noneMatch()
        // Definition:
        // Terminal operation that checks if NO element
        // matches given condition.
        // Returns boolean.
        // =====================================================
        boolean noneMatch =
                numbers.stream().noneMatch(n -> n < 0);
        System.out.println("noneMatch (<0): " + noneMatch);

        // =====================================================
        // min()
        // Definition:
        // Terminal operation that finds MINIMUM element.
        // Uses Comparator and returns Optional.
        // =====================================================
        Optional<Integer> min =
                numbers.stream().min(Integer::compareTo);
        System.out.println("min: " + min.get());

        // =====================================================
        // max()
        // Definition:
        // Terminal operation that finds MAXIMUM element.
        // Uses Comparator and returns Optional.
        // =====================================================
        Optional<Integer> max =
                numbers.stream().max(Integer::compareTo);
        System.out.println("max: " + max.get());

        // =====================================================
        // toArray()
        // Definition:
        // Terminal operation that CONVERTS stream into array.
        // =====================================================
        Integer[] array =
                numbers.stream().toArray(Integer[]::new);
        System.out.println("toArray: " + Arrays.toString(array));

        // =====================================================
        // forEachOrdered()
        // Definition:
        // Terminal operation similar to forEach(),
        // but MAINTAINS ORDER (especially in parallel stream).
        // =====================================================
        numbers.parallelStream()
               .forEachOrdered(n -> System.out.println("forEachOrdered: " + n));
    }
}

