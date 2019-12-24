package ExerciciosRelacionamento1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class print {

	public static void main(String[] args) throws ParseException {
		
		
		Worker trabalhador1 = new Worker();
		HourContract contract1 = new HourContract();
		HourContract contract2 = new HourContract();
		Date data = new Date();
		
		
		trabalhador1.setWorker("Isaque", 1500.00, "Vendas",WorkLevel.JUNIOR);
		
		contract1.setHourContract(data, 35.00, 5);
		contract2.setHourContract(data, 25.00, 10);
		trabalhador1.addContracts(contract1);
		trabalhador1.addContracts(contract2);
		
		for(int i = 0; i < trabalhador1.ContractSize(); i ++) {
			System.out.println("Data: " + trabalhador1.getContracts(i).getData());
			System.out.println("Valor por hora: " + trabalhador1.getContracts(i).getValuePerHour());
			System.out.println("Duração: " + trabalhador1.getContracts(i).getHours() + " horas");
			
		}
		
		System.out.println(trabalhador1.income(2019,10));


	}
}
