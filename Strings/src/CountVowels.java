public class CountVowels {

    static void count(String s) {
        int vowels = 0, consonants = 0;

        // Convert string to lowercase to simplify comparison
        s = s.toLowerCase();

        // Loop through each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {

                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        count("Hello World");
    }
}
