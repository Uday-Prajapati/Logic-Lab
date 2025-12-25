
public class RoundFloattoSpecifiedDecimals {

	public static void main(String[] args) {
		double num = 12.34567; // original value
		int decimals = 2;      // kitne decimal chahiye

		// number ko 100 se multiply → round → wapas divide
		double result = Math.round(num * Math.pow(10, decimals))
		                / Math.pow(10, decimals);

		System.out.println(result); // 12.35

	}

}
