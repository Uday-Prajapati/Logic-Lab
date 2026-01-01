package CustomizeExceptionorUserDefineException;

class UnderAgeException extends Exception{
	
	// constructor
	UnderAgeException(){
		super("under age"); 

	}
	//
	UnderAgeException(String message){
		super(message); // pass to default exception handler
	}
}
public class CheckedExample {

	public static void main(String[] args) {
		int age = 19; // print u can vote
		// int age = 17; // print u cannot vote
		try {
			if(age<18) {
				throw new UnderAgeException("u cannot vote");
			}else {
				System.out.println("u can vote");
			}
		}
		catch(UnderAgeException e) {
			e.printStackTrace();
		}
	}
}
