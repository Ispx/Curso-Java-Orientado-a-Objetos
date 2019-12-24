package ExercicosRelacionamento3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class printOrder {

	public static void main(String[] args) throws ParseException {
		
		Product product = new Product();
		Product product2 = new Product();
		OrderItem orderItem = new OrderItem();
		OrderItem orderItem2 = new OrderItem();
		Order order = new Order();
		Client client = new Client();
		OrderStatus os = OrderStatus.PROCESSING;

		product.setItem("Pilha");
		product.setPrice(15.00);
		orderItem.setQuantity(10);
		orderItem.addProduct(product);
		
		product2.setItem("Caixa");
		product2.setPrice(15.00);
		orderItem2.setQuantity(10);
		orderItem2.addProduct(product2);
		System.out.println("Sub Total Pilha: " + orderItem.subTotal());
		System.out.println("Sub Total Caixa: " + orderItem2.subTotal());

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date data = new Date();
		String data2 = "07/03/1998";
		data = sdf.parse(data2);
		
		client.Client("Isaque","isaquespx98@gmail.com",data);
		
		data = new Date();
		order.Order(data, os,client);
		order.addItem(orderItem);
		order.addItem(orderItem2);
		System.out.println("Total: "  + order.total());
		
		
	}

}
