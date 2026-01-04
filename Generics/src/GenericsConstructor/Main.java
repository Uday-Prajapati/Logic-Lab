package GenericsConstructor;

class Test {

    <T> Test(T value) {
        System.out.println(value);
    }
}

public class Main {

	public static void main(String[] args) {
		new Test(10);
		new Test("Hello");
		new Test(3.14);
	}
}
