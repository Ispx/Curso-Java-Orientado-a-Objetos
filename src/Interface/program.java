package Interface;

import java.util.Date;

public class program {

	public static void main(String[] args) {
		Date data = new Date();
		
		Contrato contrato01 = new Contrato(50888,data,600.00);
		
		GerarParcelas PayPal;
		
		
		PayPal = new GerarParcelas(contrato01,1.0,2.0);
		PayPal.setParcelas(3);
		PayPal.printParcelas();
		
		System.out.println("-------------------------------------- DADOS DO CONTRATO --------------------------------------");
		System.out.println("Número do contrato: " + PayPal.getContrato().getNumero());
		System.out.println("Data: " + PayPal.getContrato().getData());
		System.out.println("Valor contrato: " + contrato01.getValor());
		System.out.println("Número de parcelas: " + PayPal.getNumParcelas());
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		for(int i = 0; i < PayPal.quantidadePrintParcelas(); i ++) {
			System.out.println(PayPal.getPrintParcelas(i));
			System.out.println("--------------------------------------------------------------------------------");
			
		}



		
	}
}
