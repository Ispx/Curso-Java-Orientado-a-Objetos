package ExercicosRelacionamento3;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	private Date moment = new Date();
	private OrderStatus status; // TEM UM
	private Client client; // TEM UM 
	private ArrayList<OrderItem> orderItem; // TEM MUITOS
	
	public Double total() {
		double total = 0;
		for(OrderItem i : orderItem) {
			total += i.subTotal();
		}
		return total;
	}
	
	public Order() {
		orderItem = new ArrayList<>();
	}
	
	public void Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	public void addItem(OrderItem orderItem) {
		this.orderItem.add(orderItem);
	}
	
	public void remItem(OrderItem orderItem) {
		this.orderItem.remove(orderItem);
	}
	
	public int quantity() {
		return orderItem.size();
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
