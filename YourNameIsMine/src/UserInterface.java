import java.util.Scanner;

public class UserInterface {

    // Check whether the name contains only alphabets and spaces
    public static boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    // Check whether s1 is a subsequence of s2 (case-insensitive)
    public static boolean isSubSequence(String s1, String s2) {
        int i = 0, j = 0;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s1.length();
    }

    // Calculate compatibility value (ignoring spaces)
    public static int compatibilityValue(String s1, String s2) {
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        return Math.abs(s1.length() - s2.length());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the man name");
        String man = sc.nextLine();

        System.out.println("Enter the woman name");
        String woman = sc.nextLine();

        boolean manValid = isValidName(man);
        boolean womanValid = isValidName(woman);

        // Both names invalid
        if (!manValid && !womanValid) {
            System.out.println("Both " + man + " and " + woman + " are invalid names");
            return;
        }

        // Man name invalid
        if (!manValid) {
            System.out.println(man + " is an invalid name");
            return;
        }

        // Woman name invalid
        if (!womanValid) {
            System.out.println(woman + " is an invalid name");
            return;
        }

        // Check if made for each other
        if (isSubSequence(man, woman) || isSubSequence(woman, man)) {

            System.out.println(man + " and " + woman + " are made for each other");

            int value = compatibilityValue(man, woman);
            System.out.println("Compatibility value is " + value);

        } else {
            System.out.println(man + " and " + woman + " are not made for each other");
        }
    }
}
