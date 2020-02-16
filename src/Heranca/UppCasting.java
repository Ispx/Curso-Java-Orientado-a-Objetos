package Heranca;

public class UppCasting {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1234,"Alex",0.0);
		BusinessAccount bAcc1 = new BusinessAccount(0001, "Maria", 0.0, 0.0);
		
		//Polimorfismo s�o variaveis do mesmo tipo que apontam para objetos diferentes, tendo assim comportamentos diferentes.
		
		//UppCasting
		Account acc2 = bAcc1;
		Account acc3 = new BusinessAccount(0002,"Jo�o",0.0,0.0);
		Account acc4 = new SavingAccount(0003,"J�",0.0,15.0);
		
		//DownCasting
		BusinessAccount acc5 = (BusinessAccount) acc3;
		//BusinessAccount acc6 = (BusinessAccount) acc4; // Erro: obj acc4 n�o � do tipo BusinessAccount
		
		// Tratativa de erro para instancia��o de objetos de tipos diferentes
		if(acc4 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount) acc4;
			acc6.loan(100.00);
			System.out.println("Loan!");
		}
		// Tratativa de erro para instancia��o de objetos de tipos diferentes
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc7 = (SavingAccount) acc3;
			acc7.updateBalance();
			System.out.println("UppDate!");
		}
		
		
	}

}
