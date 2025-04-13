import java.util.List;
import java.util.ArrayList;

class Product{
	private String productName;
	private List<Customer> customers;
	private int prod_id;
	private static int prodCounter = 101;
	
	Product(String productName){
		this.productName = productName;
		this.prod_id = prodCounter++;
		this.customers = new ArrayList<>();
	}
	
	public String getProductName(){
		return productName;
	}
	
	public int getProductID(){
		return prod_id;
	}
	
	public List<Customer> getCustomers(){
		return customers;
	}
	
	public void addCustomer(Customer customer){
		customers.add(customer);
	}
}

class Customer{
	private String Custname;
	private List<Product> products;
	
	Customer(String Custname){
		this.Custname = Custname;
		this.products = new ArrayList<>();
	}
	
	public String getCustomername(){
		return Custname;
	}
	
	public List<Product> getProducts(){
		return products;
	}
	
	public void addProducts(Product product){
		products.add(product);
	}
}

class Order{
	private static int orderCounter = 1001;
	private int order_id;
	private List<Product> products;
	private List<Customer> customers;
	
	Order(){
		this.order_id = orderCounter++;
		this.products = new ArrayList<>();
		this.customers = new ArrayList<>();
	}
	
	public void addProducts(Product product){
		products.add(product);
	}
	
	public void addCustomer(Customer customer){
		customers.add(customer);
	}
	
	void displayOrderDetails(){
		System.out.println("Order ID: "+order_id);
		System.out.println("Customers: ");
		for(Customer customer : customers){
			System.out.println("- "+customer.getCustomername());
		}
		
		System.out.println("Products on this order Number: ");
		for(Product product : products){
			System.out.println("- "+product.getProductName()+" ID: "+product.getProductID());
		}
		System.out.println("Order Placed!");
	}
}

public class ECommerce{
	public static void main(String[] args){
		Customer c1 = new Customer("Manoj");
		
		Product p1 = new Product("Phone");
		Product p2 = new Product("TABLE");
		
		Order order1 = new Order();
		
		order1.addProducts(p1);
		order1.addCustomer(c1);
		order1.addProducts(p2);
		
		p1.addCustomer(c1);
		p2.addCustomer(c1);
		c1.addProducts(p1);
		c1.addProducts(p2);
		
		order1.displayOrderDetails();
	}
}
