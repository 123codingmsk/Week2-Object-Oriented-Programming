class CarRental{
	
	String customerName;
	String carModel;
	int rentalDays;
	
	CarRental(){
		customerName = "manoj";
		carModel = "Rolls Royce";
		rentalDays = 3;
	}
	
	void display(){
		System.out.println(customerName+" "+carModel+" "+rentalDays);
	}
	
	private int TotalCost(){
		int eachdayprice = 15000;
		return rentalDays * eachdayprice;
	}
	
	public static void main(String[] args){
		CarRental p1 = new CarRental();
		
		p1.display();
		System.out.println(p1.TotalCost());
	}
}