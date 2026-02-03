import java.util.Scanner;

public class UserInterface {

    // Input Validation
    public static boolean isValid(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();

        // Validate input
        if (!isValid(input)) {
            System.out.println(input + " is an invalid input");
            return;
        }

        // Normalize input
        input = input.toUpperCase();

        // Frequency count
        int[] freq = new int[26];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i) - 'A']++;
        }

        StringBuilder encrypted = new StringBuilder();
        boolean[] visited = new boolean[26];

        // Append even frequency characters (one occurrence)
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int index = ch - 'A';

            if (!visited[index] && freq[index] % 2 == 0) {
                encrypted.append(ch);
                visited[index] = true;
            }
        }

        // Append odd frequency characters (one occurrence)
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int index = ch - 'A';

            if (!visited[index] && freq[index] % 2 != 0) {
                encrypted.append(ch);
                visited[index] = true;
            }
        }

        // Count characters appearing exactly once (BEFORE modifying freq)
        int singleCount = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                singleCount++;
            }
        }

        // Append remaining occurrences
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 1) {
                encrypted.append((char) (i + 'A'));
                freq[i]--;
            }
        }

        // Insert singleCount at the center if needed
        if (singleCount > 0) {
            int len = encrypted.length();
            int position;

            if (len % 2 == 0) {
                position = (len / 2) - 1; // after left-middle
            } else {
                position = len / 2;       // after middle
            }

            encrypted.insert(position + 1, singleCount);
        }

        System.out.println("Encrypted output: " + encrypted.toString());
    }
}
