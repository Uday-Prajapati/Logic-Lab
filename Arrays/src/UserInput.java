import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ask size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // taking input using for loop
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // printing using normal for loop
        System.out.println("Using normal for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // printing using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
