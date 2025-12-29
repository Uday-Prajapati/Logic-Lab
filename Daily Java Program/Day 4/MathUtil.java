//4) MathUtil (Static Utility Methods)
//Question:
//Implement a MathUtil class with static helper methods.
//Requirements:
//
//Methods:
//
//public static int max(int a, int b)
//public static int clamp(int v, int min, int max)
//
//
//Constraint: No instance state; no fields.
//
//Usage Example:
//
//System.out.println(MathUtil.max(7, 3));            // 7
//System.out.println(MathUtil.clamp(15, 0, 10));     // 10
//System.out.println(MathUtil.clamp(-3, -2, 5));     // -2

import java.util.Scanner;
public class MathUtil {
	
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int clamp(int v, int min, int max) {
		if(v<min) {
			return min;
		}else if(v>max) {
			return max;
		}else {
			return v;
		}
	}

	public static void main(String[] args) {
//		System.out.println(MathUtil.max(7, 3));            // 7
//		System.out.println(MathUtil.clamp(15, 0, 10));     // 10
//		System.out.println(MathUtil.clamp(-3, -2, 5));     // -2

		// User Input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		
		System.out.println("Maximum value is: " + MathUtil.max(a, b));
		
		
		// clamp logic
		System.out.print("Enter v: ");
		int v = sc.nextInt();
		
		System.out.print("Enter min: ");
		int min = sc.nextInt();
		
		System.out.print("Enter max: ");
		int max = sc.nextInt();
		
		System.out.println(MathUtil.clamp(v, min, max));

	}

}
