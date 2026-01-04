package WaysToPrintException;

public class Example1 {

	public static void main(String[] args) {
		// using e.printStackTrace();
		
		try {
			int a = 100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
