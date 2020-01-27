package Interface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerarParcelas extends Contrato implements ServicoPagamento{
	

	private Double juros;
	private Double[] valorParcelas;
	private Double taxa;
	private int numParcelas;
	private Contrato contrato;
	private List<String> printParcelas = new ArrayList<>();
	
	public GerarParcelas(Contrato contrato, Double juros, Double taxa) {
		super(contrato.getNumero(), contrato.getData(), contrato.getValor());
		this.contrato = contrato;
		this.juros = juros;
		this.taxa = taxa;

	}

	
	@Override
	public Double juros() {

		return 1+juros/100; 
	
	}	
	
	@Override
	public Double TaxaPorPagamento() {
		
		return 1+(taxa/100);
	}
	
	public void setParcelas(int numParcelas) {
		
		this.valorParcelas = new Double[numParcelas];
		
		for(int i = 0 ; i < numParcelas ; i ++) {
		
			this.valorParcelas[i] = (contrato.getValor()/numParcelas * Math.pow(juros(), i+1)) * TaxaPorPagamento();
			
		}
		this.numParcelas = numParcelas;
		
	}

	public void printParcelas() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		for(int i = 0; i < getNumParcelas(); i ++) {
			Date data = new Date();
			
			if(data.getMonth()+i <= 11) {
				data.setMonth(data.getMonth()+i);
				printParcelas.add("Data da " + (i+1) + "º parcela: " + DateFormat.getDateInstance().format(data) + " - Valor: R$ " + getValorParcelas(i));
			}
			else {
				data.setMonth(data.getMonth()+i-11-1);
				data.setYear(data.getYear()+1);
				printParcelas.add("Data da " + (i+1) + "º parcela: " + DateFormat.getDateInstance().format(data) + " - Valor: R$ " + getValorParcelas(i));
			}
			
			
		}
		
	}
	
	
	public String getPrintParcelas(int i) {
		return printParcelas.get(i);
	}
	
	public int quantidadePrintParcelas() {
		return printParcelas.size();
	}
	
	public void remPrintParcelas(int i) {
		printParcelas.remove(i);
	}
	
	public int getNumParcelas() {
		return numParcelas;
	}
	
	public double getValorParcelas(int i) {
		return valorParcelas[i] ;
	}

	public Contrato getContrato() {
		return this.contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public double getTaxa() {
		return this.taxa;
	}

	public void setTaxa(double taxaPagamento) {
		this.taxa = taxaPagamento;
	}



	
	





	
	


}
