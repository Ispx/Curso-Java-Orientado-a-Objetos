package CursoJava;

public class Encapsulamento {
	private static double price = 10.59;
	private static String product = "Bolacha";
	private static int quantity = 7;
	
	// métodos para obter acesso aos atributos por outras classes
	public static double getPrice() {
		return price;
	}
	public static int getQuantity() {
		return quantity;
	}
	public static String getProduct() {
		return product;
	}
	// métodos para alterar valores dos atributos por outras classes
	public static void setPrice(double price) {
		Encapsulamento.price = price;
	}
	
	public static void setQuantity(int quantity) {
		Encapsulamento.quantity = quantity;
	}
	public static void setProduct(String product) {
		Encapsulamento.product = product;
	}
}
