import java.util.Arrays;
import java.util.Scanner;
public class UserInterface
{
	
	public static boolean invalidInput(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!((ch >= 'a' && ch <= 'z') || ch == ' ')) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
        
	       Scanner sc=new Scanner(System.in);
	       // sentecne input
	       
	       System.out.println("Enter the sentence");
	       String sentence = sc.nextLine();
	       sentence = sentence.toLowerCase();
	       
	       if(invalidInput(sentence)) {
	    	   System.out.println(sentence + " is an invalid input");
	    	   return;
	       }
	       
	       String[] words = sentence.split(" ");

	       StringBuilder result = new StringBuilder();

	       for (int i = 0; i < words.length; i++) {
	           char[] chars = words[i].toCharArray();
	           Arrays.sort(chars);   // alphabetical order of each word
	           result.append(new String(chars));
	           
	           if (i < words.length - 1) {
	                result.append(" ");
	           }
	       }

	       System.out.println(result.toString());
	    }

}

