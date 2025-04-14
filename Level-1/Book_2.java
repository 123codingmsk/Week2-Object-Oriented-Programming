class Book_2{
	
	String title = "Harry Potter";
	String author = "JK rowling";
	int price = 100;
	boolean availability = false;
	
	Book_2(){ }
	
	Book_2(Book_2 borrow){
		this.title = borrow.title;
		this.author = borrow.author;
		this.price = borrow.price;
		this.availability = borrow.availability;
	}
	
	public static void main(String[] args){
		Book_2 p1 = new Book_2();
		
		if(p1.availability){
			Book_2 p2 = new Book_2(p1);
			System.out.println(p2.title);
		}else{
			System.out.println("Cant borrow!");
		}
	}
}