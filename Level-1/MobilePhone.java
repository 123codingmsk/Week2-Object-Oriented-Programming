class MobilePhone{
	
	String brand;
	String model;
	double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void display(){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: \n"+price);
	}
	
	public static void main(String[] args){
		MobilePhone ph = new MobilePhone("Samsung", "s23", 40000);
		MobilePhone ph2 = new MobilePhone("Realme", "s24", 10000);
		
		ph.display();
		ph2.display();
	}
}