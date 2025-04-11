class Book{
	
	private String title;
	private String author;
	double price;
	
	void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	
	public static void main(String[] args){
		Book b = new Book();
		
		b.title = "Wings of Fire";
		b.author = "Abdul kalam";
		b.price = 100.0;
		
		b.display();
	}
}