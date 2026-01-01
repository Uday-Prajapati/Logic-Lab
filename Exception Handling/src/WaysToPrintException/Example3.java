package WaysToPrintException;

public class Example3 {

	public static void main(String[] args) {
		// using e.printStackTrace();
		
		try {
			int a = 100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.toString());
		}

	}

}
