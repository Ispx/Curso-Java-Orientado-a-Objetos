package ExercicioHerança2;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
	
	private Date manufactureDate;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return  name + " (used) $ " + price + " (Manufacture date: " + sdf.format(manufactureDate) +")";
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	
	
	
}
