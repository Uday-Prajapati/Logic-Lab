public interface Exam {
    // Fill the code here 
	public double calculateScore();
	
	public static String evaluateResult(double percentage) {
		
		String student;
		if(percentage >= 85) {
			student = "Merit";
		}
		else if(percentage >= 60) {
			student = "Pass";
		}
		else {
			student = "Fail";
		}
		return student;
	}
	
}
