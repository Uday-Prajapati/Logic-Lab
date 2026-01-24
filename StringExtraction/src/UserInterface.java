import java.util.Scanner;

public class UserInterface {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println("Enter First Index");
        int index1 = sc.nextInt();

        System.out.println("Enter Second Index");
        int index2 = sc.nextInt();

        UserInterface ui = new UserInterface();
        String res = ui.extractString(str, index1, index2);

        System.out.println(res);
    }

    public String extractString(String sentence, int number1, int number2) {

        String message = "";

        try {
            String output = sentence.substring(number1, number2);
            message = "The output string is " + output + ".";
        } catch (StringIndexOutOfBoundsException e) {
            message = "Invalid index position.";
        } finally {
            message = message + " Thanks for using the application.";
        }

        return message;
    }
}
