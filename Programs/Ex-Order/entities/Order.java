package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.emums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;

	private List<OrderItem> orderItems = new ArrayList<>();
	
	SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public String getMoment() {
		return f.format(moment);
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

	public void addOderItems(OrderItem orderItem) {
		orderItems.add(orderItem);
	}

	public void removeOrderItems(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
			
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double total() {
		
		double sum = 0.0;
		
		for(OrderItem i : orderItems) {
			
			sum += i.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (OrderItem i : orderItems) {
			
		sb.append(" " + i.getProduct().getName() + ", $ ");
		sb.append(i.getProduct().getPrice() + ", Quantity: ");
		sb.append(i.getQuantity() + ", Subtotal: $ ");
		sb.append(String.format("%.2f",i.subTotal()));
		sb.append("\n");			
		}
			
		return sb.toString();
	}
}
