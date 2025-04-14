class Book{
	private String title;
	private int publicationYear;
	
	Book(String title, int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getYear(){
		return publicationYear;
	}
}

//single class inheritance
class Author extends Book{
	private String name;
	private String bio;
	
	Author(String title, int publicationYear, String name, String bio){
		super(title, publicationYear);
		this.name= name;
		this.bio = bio;
	}
	
	void displayInfo(){
		System.out.println("Title: "+getTitle());
		System.out.println("Year: "+getYear());
		System.out.println("Author: "+name);
		System.out.println("Bio: "+bio);
	}
}


public class Library{
	public static void main(String[] main){
		Author author = new Author("Harry Potter", 1999, "JK Rowling", "She is author");
		
		author.displayInfo();
	}
}