package ExerciciosRelacionamento1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {
	
	
	
	private String name;
	private Double baseSalary;
	private String departament;
	private ArrayList<HourContract> contracts = new ArrayList<>();;
	private WorkLevel leve;
	
	

	public void setWorker(String name, Double baseSalary, String departament, WorkLevel leve) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.departament = departament;
		this.leve = leve;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public int ContractSize() {
		return contracts.size();
	}
	public HourContract getContracts(int i) {
		return contracts.get(i);
	}

	public void addContracts(HourContract contracts) {
		this.contracts.add(contracts);
	}
	
	public void remContracts(HourContract contracts) {
		this.contracts.remove(contracts);
	}

	public WorkLevel getLeve() {
		return leve;
	}

	public void setLeve(WorkLevel leve) {
		this.leve = leve;
	}
	
	public double  income(int year, int month) {
		Calendar cal = Calendar.getInstance();
		double sumValue = getBaseSalary();
		for(HourContract c : contracts) {
			cal.setTime(c.getData());			
			int ano = cal.get(cal.YEAR);
			int mes = cal.get(cal.MONTH) + 1;
			if(year == ano && month == mes ) {
				sumValue = sumValue + c.getValuePerHour() * c.getHours();
			}	
		}
		return sumValue;
		
		
		
		
		
	}

}
