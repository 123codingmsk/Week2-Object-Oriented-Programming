class BankAccount{

	static String bankName;
	String accountHolderName;
	final int accountNumber;
	static int totalAccounts = 0;
	
	BankAccount(String bankName, String accountHolderName, int accountNumber){
		BankAccount.bankName = bankName;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccounts++;
	}
	
	static void getTotalAccounts(){
		System.out.println(totalAccounts);
	}
}

public class Bank{
	public static void main(String[] args){
		BankAccount b1 = new BankAccount("SBI", "Manoj", 40);
		
		if(b1 instanceof BankAccount){
			System.out.println(BankAccount.bankName);
			System.out.println(b1.accountHolderName);
			System.out.println(b1.accountNumber);
			BankAccount.getTotalAccounts();
		}else{
			System.out.println("Account doesnt belong to our bank!");
		}
	}
}