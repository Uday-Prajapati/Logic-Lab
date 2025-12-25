
public class SplitWholeAndFractionalParts {

	public static void main(String[] args) {
		double num = 12.75;
		
		// type casting
		int whole = (int) num;
		double fraction = num - whole;
		
		System.out.println("Whole: " + whole);
		System.out.println("Fractional: " + fraction);
		
	}
}
