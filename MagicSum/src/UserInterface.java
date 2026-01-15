import java.util.Scanner;

public class UserInterface {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isSumOfConsecutivePrimes(int num) {
        for (int start = 2; start < num; start++) {
            if (!isPrime(start)) continue;
            int sum = 0;
            for (int p = start; p < num; p++) {
                if (isPrime(p)) sum += p;
                if (sum == num) return true;
                if (sum > num) break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int n = sc.nextInt();
        if (n < 1 || n > 5) {
            System.out.println(n + " is an invalid array size");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0 || arr[i] >= 100) {
                System.out.println(arr[i] + " is an invalid input");
                return;
            }
        }

        boolean found = false;

        // First check if there is at least one sum
        for (int num : arr) {
            if (isPrime(num) && isSumOfConsecutivePrimes(num)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The sum of prime numbers is");
            for (int num : arr) {
                if (isPrime(num) && isSumOfConsecutivePrimes(num)) {
                    System.out.println(num);
                }
            }
        } else {
            System.out.println("The " + n + " numbers are not sum of prime numbers");
        }
    }
}
