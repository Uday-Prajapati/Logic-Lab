package SingletonLogger;

public class Main {

	public static void main(String[] args) {
		SingletonLogger l1 = SingletonLogger.getInstance();
		SingletonLogger l2 = SingletonLogger.getInstance();
		System.out.println(l1 == l2); // true
		l1.log(" Started");            // [APP] Started
	}
}
