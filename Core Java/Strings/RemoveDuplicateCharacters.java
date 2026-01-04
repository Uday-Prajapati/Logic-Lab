public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String s = "banana";
        String res = "";
        
        for(int i = 0; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	
        	 if(!res.contains(ch + "")) {
             	res = res + ch;
             }
        }
        System.out.println(res);
    }
}
