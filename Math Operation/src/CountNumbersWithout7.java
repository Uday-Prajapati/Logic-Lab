public class CountNumbersWithout7 {
	public static void main(String[] args) {
		int n = 50;
		int count = 0;

		for (int i = 1; i <= n; i++) {
		    // number ko string bana ke check kar rahe
		    if (!String.valueOf(i).contains("7")) {
		    	count++;
		    }  
		}
		System.out.println(count);
	}
}
