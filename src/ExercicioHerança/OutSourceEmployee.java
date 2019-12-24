package ExercicioHerança;

public final class OutSourceEmployee extends Employee{
	
	private Double AddicionalCharge;
	
	
	public OutSourceEmployee(String name, Integer hours, Double valueHour, Double AddicionalChange) {
		super(name, hours, valueHour);
		this.AddicionalCharge = AddicionalChange;
	}
	
	@Override
	public Double payment() {
		return  valueHour * hours + (AddicionalCharge * 110/100);
	}

	public Double getAddicionalCharge() {
		return AddicionalCharge;
	}

	public void setAddicionalChange(Double AddicionalCharge) {
		this.AddicionalCharge = AddicionalCharge;
	}


}
