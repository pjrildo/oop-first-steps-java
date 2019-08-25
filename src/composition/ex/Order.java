package composition.ex;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	
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

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItens() {
		return itens;
	}
	
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	public double total() {
		
		double sum = 0.0;
		
		for(OrderItem o : itens) 
			sum += o.subTotal();
		
		return sum;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(status + "\n");
		sb.append(client + "\n");
		sb.append("Order items: " + "\n");
		
		for(OrderItem o : itens) {
			sb.append(o + "\n");
		}
		
		sb.append("Total price: $"); 
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
		
	}
	
}
