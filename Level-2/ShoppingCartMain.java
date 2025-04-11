import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    private CartItem[] cart;
    private int itemCount;

    public ShoppingCart() {
        cart = new CartItem[10]; 
        itemCount = 0;
    }

    public void addItem(String itemName, double price, int quantity) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equals(itemName)) {
                cart[i].quantity += quantity; 
                return;
            }
        }
        if (itemCount < cart.length) {
            cart[itemCount++] = new CartItem(itemName, price, quantity);
        } else {
            System.out.println("Cart is full!");
        }
    }

    public void removeItem(String itemName) {
        int indexToRemove = -1;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equals(itemName)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            System.out.println("Item not found!");
            return;
        }

        for (int i = indexToRemove; i < itemCount - 1; i++) {
            cart[i] = cart[i + 1]; 
        }
        cart[itemCount - 1] = null; 
        itemCount--;
        System.out.println("Item removed successfully.");
    }

    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cart[i].getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}

public class ShoppingCartMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = sc.nextLine();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
    }
}
