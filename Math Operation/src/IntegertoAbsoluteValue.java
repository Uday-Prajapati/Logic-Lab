import java.util.*;

public class IntegertoAbsoluteValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int to absolute
        System.out.println("Enter the integer number: ");
        int num = sc.nextInt();

        // float to absolute
        System.out.println("Enter the float number (absolute): ");
        float num1 = sc.nextFloat();

        // round off float
        System.out.println("Enter the float number (round off): ");
        float num2 = sc.nextFloat();

        System.out.println("Integer absolute: " + Math.abs(num));
        System.out.println("Float absolute: " + Math.abs(num1));
        System.out.println("Rounded value: " + Math.round(num2));

        sc.close();
    }
}
