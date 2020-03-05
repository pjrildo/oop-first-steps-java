package interfaces.ex;

public interface PaymentService {
	
	public double interest(double amount, int months);
	public double paymentFee(double amount);

}