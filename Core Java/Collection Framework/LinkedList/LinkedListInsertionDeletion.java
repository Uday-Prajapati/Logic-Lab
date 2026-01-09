package LinkedList;

import java.util.LinkedList;

public class LinkedListInsertionDeletion {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		// insertion operation
		
		// insertion at first (begining)
		list.addFirst(10);
		list.addFirst(5);
		
		// insertion at Middle
		list.add(2,20);
		
		// insertion at last
		list.addLast(40);
		list.add(50);
		
		System.out.println("After insertion: " + list);
		
		// Deletion opertaion
		
		// Delete from first
		list.removeFirst();  // removes 5 → [10, 20, 40, 50]
		
		// Delete from last
		list.removeLast();  // removes 50 → [10, 20, 40]
		
		// Delete from middle (by index)
		list.remove(1); // removes 20 → [10, 40]
		
		System.out.println("After Deletion: " + list);

	}

}
