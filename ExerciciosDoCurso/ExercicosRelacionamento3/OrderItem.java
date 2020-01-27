package ExercicosRelacionamento3;

public class OrderItem {

	private int quantity;
	private Product product; // Tem UM
	
	public double subTotal() {
		return product.getPrice() * this.quantity;
	}
	
	public void addProduct(Product product) {
		this.product = product;
	}
	public Product getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return product.getPrice();
	}

	

	
	
	
}
