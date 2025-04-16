import java.util.*;

interface Discountable{
	void applyDiscount();
	void getDiscountDetails();
}

abstract class FoodItem{
	private String itemName;
	private int price;
	private int quantity;
	
	FoodItem(String itemName, int price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	abstract void calculateTotalPrice();
	
	void getItemDetails(){
		System.out.println("ItemName: "+itemName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
	}
	
	public int getPrice(){
		return price;
	}
	
	public int getQuantity(){
		return quantity;
	}
}

class VegItem extends FoodItem implements Discountable{
	VegItem(String itemName, int price, int quantity){
		super(itemName, price, quantity);
	}
	
	@Override
	public void calculateTotalPrice(){
		int total = getQuantity() * getPrice();
		System.out.println("Total Price: "+total);
	}
	
	@Override
	public void applyDiscount(){
		double discount = 0.1;
		double finalPrice = getPrice() * getQuantity() * (1 - discount);
		System.out.println("After applying discount: "+finalPrice);
	}
	
	@Override
	public void getDiscountDetails(){
		System.out.println("Discount for VEG Products is 10% off");
	}
}

class NonVegItem extends FoodItem implements Discountable{
	NonVegItem(String itemName, int price, int quantity){
		super(itemName, price, quantity);
	}
	
	@Override
	void calculateTotalPrice(){
		int total =  getQuantity() * getPrice();
		System.out.println("Total Price: "+total);
	}
	
	@Override
	public void applyDiscount(){
		double discount = 0.5;
		double finalPrice = getPrice() * getQuantity() * (1 - discount);
		System.out.println("After applying discount: "+finalPrice);
	}
	
	@Override
	public void getDiscountDetails(){
		System.out.println("Discount for Non-VEG Products is 5% off");
	}
}

public class FoodDelivery{
	public static void main(String[] a){
	
		List<FoodItem> items = new ArrayList<>();
	
		items.add(new VegItem("Milk", 10, 2));
		items.add(new NonVegItem("Chicken", 150, 1));
		
		for(FoodItem item : items){
			item.getItemDetails();
			item.calculateTotalPrice();
			if(item instanceof Discountable){
				((Discountable )item).getDiscountDetails();
				((Discountable )item).applyDiscount();
			}
		}
	}
}

