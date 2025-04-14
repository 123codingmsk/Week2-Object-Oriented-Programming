class Order{
	private int orderId;
	private String date;
	
	Order(int orderId, String date){
		this.orderId = orderId;
		this.date = date;
	}
	
	void getOrderStatus(){
		System.out.println("Order Initialized");
	}
}

class ShippedOrder extends Order{
	private int trackingNumber;
	
	ShippedOrder(int orderId, String date, int trackingNumber){
		super(orderId, date);
		this.trackingNumber = trackingNumber;
	}
	
	void getOrderStatus(){
		System.out.println("Order Shipped");
	}
}

class DeliveredOrder extends ShippedOrder{
	private String deliveryDate;
	
	DeliveredOrder(int orderId, String date, int trackingNumber, String deliveryDate){
		super(orderId, date, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	void getOrderStatus(){
		System.out.println("Order Delivered");
	}
}

public class RetailOrder{
	public static void main(String[] m){
		Order order = new Order(1, "2nd,March,2025");
		ShippedOrder so = new ShippedOrder(1, "2nd,March,2025",001);
		DeliveredOrder p1 = new DeliveredOrder(1, "2nd,March,2025", 001, "4th,March,2025");
		
		order.getOrderStatus();
		so.getOrderStatus();
		p1.getOrderStatus();
	}
}