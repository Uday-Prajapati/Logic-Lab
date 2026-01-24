import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //Fill the code here 
	    System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		
		if(!sentence.matches("[a-zA-Z ]+")) {
			System.out.println("Invalid Sentence");
			return;
		}
		
		String[] words = sentence.split(" ");
		int count = words.length;
		System.out.println("Word Count: " + count);
		
		// Even word count
		if (count % 2 == 0) {
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i]);
                if (i != 0)
                   System.out.print(" ");
            	}
        	}
		
		else {
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                if (i != words.length - 1)
                    System.out.print(" ");
            }
		}
	}
}
