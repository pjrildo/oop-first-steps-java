package inheritance.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
	
	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public UsedProduct() {
		super();
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
		+ " (used) $ "
		+ String.format("%.2f", getPrice())
		+ " (Manufacture date: "
		+ sdf.format(manufactureDate)
		+ ")";
	}

}