import java.util.Scanner;

public class UserInterface {

    private static boolean isValid(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();

        // 1. Validation
        if (!isValid(input)) {
            System.out.println(input + " is an invalid input");
            return;
        }

        // 2. Normalize
        input = input.toUpperCase();

        // 3. Frequency count
        int[] freq = new int[26];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i) - 'A']++;
        }

        boolean[] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();

        // G1: Vowels with even frequency
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int idx = ch - 'A';
            if (isVowel(ch) && freq[idx] % 2 == 0 && !visited[idx]) {
                sb.append(ch);
                visited[idx] = true;
            }
        }

        // G2: Consonants with odd frequency
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int idx = ch - 'A';
            if (!isVowel(ch) && freq[idx] % 2 != 0 && !visited[idx]) {
                sb.append(ch);
                visited[idx] = true;
            }
        }

        // G3: Remaining characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int idx = ch - 'A';
            if (!visited[idx]) {
                sb.append(ch);
                visited[idx] = true;
            }
        }

        // Append remaining occurrences
        int[] remaining = freq.clone();
        for (int i = 0; i < sb.length(); i++) {
            remaining[sb.charAt(i) - 'A']--;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int idx = ch - 'A';
            if (remaining[idx] > 0) {
                sb.append(ch);
                remaining[idx]--;
            }
        }

        // Count single consonants
        int singleConsonants = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1 && !isVowel((char) (i + 'A'))) {
                singleConsonants++;
            }
        }

        // Insert count
        if (singleConsonants > 1) {
            int k = sb.length() / 3;
            sb.insert(k + 1, singleConsonants);
        }

        System.out.println("Transformed output: " + sb);
    }
}
