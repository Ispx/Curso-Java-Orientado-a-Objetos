package ExercicioHerança2;

public final class ImporteProduct extends Product {
	
	private Double customsFee;

	public ImporteProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return name  + " $ " + totalPrice();
	}
	
	public Double totalPrice() {
		return price + customsFee;
		}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	

}
