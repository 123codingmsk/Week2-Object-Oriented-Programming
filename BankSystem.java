import java.util.List;
import java.util.ArrayList;

class Customer{
	private String name;
	private List<Account> accounts;
	
	Customer(String name){
		this.name = name;
		this.accounts = new ArrayList<>();
	}
	
	public String getName(){
		return name;
	}
	
	public void addAccount(Account account){
		accounts.add(account);
	}
	
	public void viewBalance(){
		for(Account acc : accounts){
			System.out.println("Account Num: "+acc.getAccNum());
			System.out.println("Balance: "+acc.getBalance());
		}
	}
}

class Account{
	private String accNum;
	private int balance;
	
	Account(String accNum, int balance){
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public String getAccNum(){
		return accNum;
	}
	
	public int getBalance(){
		return balance;
	}
}

class Bank{
	
	private List<Customer> customers;
	
	Bank(){
		this.customers = new ArrayList<>();
	}
	
	public void openAccount(Customer customer,Account account){
		customer.addAccount(account);
		if(!customers.contains(customer)){
			customers.add(customer);
		}
	}
}

public class BankSystem{
	public static void main(String[] a){
		Bank bank = new Bank();
		Customer customer = new Customer("MANOJ");
		
		Account acc1 = new Account("12345", 10000);
		Account acc2 = new Account("67894", 20000);
		
		bank.openAccount(customer, acc1);
		bank.openAccount(customer, acc2);
		
		customer.viewBalance();
	}
}