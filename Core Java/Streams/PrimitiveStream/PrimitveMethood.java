package PrimitiveStream;

import java.util.*;
import java.util.stream.*;

public class PrimitveMethood {

    public static void main(String[] args) {

        // =====================================================
        // IntStream
        // Definition:
        // Primitive stream used to process int values
        // Avoids boxing/unboxing (faster than Stream<Integer>)
        // =====================================================

        // Creating IntStream using range()
        // range() → start inclusive, end exclusive
        IntStream.range(1, 6)
                 .forEach(n -> System.out.println("IntStream range: " + n));

        // Creating IntStream using rangeClosed()
        // rangeClosed() → both start and end inclusive
        int sumRangeClosed =
                IntStream.rangeClosed(1, 5).sum();
        System.out.println("Sum using rangeClosed: " + sumRangeClosed);

        // Creating IntStream from array
        int[] numbers = {10, 20, 30, 40};

        int sumArray =
                Arrays.stream(numbers).sum();
        System.out.println("Sum from array: " + sumArray);

        // =====================================================
        // mapToInt()
        // Definition:
        // Converts object stream into primitive IntStream
        // =====================================================
        List<String> names = List.of("apple", "banana", "cherry");

        IntStream lengthStream =
                names.stream().mapToInt(String::length);

        lengthStream.forEach(n -> System.out.println("Length: " + n));

        // =====================================================
        // summaryStatistics()
        // Definition:
        // Returns count, sum, min, max, average in one object
        // =====================================================
        IntSummaryStatistics stats =
                Arrays.stream(numbers).summaryStatistics();

        System.out.println("Statistics: " + stats);

        // =====================================================
        // boxed()
        // Definition:
        // Converts primitive stream into object stream
        // =====================================================
        List<Integer> boxedList =
                IntStream.range(1, 5).boxed().toList();

        System.out.println("Boxed List: " + boxedList);

        // =====================================================
        // LongStream
        // Definition:
        // Primitive stream for long values
        // =====================================================
        long longSum =
                LongStream.of(100L, 200L, 300L).sum();

        System.out.println("LongStream sum: " + longSum);

        // =====================================================
        // DoubleStream
        // Definition:
        // Primitive stream for double values
        // =====================================================
        double average =
                DoubleStream.of(10.5, 20.5, 30.5).average().getAsDouble();

        System.out.println("DoubleStream average: " + average);

        // =====================================================
        // Parallel Primitive Stream
        // Definition:
        // Uses multiple threads for faster processing
        // =====================================================
        int parallelSum =
                IntStream.rangeClosed(1, 100)
                         .parallel()
                         .sum();

        System.out.println("Parallel IntStream sum: " + parallelSum);
    }
}

