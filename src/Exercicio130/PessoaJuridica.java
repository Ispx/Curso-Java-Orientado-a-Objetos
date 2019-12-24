package Exercicio130;

public final class PessoaJuridica extends Conta{

	private int numFuncionarios;

	public PessoaJuridica(String name, Double rendaAnual, int numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	
	@Override
	public Double imposto() {
		if(numFuncionarios > 10) {
			setTaxaImposto(14.0);
		}
		else {
			setTaxaImposto(16.0);
		}
		return rendaAnual * getTaxaImposto() / 100; 
	}


	public int getNumFuncionarios() {
		return numFuncionarios;
	}


	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	
	
	
	
	
	
}
