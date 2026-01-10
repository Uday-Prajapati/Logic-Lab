package UnaryAndBinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBnaryDemo {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> square = n -> n*n;
		System.out.println(square.apply(5));
		
		// identity() -  no change same value
		UnaryOperator<Integer> same = UnaryOperator.identity();
		System.out.println(same.apply(10)); // 10
		
		// Binary Operator
		BinaryOperator<Integer> add = (a,b) -> a+b;
		System.out.println(add.apply(4,6));
		
		// maxBy() and minBy()
		BinaryOperator<Integer> max =
		        BinaryOperator.maxBy(Integer::compare);
		System.out.println(max.apply(10, 20)); // 20
		
		// with stream
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

        int sum = list.stream()
                      .reduce(0, (a, b) -> a + b);

        System.out.println(sum); // 10

	}
}
