package files.ex;

import java.util.Locale;

public class Product {
	
	private String name;
	private Double price;
	private Integer qt;
	
	public Product(String name, Double price, Integer qt){
		this.name = name;
		this.price = price;
		this.qt = qt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQt() {
		return qt;
	}

	public void setQt(Integer qt) {
		this.qt = qt;
	}
	
	public double subTotal() {
		return price * qt;
	}
	
	@Override
	public String toString() {
		Locale.setDefault(Locale.US);
		return name
				+ ";"
				+ String.format("%.2f", subTotal());
	}
}