package entities;

public class BankAccount {

	private int accountNumber;
	private String name;
	private double balance;
	private static final double FEE = 5.00;
	
	public BankAccount() {
	}
	
	public BankAccount(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + FEE;
	}
	
	public String toString() {
		return "Account " 
	+ this.accountNumber 
	+ ", Holder: " 
	+ this.name 
	+ ", Balance: $ " 
	+ this.balance;
	}
}
