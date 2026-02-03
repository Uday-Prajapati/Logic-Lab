import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username");
        String username = sc.nextLine();

        // Step 1: Length check
        if (username.length() != 8) {
            System.out.println(username + " is an invalid username");
            return;
        }

        boolean isValid = true;

        // Step 2: First 4 characters must be uppercase alphabets
        for (int i = 0; i < 4; i++) {
            char ch = username.charAt(i);
            if (ch < 'A' || ch > 'Z') {
                isValid = false;
                break;
            }
        }

        // Step 3: 5th character must be '@'
        if (isValid) {
            if (username.charAt(4) != '@') {
                isValid = false;
            }
        }

        // Step 4: Last 3 characters must be digits and courseId between 101–115
        int courseId = 0;
        if (isValid) {
            for (int i = 5; i < 8; i++) {
                char ch = username.charAt(i);
                if (ch < '0' || ch > '9') {
                    isValid = false;
                    break;
                }
                courseId = courseId * 10 + (ch - '0');
            }

            if (courseId < 101 || courseId > 115) {
                isValid = false;
            }
        }

        // If invalid username
        if (!isValid) {
            System.out.println(username + " is an invalid username");
            return;
        }

        // Password Generation
        int asciiSum = 0;
        for (int i = 0; i < 4; i++) {
            char ch = Character.toLowerCase(username.charAt(i));
            asciiSum += ch;
        }

        int lastTwoDigits = courseId % 100;

        String password = "TECH_" + asciiSum + lastTwoDigits;

        System.out.println("Password: " + password);
    }
}
