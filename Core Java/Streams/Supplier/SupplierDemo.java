package Supplier;

import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.annotation.processing.SupportedSourceVersion;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> msg = () -> "Hello java";
		System.out.println(msg.get());
		
		// random number
		Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100);

		System.out.println(randomNumber.get());
		System.out.println(randomNumber.get());

		// supplier with stream
		Stream.generate(() -> "java")
		.limit(3)
		.forEach(System.out::println);
	}
}
