package Heranca;

public class Account {
	private int number;
	private String holder;
	protected Double balance;
	
	
	
	
	public Account(int number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public void withdraw(Double amount) {
		if(amount > balance) {
			System.out.println("Saldo insuficiente!");
		}
		balance -= amount;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
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


	
	
	
	
	
}
