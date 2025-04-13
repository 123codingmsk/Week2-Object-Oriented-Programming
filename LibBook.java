import java.util.List;
import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
}

class Library{
	
	private List<Book> books;
	
	Library(){
		this.books = new ArrayList<>();
	}
	
	public void addbook(Book book){
		books.add(book);
	}
	
	public void showBooks(){
		if(books.isEmpty()){
			System.out.println("No books are there");
		}else{
			for(Book book : books){
				System.out.println(book);
			}
		}
	}
}

public class LibBook{
	public static void main(String[] args){
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
		
		Library lib1 = new Library();
		Library lib2 = new Library();
		
		lib1.addbook(book1);
		lib1.addbook(book3);
		
		lib2.addbook(book2);
		lib2.addbook(book3);
		
		System.out.println("lib1 : ");
		lib1.showBooks();
		
		System.out.println("lib2 : ");
		lib2.showBooks();
	}
}