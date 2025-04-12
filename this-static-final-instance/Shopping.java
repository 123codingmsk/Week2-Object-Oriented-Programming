class Product{
	static double discount = 0.2;
	
	String productName;
	double price;
	int quantity;
	final int productID;
	
	Product(String productName, double price, int quantity, int productID){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productID = productID;
	}
	
	static void updateDiscount(double newdiscount){
		discount = newdiscount;
	}
	
	void displayCostDetails(){
		double total = quantity * price;
		System.out.println("Product ID: "+productID);
		System.out.println("Product: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
		System.out.println("Current Total: "+total);
		updateDiscount(0.3);
		System.out.println("After discount of "+(discount * 100) + "%");
		System.out.print(" Total: "+(total * (1 - discount)));
	}
}

public class Shopping{
	public static void main(String[] args){
		Product p1 = new Product("Milk", 10.0, 2, 1);
		
		
		if(p1 instanceof Product){
			p1.displayCostDetails();
		}else{
			System.out.println("Not an Instance");
		}
		
	}
}