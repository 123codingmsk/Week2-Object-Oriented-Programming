class Book{

	private String title;
	private String author;
	int price;
	
	Book(){
		title = "Wings of Fire";
		author = "Abdul Kalam";
		price = 100;
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args){
		Book b1 = new Book("Harry potter", "jk rowling", 450);
		Book b2 = new Book();
		
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.price);
		
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
	}
}
		