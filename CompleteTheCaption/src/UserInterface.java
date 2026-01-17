import java.util.Scanner;
public class UserInterface {
	
	public static boolean invalidSymbol(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!((ch >= 'A' && ch<= 'Z') ||
					(ch >= 'a' && ch<= 'z') ||
					ch == '!' ||
					ch == ' ')) {
				return true;
			}
		}
		return false;
	}
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        //fill the code here
       
       System.out.println("Enter the first string");
       String str1 = sc.nextLine();
        
       System.out.println("Enter the second string");
       String str2 = sc.nextLine();
       
       if(str1.length() != str2.length()) {
    	   System.out.println("Length of the strings " + str1 + " and " + str2 + " does not match");
    	   return;
       }
       
       boolean invalidStr1 = invalidSymbol(str1);
       boolean invalidStr2 = invalidSymbol(str2);
       
       if(invalidStr1 && invalidStr2) {
    	   System.out.println(str1 + " and " + str2 + " contains invalid symbols");
    	   return;
       }
       else if(invalidStr1) {
    	   System.out.println(str1 + " contains invalid symbols");
    	   return;
       }
       else if(invalidStr2) {
    	   System.out.println(str2 + " contains invalid symbols");
    	   return;
       }
       
       StringBuilder res = new StringBuilder();
       
       for(int i=0; i<str1.length(); i++) {
    	   if(str1.charAt(i) == '!') {
    		   res.append(str2.charAt(i));
    	   }else {
    		   res.append(str1.charAt(i));
    	   }
       }
       System.out.println(res.toString());
    }
}
