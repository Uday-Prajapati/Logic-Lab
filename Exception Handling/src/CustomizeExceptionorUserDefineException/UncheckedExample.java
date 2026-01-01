package CustomizeExceptionorUserDefineException;

class UnderAgeException extends RuntimeException{
	
	// constructor
	UnderAgeException(){
		super("you are under age"); 

	}
	// 
	UnderAgeException(String message){
		super(message); // pass to default exception handler
	}
}
public class UncheckedExample {

	public static void main(String[] args) {
		int age = 19; // print u can vote
		// int age = 17; // print u cannot vote
		try {
			if(age<18) {
				throw new UnderAgeException("cannot vote before 18");
			}
			else {
				System.out.println("you can vote");
			}
		}
		catch(UnderAgeException e) {
			e.printStackTrace();
		}
		
	}
}
