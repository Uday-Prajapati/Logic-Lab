import java.util.*;

public class Checkfor15Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter number 2: ");
		int b = sc.nextInt();
		
		if(a == 15 || b == 15 || a+b == 15 || Math.abs(a-b) == 15) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
