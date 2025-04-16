interface Taxable {
    void calculateTax();
    void TaxDetails();
}

abstract class Product {
    private int productID;
    private String name;
    private double price;

    Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    abstract void calculateDiscount();

    public int getProdID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    void displayProd() {
        System.out.println("ProductID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    private double discount;
    private boolean isTaxable = true;
    private double tax = 0.1;
    private double discountedPrice;

    Electronics(int productID, String name, double price, double discount) {
        super(productID, name, price);
        this.discount = discount;
    }

    @Override
    public void calculateDiscount() {
        discountedPrice = getPrice() - (discount / 100 * getPrice());
        System.out.println("Current price: " + getPrice());
        System.out.println("After Discount: " + discountedPrice);
    }

    @Override
    public void calculateTax() {
        if (isTaxable) {
            double taxAmount = discountedPrice * tax;
            double priceAfterTax = discountedPrice + taxAmount;
            System.out.println("After Tax: " + priceAfterTax);
        }
    }

    @Override
    public void TaxDetails() {
        System.out.println("Tax Rate: " + tax * 100 + "%");
    }
}

class Clothing extends Product {
    private double discount;
    private double discountedPrice;

    Clothing(int productID, String name, double price, double discount) {
        super(productID, name, price);
        this.discount = discount;
    }

    @Override
    public void calculateDiscount() {
        discountedPrice = getPrice() - (discount / 100 * getPrice());
        System.out.println("Current price: " + getPrice());
        System.out.println("After Discount: " + discountedPrice);
    }
}

class Groceries extends Product {
    private double discount;
    private double discountedPrice;

    Groceries(int productID, String name, double price, double discount) {
        super(productID, name, price);
        this.discount = discount;
    }

    @Override
    public void calculateDiscount() {
        discountedPrice = getPrice() - (discount / 100 * getPrice());
        System.out.println("Current price: " + getPrice());
        System.out.println("After Discount: " + discountedPrice);
    }
}

public class ECommerce {
    public static void main(String[] a) {
        Electronics p1 = new Electronics(1, "TV", 10000, 10); 
        p1.calculateDiscount();   
        p1.calculateTax();        
        p1.TaxDetails();          
    }
}
