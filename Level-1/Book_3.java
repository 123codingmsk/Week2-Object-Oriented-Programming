class Book_3{
	
	public int ISBN;
	protected String title;
	private String author;
	
	Book_3(int ISBN, String title, String author){
		this.ISBN =ISBN;
		this.title = title;
		this.author =author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return author;
	}
	
	void display(){
		System.out.println("ISBN: "+ISBN);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
	}
	
	public static void main(String[] args){
		Book_3 p1 = new Book_3(40, "Harry", "Potter");
		p1.display();
		
		EBook b1 = new EBook(50,"HARRY pOTTER", "JK Rowling");
		b1.display();
	}
}

class EBook extends Book_3{
	EBook(int ISBN, String title, String author){
		super(ISBN, title, author);
		setAuthor("Manoj");
	}
	
	void display(){
		System.out.println("Author: "+getAuthor());
	}
}
	