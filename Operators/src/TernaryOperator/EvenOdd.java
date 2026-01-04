package TernaryOperator;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}


