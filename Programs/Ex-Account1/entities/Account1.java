package entities;

public class Account1 {

	private int number;
	private String name;
	private double balance;

	public Account1() {
		
	}
			
	public Account1(int number , String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account1(int number, String name, double value_deposit) {
		this.number = number;
		this.name = name;
		deposit(value_deposit);
		
	}
	
	public int getNumber() {
		return number;
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

	public void deposit(double value_deposit) {
		balance += value_deposit;
	}

	public void withdraw(double value_withdraw) {
		balance -= value_withdraw + 5;
	}
	
	public String toString() {
		return "Account: "
	           + number
			   + ", "
			   + "Holder: "
			   + name 
			   + ", "
		       + "Balance: $"
		       + balance;
			  
	}

}
