package Collectors;

import java.util.*;
import java.util.stream.*;

public class CollectorsMethod {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "apple", "banana", "cherry",
                "apple", "date", "banana"
        );

        // =====================================================
        // toList()
        // Definition:
        // Collects stream elements into a List.
        // Allows duplicates and maintains insertion order.
        // =====================================================
        List<String> list =
                names.stream().collect(Collectors.toList());
        System.out.println("toList: " + list);

        // =====================================================
        // toSet()
        // Definition:
        // Collects elements into a Set.
        // Removes duplicate elements.
        // =====================================================
        Set<String> set =
                names.stream().collect(Collectors.toSet());
        System.out.println("toSet: " + set);

        // =====================================================
        // toMap()
        // Definition:
        // Collects elements into a Map using key-value mapping.
        // Merge function is used to handle duplicate keys.
        // =====================================================
        Map<Integer, String> map =
                names.stream().collect(Collectors.toMap(
                        String::length,      // key mapper
                        s -> s,              // value mapper
                        (a, b) -> a          // merge function
                ));
        System.out.println("toMap: " + map);

        // =====================================================
        // groupingBy()
        // Definition:
        // Groups elements based on a classifier function.
        // =====================================================
        Map<Integer, List<String>> grouping =
                names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("groupingBy: " + grouping);

        // =====================================================
        // groupingBy + counting()
        // Definition:
        // Groups elements and counts number of elements in each group.
        // =====================================================
        Map<Integer, Long> groupingCount =
                names.stream().collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting()
                ));
        System.out.println("groupingBy + counting: " + groupingCount);

        // =====================================================
        // partitioningBy()
        // Definition:
        // Divides elements into TWO groups based on condition (true / false).
        // =====================================================
        Map<Boolean, List<String>> partition =
                names.stream().collect(Collectors.partitioningBy(
                        s -> s.length() > 5
                ));
        System.out.println("partitioningBy: " + partition);

        // =====================================================
        // counting()
        // Definition:
        // Counts total number of elements in the stream.
        // =====================================================
        long count =
                names.stream().collect(Collectors.counting());
        System.out.println("counting: " + count);

        // =====================================================
        // joining()
        // Definition:
        // Joins all elements into a single String.
        // =====================================================
        String joined =
                names.stream().collect(Collectors.joining(", "));
        System.out.println("joining: " + joined);

        // =====================================================
        // mapping()
        // Definition:
        // Transforms elements before collecting them.
        // Mostly used with groupingBy.
        // =====================================================
        Map<Integer, Set<String>> mapping =
                names.stream().collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(String::toUpperCase, Collectors.toSet())
                ));
        System.out.println("mapping: " + mapping);

        // =====================================================
        // collectingAndThen()
        // Definition:
        // Performs final transformation after collection.
        // =====================================================
        List<String> unmodifiableList =
                names.stream().collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        System.out.println("collectingAndThen: " + unmodifiableList);

        // =====================================================
        // summarizingInt()
        // Definition:
        // Provides count, sum, min, max, average in ONE object.
        // =====================================================
        IntSummaryStatistics statistics =
                names.stream().collect(Collectors.summarizingInt(String::length));
        System.out.println("summarizingInt: " + statistics);
    }
}
