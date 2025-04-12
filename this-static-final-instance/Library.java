class Book{
	static String libraryName = "SRM";
	String title;
	String author;
	final int isbn;
	
	Book(String title, String author, int isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}	
	
	static void displayLibraryName(){
		System.out.println(libraryName);
	}
	
	void displayDetails(){
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("ISBN: "+ isbn);
	}
}

public class Library{
	public static void main(String[] args){
		Book b1 = new Book("Harry Potter", "JK Rowling", 40);
		
		if(b1 instanceof Book){
			Book.displayLibraryName();
			b1.displayDetails();
		}else{
			System.out.println("Not an instance");
		}
	}
}