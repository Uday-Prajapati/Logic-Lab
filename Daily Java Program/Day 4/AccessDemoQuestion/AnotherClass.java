package AccessDemoQuestion;

public class AnotherClass {

	public static void main(String[] args) {
		AccessDemo ad = new AccessDemo();
		
		// observing which method is callabe
		ad.A(); // default
		ad.B(); // public
//		ad.C(); // private is not called
		ad.D(); // protected is called
	}
}
