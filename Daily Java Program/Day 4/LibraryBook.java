//11) LibraryBook with Encapsulation & Static Catalog Count
//Question:
//Create a LibraryBook with issue/return logic and static tracking of total books.
//Requirements:
//
//Fields: private String title, author, private boolean issued
//Static field: public static int totalBooks — incremented in constructor
//Methods:
//
//void issue() — only if not already issued
//void returnBook() — only if currently issued
//boolean isIssued()
//
//Usage Example:
//LibraryBook b = new LibraryBook("1984", "Orwell");
//b.issue();      // true path
//b.issue();      // should reject (already issued)
//b.returnBook(); // true path

import java.util.Scanner;
class LibraryBook {
	
	private String title;
	private String author;
	private boolean issued;
	
	// static field
	public static int totalBooks;
	
	// constructor
	public LibraryBook(String title, String author){
		this.title = title;
		this.author = author;
		totalBooks++;
	}
	
	// methods
	
	void issue() {
		if(issued == false) {
			issued = true;
			System.out.println("true path");
		} else {
			System.out.println("already issued");
		}
	}
	
	void returnBook() {
		if(issued == true) {
			issued = false;
			System.out.println("true path");
		}else {
			System.out.println("Book is not issued");
		}
	}
	
	boolean isIssued() {
		return issued;
	}
	
	public static void main(String[] args) {
//		LibraryBook b = new LibraryBook("1984", "Orwell");
//		b.issue();      // true path
//		b.issue();      // should reject (already issued)
//		b.returnBook(); // true path

// -------------------------------------------------
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book title: ");
		String title = sc.next();
		
		System.out.println("Enter author name: ");
		String author = sc.next();
		
		LibraryBook b = new LibraryBook(title, author);
		
		// book issued
		char more;
		do {
			System.out.println("\nChoose action: 1 for issue, 2 for return");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				b.issue();
			}else if(choice == 2) {
				b.returnBook();
			}else {
				System.out.println("Invalid Choice");
			}
			
			System.out.println("Is book issued?" + b.isIssued());
			System.out.println("Total books in library: " + LibraryBook.totalBooks);
            
			System.out.println("Do you want to perform another action? (y/n)");
			more = sc.next().charAt(0);
		}while(more == 'y' || more == 'Y');
	}
}
