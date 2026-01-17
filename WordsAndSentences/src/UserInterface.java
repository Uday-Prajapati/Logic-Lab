import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		//Fill the code
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		
		System.out.println("Enter the word");
		String word = sc.nextLine();
		
		String[] str = sentence.split(" ");
		
		// searching word in sentence
		boolean found = false;
		
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(word)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(word + " is present in the sentence");
		}else {
			System.out.println(word + " is not present in the sentence");
		}
	}
}	
