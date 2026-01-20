import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your profile code");
        String code = sc.nextLine();

        validateProfileCode(code);
        sc.close();
    }

    public static void validateProfileCode(String code) {

        // 1. Length check
        if (code.length() != 8) {
            System.out.println(code + " does not have the specified length");
            return;
        }

        // 2. Start with #
        if (code.charAt(0) != '#') {
            System.out.println(code + " does not start with a valid special character");
            return;
        }

        // 3. Next 4 uppercase letters
        for (int i = 1; i <= 4; i++) {
            char ch = code.charAt(i);
            if (ch < 'A' || ch > 'Z') {
                // position among uppercase characters
                System.out.println((i - 1) + " is an invalid number for uppercase character");
                return;
            }
        }

        // 4. Last 3 digits
        for (int i = 5; i <= 7; i++) {
            char ch = code.charAt(i);
            if (ch < '0' || ch > '9') {
                // position among digits
                System.out.println((i - 3) + " is an invalid number for digits");
                return;
            }
        }

        // Valid case
        String lastThreeDigits = code.substring(5);
        System.out.println(code + " is a valid profile code whose last 3 digits are " + lastThreeDigits);
    }
}
