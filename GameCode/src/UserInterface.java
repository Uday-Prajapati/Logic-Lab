import java.util.Scanner;

public class UserInterface {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your profile code");
        String code = scanner.nextLine().trim();
        
        validateProfileCode(code);
        
        scanner.close();
    }
    
    public static void validateProfileCode(String code) {
        // Check if code has exactly 8 characters
        if (code.length() != 8) {
            System.out.println(code + " does not have the specified length");
            return;
        }
        
        // Check if code starts with '#'
        if (code.charAt(0) != '#') {
            System.out.println(code + " does not start with a valid special character");
            return;
        }
        
        // Check next 4 characters (positions 1-4) are uppercase alphabets
        for (int i = 1; i <= 4; i++) {
            char c = code.charAt(i);
            if (c < 'A' || c > 'Z') {
                // The position number for error message is i
                System.out.println(i + " is an invalid number for uppercase character");
                return;
            }
        }
        
        // Check last 3 characters (positions 5-7) are digits
        for (int i = 5; i <= 7; i++) {
            char c = code.charAt(i);
            if (c < '0' || c > '9') {
                // For digits, position in digit section: i-4
                System.out.println((i - 4) + " is an invalid number for digits");
                return;
            }
        }
        
        // If all checks pass, extract last 3 digits and print success message
        String lastThreeDigits = code.substring(5);
        System.out.println(code + " is a valid profile code whose last 3 digits are " + lastThreeDigits);
    }
}