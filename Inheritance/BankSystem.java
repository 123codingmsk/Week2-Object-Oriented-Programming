class BankAccount{
	private int accountNumber;
	private int balance;
	
	BankAccount(int accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getbalance(){
		return balance;
	}
	
	void displayInfo(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}

class SavingsAccount extends BankAccount{
	private double interestRate;
	
	SavingsAccount(int accountNumber, int balance, double interestRate){
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	void displayAccountType(){
		System.out.println("Savings Account");
		super.displayInfo();
		System.out.println("Interest rate: "+interestRate);
	}
}

class CheckingAccount extends BankAccount{
	private int withdrawlLimit;
	
	CheckingAccount(int accountNumber, int balance){
		super(accountNumber, balance);
		this.withdrawlLimit = 1000;
	}
	
	void Canwithdraw(){
		if(getbalance() > withdrawlLimit){
			System.out.println("You can withdraw");
		}else{
			System.out.println("You cant withdraw");
		}
	}
	
	void displayAccountType(){
		System.out.println("Checking Account");
		super.displayInfo();
		Canwithdraw();
	}
}

class FixedDepositAccount extends BankAccount{
	
	FixedDepositAccount(int accountNumber, int balance){
		super(accountNumber, balance);
	}
	
	void displayAccountType(){
		System.out.println("Fixed Deposit Account");
		super.displayInfo();
	}
}

class BankSystem{
	public static void main(String[] main){
		SavingsAccount acc1 = new SavingsAccount(0040, 10000, 5);
		acc1.displayAccountType();
		
		CheckingAccount acc2 = new CheckingAccount(0050, 20000);
		acc2.displayAccountType();
		
		FixedDepositAccount acc3 = new FixedDepositAccount(0060, 30000);
		acc3.displayAccountType();
	}
}