import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fill the code here 
        System.out.println("Enter Exam Details:");
        System.out.println("Student Name:");
        String name = sc.nextLine();
        
        System.out.println("Question Type (MCQ/Coding):");
        String type = sc.nextLine();
        
        System.out.println("Total Questions:");
        int totalQuestion = sc.nextInt();
        
        System.out.println("Correct Answers:");
        int correctAns = sc.nextInt();
        
        System.out.println("Wrong Answers:");
        int wrongAns = sc.nextInt();
        
        OnlineTest ot = new OnlineTest(name, totalQuestion, correctAns, wrongAns, type);
        double totalScore = ot.calculateScore();
        
        String result = Exam.evaluateResult(totalScore);
        
        System.out.println("Exam Summary:");
        System.out.println(type + " Test: " + name);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Result: " + result);
    }
}