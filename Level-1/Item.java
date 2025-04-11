import java.util.Scanner;
class Item{
	
	private String itemCode;
	public String itemName;
	protected double price;
	int quantity;
	
	public void totalcost(){
		double total = quantity * price;
		System.out.println("Itemcode: "+itemCode);
		System.out.println("ItemName: "+itemName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);	
		System.out.println("Total Cost: "+total);
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		Item item = new Item();
		item.itemCode = "RA2111";
		item.itemName = "Lays";
		item.price = 10.0;
		System.out.println("How many u want?");
		item.quantity =  scn.nextInt();
		
		item.totalcost();
	}
}