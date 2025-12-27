public class MethodOverloading {
	
//		// 2 method with same name in one class it has no argument
//		void show() {
//			System.out.println("1");
//		}
//		
////		same method but with argument 
//		void show(int a) {
//			System.out.println("2");
//		}
		
		// sequence of argument
		// 2 method with same name in one class it has no argument
//				void show(int a, String b) {
//					System.out.println("1");
//				}
//				
////				same method but with argument 
//				void show(String b, int a) {
//					System.out.println("2");
//				}
				
		// both method must have different data type
				// 2 method with same name in one class it has no argument
				void show(int a) {
					System.out.println("1");
				}
				
//				same method but with argument 
				void show(String b) {
					System.out.println("2");
				}
		
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.show(10);
		mo.show("uday");

	} 
}
