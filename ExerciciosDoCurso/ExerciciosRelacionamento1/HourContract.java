package ExerciciosRelacionamento1;

import java.util.ArrayList;
import java.util.Date;

public class HourContract {
	private Date data;
	private double valuePerHour;
	private int hours;
	

	public void setHourContract(Date data, double valuePerHour, int hours) {
		this.data = data;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}		
	
	
	
	
	
	
	
	
	
	
}
