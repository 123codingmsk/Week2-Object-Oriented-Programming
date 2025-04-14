class Product{

	String productName;
	int price;
	static int totalProducts;
	
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	void displayProductDetails(){
		System.out.println(productName);
		System.out.println(price);
	}
	
	static void displayTotalProducts(){
		System.out.println(totalProducts);
	}

	public static void main(String[] args){
		Product p1 = new Product("Milk", 10);
		Product p2 = new Product("Lays", 10);
		
		p1.displayProductDetails();
		p2.displayProductDetails();
		p1.displayTotalProducts();
	}
}