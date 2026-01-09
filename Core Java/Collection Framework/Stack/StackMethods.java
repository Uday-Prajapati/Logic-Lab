package Stack;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {

		// Creating Stack object
		Stack<Integer> s = new Stack<>();

		// ⭐ push() → adds element at TOP of stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s); // [10, 20, 30, 40]

		// ⭐ peek() → returns TOP element without removing it
		System.out.println(s.peek()); // 40

		// ⭐ pop() → removes and returns TOP element
		System.out.println(s.pop());  // 40
		System.out.println(s);        // [10, 20, 30]

		// ⭐ empty() → checks whether stack is empty or not
		System.out.println(s.empty()); // false

		// ⭐ search() → returns 1-based position from TOP
		// Top element position = 1
		System.out.println(s.search(20)); // 2

		// contains() → checks element present or not (from Vector)
		System.out.println(s.contains(10)); // true

		// size() → returns number of elements in stack
		System.out.println(s.size());

		// get(index) → access element using index (from Vector)
		System.out.println(s.get(0)); // 10

		// ⭐ Traversing Stack using for loop
		for(int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}

		// ⭐ Traversing Stack using for-each loop
		for(int no : s) {
			System.out.println(no);
		}

		// clear() → removes all elements from stack
		s.clear();
		System.out.println(s); // []
	}
}
