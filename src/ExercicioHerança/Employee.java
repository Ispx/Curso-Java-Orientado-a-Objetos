package ExercicioHerança;

import java.util.ArrayList;

public class Employee {
	
	private ArrayList<Employee> funcionario = new ArrayList<>();
	
	private String name;
	protected Integer hours;
	protected Double valueHour;
	
	public void addFuncionario(Employee employee) {
		funcionario.add(employee);
	}
	public void remFuncionario(Employee employee) {
		funcionario.remove(employee);
	}
	public int quantity() {
		return funcionario.size();
	}
	public Employee getFuncionario(int i) {
		return funcionario.get(i);
	}
	
	public Employee(String name, Integer hours, Double valueHour) {
		this.name = name;
		this.hours = hours;
		this.valueHour = valueHour;
	}
	
	public Double payment() {
		return  hours * valueHour;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValueHour() {
		return valueHour;
	}
	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}

	

}
