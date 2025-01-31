package entities;

public abstract class Account {

	private Integer number;
	private String holder;
	protected Double balance;

	private static final double FEE = 5.0;
	
	public Account() {

	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + FEE;
	}

	public void deposit(double amount) {
		balance += amount;
	}

}
