package Exercicio130;

public abstract class Conta {
	
	protected String name;
	protected Double rendaAnual;
	private Double taxaImposto;
	
	public Conta(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double imposto();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getTaxaImposto() {
		return taxaImposto;
	}

	public void setTaxaImposto(Double taxaImposto) {
		this.taxaImposto = taxaImposto;
	}
	
	
	
	
	
	
}
