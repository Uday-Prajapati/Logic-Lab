public class Interface {

    interface I1 {
    	public static final int a = 10;
        void show();
    }

    static class Test implements I1 {   // static banana zaroori hai
        public void show() {
            System.out.println("1");
            System.out.println(a);
        }

        public static void main(String[] args) {
            Test t = new Test();
            t.show();
        }
    }
}

// Multiple inheritance using interface
//public class Interface {
//
//    interface I1 {
//        void show();
//    }
//    
//    interface I2{
//    	void display();
//    }
//
//    static class Test implements I1, I2 {   // static banana zaroori hai
//        public void show() {
//            System.out.println("1");
//        }
//        
//        public void display() {
//            System.out.println("2");
//        }
//
//        public static void main(String[] args) {
//            Test t = new Test();
//            t.show();
//            t.display();
//        }
//    }
//}
