package inheritance.ex1;

public final class OutsourcedEmployee extends Employee  {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee(String name, Integer hours, 
		Double valuePerHour, Double additionalCharge) {
		
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public OutsourcedEmployee() {
		super();
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final double payment() {
		return super.payment() + additionalCharge * 1.1;
		
	}
	
}
