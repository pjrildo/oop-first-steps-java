package inheritance.abstracts.ex;

public final class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Individual() {
		super();
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public final double tax() {
		
		double finalTax = 0.0;
		
		if(getAnualIncome() >= 20000.00)
			finalTax += getAnualIncome() * 0.25;
		else
			finalTax += getAnualIncome() * 0.15;
		
		if(healthExpenditures > 0.0)
			finalTax -= healthExpenditures * 0.5;
		
		return finalTax;
	}

}