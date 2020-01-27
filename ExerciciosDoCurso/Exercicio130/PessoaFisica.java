package Exercicio130;

public class PessoaFisica extends Conta{
	
	private Double despesas;
	
	public PessoaFisica(String name, Double rendaAnual, Double despesas) {
		super(name, rendaAnual);
		this.despesas = despesas;
	}


	@Override
	public Double imposto() {
		if(rendaAnual < 20000) {
			setTaxaImposto(15.0);
		}
		else {
			setTaxaImposto(25.0);
		}
		return rendaAnual * getTaxaImposto()/100;
	}


	public Double getDespesas() {
		return despesas;
	}


	public void setDespesas(Double despesas) {
		this.despesas = despesas;
	}


	
	
	
}
