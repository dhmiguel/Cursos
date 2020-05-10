package enititiesEnumComposicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enititiesEnumComposicao.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrdemItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrdemItem item) {
		items.add(item);
	}
	
	public void removeItem(OrdemItem item) {
		items.remove(item);
	}

	public List<OrdemItem> getItems() {
		return items;
	}
	
	public Double total() {
		double sum = 0;
		for(OrdemItem i : items) {
			sum += i.subTtotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Summary: \n");
		sb.append("Order moment: " + sdf1.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " " + client.getBirthDate() + " " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		
		for (OrdemItem i : items) {
			sb.append(i.getProduct().getName() + ", " + "$" + i.getProduct().getPrice() + ", " + "Quantity: " + i.getQuantity() + ", " + "Subtotal: $" + i.subTtotal() + "\n");
		
			sb.append("Total Price: $" + this.total());
		}
		
		return sb.toString();
		
	}
	
}
