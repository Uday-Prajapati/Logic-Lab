package Functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionChaining {

	public static void main(String[] args) {
		
		// andThen()
		Function<Integer, Integer> doubleIt = n -> n * 2;
		Function<Integer, Integer> addTen = n -> n + 10;

		Function<Integer, Integer> result = doubleIt.andThen(addTen);

		System.out.println(result.apply(5)); // 20
		
		// compose()
		Function<Integer, Integer> doubleNo = n -> n * 2;
		Function<Integer, Integer> addnoTen = n -> n + 10;

		Function<Integer, Integer> res = doubleIt.compose(addTen);

		System.out.println(res.apply(5)); // 30
		
		// identity
		Function<Integer, Integer> same = Function.identity();
		System.out.println(same.apply(10)); // 10
		
		
		// identity() in stream
		
		// Original Map
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Java");
//        map.put(2, "Python");
//        map.put(3, "Java");   // duplicate value is allowed

        // Convert map using stream and collect
//        Map<Integer, String> newMap =
//                map.entrySet()
//                   .stream()
//                   .collect(Collectors.toMap(
//                       Map.Entry::getKey,     // key mapper
//                       Map.Entry::getValue,   // value mapper
//                       (a, b) -> a,            // merge function
//                       HashMap::new            // map supplier
//                   ));
//
//        System.out.println(newMap);
		
		// comnbined example
		Predicate<Integer> predicate = x -> x % 2 == 0;
		Function<Integer, Integer> function = x -> x * x;
		Consumer<Integer> consumer = x -> System.out.println(x);
		Supplier<Integer> supplier = () -> 100;
		
		 if(predicate.test(supplier.get())) {
			 consumer.accept(function.apply(supplier.get()));
		 }

	}
}
