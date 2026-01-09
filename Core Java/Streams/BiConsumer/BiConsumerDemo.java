package BiConsumer;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<String, Integer> printUser = 
				(name, age) -> System.out.println(name + " is " + age + " years old");
				printUser.accept("Uday", 22);
				
		// andThen() in BiConsumer - Used to perform multiple actions in sequence.
				BiConsumer<Integer, Integer> add =
				        (a, b) -> System.out.println("Sum: " + (a + b));

				BiConsumer<Integer, Integer> multiply =
				        (a, b) -> System.out.println("Product: " + (a * b));

				add.andThen(multiply).accept(3, 4);
		
	}

}
