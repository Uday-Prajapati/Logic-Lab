import java.util.*;
public class UserInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = sc.nextLine();
        
        System.out.println("Enter the two indices");
        int index1 = sc.nextInt();
        if(index1 > word.length()) {
        	System.out.println(index1 + " should be greater than Index1");
        	return;
        }
        
        int index2 = sc.nextInt();
        if(index2 > word.length()) {
        	System.out.println(index2 + " should be greater than Index1");
        	return;
        }
        else if(index1 >= index2) {
        	System.out.println(index2 + " should be greater than "+index1);
        	return;
        }else {
        	System.out.println(word.substring(index1, index2+1));
        }
    }
}
