package statics.ex;

public class CurrencyConverter {
	
	public static final double TAX_IOF = 1.06;
	
	public static double finalPrice(double dollar, double amount) {
		return dollar * amount * TAX_IOF;
		
	}
}
