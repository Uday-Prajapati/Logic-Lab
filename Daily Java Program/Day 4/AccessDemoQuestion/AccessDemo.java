package AccessDemoQuestion;

public class AccessDemo {
	void A(){ // default
		System.out.println("1");
	}
	
	public void B() {
		System.out.println("2");
	}
	
	private void C() {
		System.out.println("3");
	}
	
	protected void D() {
		System.out.println("4");
	}
}
