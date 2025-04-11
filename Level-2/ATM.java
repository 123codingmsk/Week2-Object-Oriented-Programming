import java.util.Scanner;
class ATM{
	
	private String accountHolder;
	private int accountNumber;
	private int balance;
	
	ATM(String name, int number, int balance){
		this.accountHolder = name;
		this.accountNumber = number;
		this.balance = balance;
	}
	
	void deposit(int amount){
		if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
		displaybal();
	}
	
	void withdraw(int amount){
		if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
		displaybal();
	}
	
	void displaybal(){ 
		System.out.println("Your current balance: "+balance);
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		ATM p1 = new ATM("Manoj", 40, 0);
		
		while(true){
			System.out.println("1 Deposit");
			System.out.println("2 WithDraw");
			System.out.println("3 Check Balance");
			System.out.println("4 Exit");
			System.out.println("Enter your option ");
			
			int choice = scn.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Deposit Amount?");
					int dp_amount = scn.nextInt();
					p1.deposit(dp_amount);
					break;
				
				case 2:
					System.out.println("With draw Amount");
					int wd_amount = scn.nextInt();
					p1.withdraw(wd_amount);
					break;
					
				case 3:
					p1.displaybal();
					break;
					
				case 4:
					System.out.println("Exiting from the ATM!");
					System.out.println("Meet us again!");
					return;
					
				default:
					System.out.println("Invalid Choice");
					
				scn.close();
			}
		}	
	}
}