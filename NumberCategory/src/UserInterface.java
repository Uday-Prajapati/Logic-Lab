import java.util.Scanner;
public class UserInterface{
	
public static NumberCategory checkAmicable() {
	// lambdda
	return(num1, num2) -> {
		int sum1 = 0, sum2 = 0;
		
		// proper division of num1
		for(int i=1; i<=num1/2; i++) {
			if(num1 % i == 0) {
				sum1 += i;
			}
		}
		
		// proper division of num2
		for(int i=1; i<=num2/2; i++) {
			if(num2 % i == 0) {
				sum2 += i;
			}
		}
		return (sum1 == num2 && sum2 == num1);
	};
}

public static NumberCategory checkPalindrome() {
	//lambda
	return (num1, num2) -> {
		int product = num1 * num2;
		int temp = product;
		int rev = 0;
		
		while(temp > 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp/10;
		}
		return product == rev;
	};
}

public static void main(String [] args)
    {
    // Fill the code
	Scanner sc = new Scanner(System.in);
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	
	// amicable number
	NumberCategory amicable = checkAmicable();
	if(amicable.checkNumberCategory(number1, number2)) {
		System.out.println(number1 + " and " + number2 + " are amicable numbers");
	}else {
		System.out.println(number1 + " and " + number2 + " are not amicable numbers");
	}
	
	// palidrome
	NumberCategory palindrome = checkPalindrome();
	int product = number1 * number2;
	
	if(palindrome.checkNumberCategory(number1, number2)) {
		System.out.println("Their product " + product + " do produces a Palindrome");
	}else {
		System.out.println("Their product " + product + " does not produce a Palindrome");
	}
    }
}