package Heranca;

public final class  BusinessAccount extends Account {
	
	private Double loanLimit;

	public BusinessAccount(int number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			
		}
	}
	
	@Override  //Sobreposi��o de met�dos de clasees
	public void withdraw(Double amount) {
		balance -= amount + 5; // 5,00 de taxa de saque 
	}

}
