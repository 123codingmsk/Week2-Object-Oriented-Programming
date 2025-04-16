interface Reservable{
	void reserveItem();
	boolean checkAvailability();
}

abstract class LibraryItem{
	private int itemId;
	private String title;
	private String author;
	
	LibraryItem(int itemId, String title, String author){
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	
	abstract void getLoanDuration(); //abstract method
	
	void getItemDetails(){    // concrete method
		System.out.println("Item id: "+itemId);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
	}
}

class Book extends LibraryItem implements Reservable{
	private int loanduration;
	Book(int itemId, String title, String author, int loanduration){
		super(itemId, title, author);
		this.loanduration = loanduration;
	}
	
	@Override
	void getLoanDuration(){
		System.out.println("Load Duration: "+loanduration);
	}
	
	@Override
	public void reserveItem(){
		if(checkAvailability()){
			System.out.println("Item reserved!");
		}else{
			System.out.println("Cant reserve Item");
		}
	}
	
	boolean availability = true;
	@Override
	public boolean checkAvailability(){
		if(availability){
			return true;
		}else{
			return false;
		}
	}
}

class Magazine extends LibraryItem implements Reservable{
	private int loanduration;
	Magazine(int itemId, String title, String author, int loanduration){
		super(itemId, title, author);
		this.loanduration = loanduration;
	}
	
	@Override
	void getLoanDuration(){
		System.out.println("Load Duration: "+loanduration);
	}
	
	@Override
	public void reserveItem(){
		if(checkAvailability()){
			System.out.println("Item reserved!");
		}else{
			System.out.println("Cant reserve Item");
		}
	}
	
	boolean availability = true;
	@Override
	public boolean checkAvailability(){
		if(availability){
			return true;
		}else{
			return false;
		}
	}
}

class DVD extends LibraryItem implements Reservable{
	private int loanduration;
	DVD(int itemId, String title, String author, int loanduration){
		super(itemId, title, author);
		this.loanduration = loanduration;
	}
	
	@Override
	void getLoanDuration(){
		System.out.println("Load Duration: "+loanduration);
	}
	
	@Override
	public void reserveItem(){
		if(checkAvailability()){
			System.out.println("Item reserved!");
		}else{
			System.out.println("Cant reserve Item");
		}
	}
	
	boolean availability = true;
	@Override
	public boolean checkAvailability(){
		if(availability){
			return true;
		}else{
			return false;
		}
	}
}

public class LibraryManagement{
	public static void main(String[] args){
		LibraryItem p1 = new Book(40, "Harry Potter", "JK Rowling", 5);
		p1.getLoanDuration();
		p1.getItemDetails();
		
		if(p1 instanceof Reservable){
			((Reservable) p1).reserveItem();
		}
	}
}



