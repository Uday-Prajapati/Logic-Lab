import java.util.Scanner;

public class ReplaceSpecialCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		str = str.replaceAll("^[a-zA-Z0-9]", "");
		System.out.println("new string: " + str);
	}

}
