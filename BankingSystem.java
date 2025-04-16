interface Loanable{
	void applyforLoan();
	boolean calculateLoanEligibility();
}

abstract class BankAccount{
	private String accNum;
	private String holderName;
	private double balance;
	
	BankAccount(String accNum, String holderName, double balance){
		this.accNum = accNum;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public String getAccNum(){
		return accNum;
	}
	
	public String getholderName(){
		return holderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amount){
		if(amount > 0){
			System.out.println("Current Balance before deposit: "+balance);
			balance = balance + amount;
			System.out.println("Total Balance: "+balance);
		}else{
			System.out.println("No negative amount");
		}
	}
	
	public void withdraw(double amount){
		if(amount > 0 && balance >= amount){
			System.out.println("Current Balance before withdrawl: "+balance);
			balance = balance - amount;
			System.out.println("Total Balance: "+balance);
		}else{
			System.out.println("You cant withdraw!");
		}
	}
	
	abstract void calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable{
	int years;
	int interestrate = 5;
	SavingsAccount(String accNum, String holderName, int balance, int years){
		super(accNum, holderName, balance);
		this.years = years;
	}
	
	@Override
	void calculateInterest(){
		int interest = years * interestrate;
		System.out.println("Interest for "+years+"yrs of interestrate "+interestrate+" : "+interest);
	}
	
	@Override
	public void applyforLoan(){
		if(calculateLoanEligibility()){
			System.out.println("You applied for Loan");
		}else{
			System.out.println("You cant apply for Loan");
		}
	}
	
	@Override
	public boolean calculateLoanEligibility(){
		if(years > 3){
			return true;
		}else{
			return false;
		}
	}
}

class CurrentAccount extends BankAccount{
	int years;
	int interestrate = 5;
	CurrentAccount(String accNum, String holderName, int balance, int years){
		super(accNum, holderName, balance);
		this.years = years;
	}
	
	@Override
	void calculateInterest(){
		int interest = years * interestrate;
		System.out.println("Interest for "+years+"yrs of interestrate "+interestrate+" : "+interest);
	}
}

public class BankingSystem{
	public static void main(String[] m){
		double amount = 500;
		BankAccount p1 = new SavingsAccount("87529385", "Manoj", 10000, 5);
		p1.deposit(amount);
		p1.withdraw(amount);
		p1.calculateInterest();
		if (p1 instanceof Loanable) {
            ((Loanable) p1).applyforLoan();
        }
	}
}