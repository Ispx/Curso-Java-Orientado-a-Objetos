package Heranca;

public final class SavingAccount extends Account {

	private Double interestRate;
	
	public SavingAccount(int number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * (interestRate/100);
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}	
	
	
	
}
