import java.util.Scanner;

public class UserInterface
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Generate your password");
        String passWord = sc.nextLine();

        // Regex 
        String passwordRegex = "^[a-zA-Z0-9@$*#]{6,12}$";

        //  Validate length and allowed characters
        if (!passWord.matches(passwordRegex)) {
            System.out.println(passWord + " is an invalid password");
            return;
        }

        int lowerCount = 0;
        int upperCount = 0;
        int specialCharacter = 0;
        int digit = 0;

        // Count characters
        for (int i = 0; i < passWord.length(); i++) {
            char ch = passWord.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            }
            else if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            }
            else if (ch >= '0' && ch <= '9') {
                digit++;
            }
            else if (ch == '@' || ch == '$' || ch == '*' || ch == '#') {
                specialCharacter++;
            }
        }

        //validation
        if (lowerCount < 1 || upperCount < 1 || specialCharacter < 1) {
            System.out.println(passWord + " is an invalid password");
            return;
        }

        // Valid password output
        System.out.println(
            "The generated password " + passWord + " is valid and has " +
            lowerCount + " lowercase alphabet " +
            upperCount + " uppercase alphabet " +
            specialCharacter + " special character " +
            digit + " digit"
        );
    }
}
