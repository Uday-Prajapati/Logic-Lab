//Reverse Words in a Sentence 
//Topic: Strings Task: Given a sentence, reverse each word but keep the word order same. 
//Example Input: "Java is fun" 
//Expected Output: "avaJ si nuf"

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        // keep the word order same
        String[] words = str.split(" ");
        String result = "";

        // reverse each word
        for (String w : words) {
            String rev = "";

            // actual reverse
            for (int i = w.length() - 1; i >= 0; i--) {
                rev = rev + w.charAt(i);
            }

            result = result + rev + " ";
        }

        System.out.println("Reverse word: " + result.trim());
    }
}
