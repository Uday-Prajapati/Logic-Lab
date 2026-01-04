import java.util.Scanner;

public class RobustStringAnalytics {

    // Mandatory method to count vowels
    static int[] countVowels(String s) {
        int[] v = new int[5];   // a, e, i, o, u

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a') v[0]++;
            else if (ch == 'e') v[1]++;
            else if (ch == 'i') v[2]++;
            else if (ch == 'o') v[3]++;
            else if (ch == 'u') v[4]++;
        }

        return v;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line;

        // do-while to force at least one read
        do {
            line = sc.nextLine();
        } while (line.length() == 0);

        int wordCount = 0;
        int sentenceCount = 0;
        int digitCount = 0;
        int letterCount = 0;

        String longestWord = "";
        String currentWord = "";

        // Character-by-character scan
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // Letter and digit count
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }

            // Sentence count
            if (ch == '.' || ch == '!' || ch == '?') {
                sentenceCount++;
            }

            // Word building (clean punctuation)
            if (Character.isLetterOrDigit(ch)) {
                currentWord = currentWord + ch;
            } else {
                if (currentWord.length() > 0) {
                    wordCount++;

                    if (currentWord.length() > longestWord.length()) {
                        longestWord = currentWord;
                    }

                    currentWord = "";
                }
            }
        }

        // Handle last word
        if (currentWord.length() > 0) {
            wordCount++;
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }

        // Call vowel method
        int[] vowels = countVowels(line);

        // Output
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Digits: " + digitCount + ", Letters: " + letterCount);
        System.out.println("Longest word: \"" + longestWord + "\"");
        System.out.println(
                "Vowel freq: a=" + vowels[0] +
                " e=" + vowels[1] +
                " i=" + vowels[2] +
                " o=" + vowels[3] +
                " u=" + vowels[4]
        );
    }
}
