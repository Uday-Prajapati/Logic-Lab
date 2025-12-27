public class DigitsLettersSpecialCharacters {

	public static void main(String[] args) {
		String s = "ab@#123";
		int digit = 0, letter = 0, character=0;
		
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isLetter(ch)) {
				letter++;
			} 
			else if(Character.isDigit(ch)) {
				digit++;
			}else {
				character++;
			}
		}
		System.out.println(digit);
		System.out.println(letter);
		System.out.println(character);
	}
}
