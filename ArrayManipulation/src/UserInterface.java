import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface
{
	public String getDuplicateElement()
    {
        // Fill the code
		Scanner sc = new Scanner(System.in);
		String res = "";
		
		try {
			System.out.println("Enter the size of an array");
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			System.out.println("Enter the array elements");
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter the position of the element to be replicated");
			int position = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			sb.append("The array elements are ");
			
			for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(" ");
            }
			
			// replicate elemnt
			sb.append(arr[position]);
			
			res = sb.toString().trim();
		}
		// cathc with multiple instance
		catch (ArrayIndexOutOfBoundsException |
	               InputMismatchException |
	               NegativeArraySizeException e) {

	            if (e instanceof ArrayIndexOutOfBoundsException)
	                res = "Array index is out of range";
	            else if (e instanceof InputMismatchException)
	                res = "Input was not in the correct format";
	            else
	                res = "Array size should be positive";
	        }
        return res;
    }
	
	public static void main(String[] args)
    {
        // Fill the code
		UserInterface ui = new UserInterface();
		System.out.println(ui.getDuplicateElement());
		
    }
}