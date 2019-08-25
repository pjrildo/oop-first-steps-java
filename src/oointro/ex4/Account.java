package oointro.ex4;

public class Account {
	
	private static final double TAX = 5.0;
	
	private String accHolder;
	private int accNumber;
	private double accBalance;
	
	public Account(String accHolder, int accNumber, double initialDeposit) {
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		accDeposit(initialDeposit);
	}
	public Account(String accHolder, int accNumber) {
		this.accHolder = accHolder;
		this.accNumber = accNumber;
	}
	
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public double getAccBalance() {
		return accBalance;
	}
	
	public void accDeposit(double value) {
		accBalance += value;
	}
	public void accWithdraw(double value) {
		accBalance -= value + TAX;
	}
	
	public String toString() {
		return "Account " + accNumber + ", Holder: " + accHolder + ", Balance: $ " + 
		String.format("%.2f", accBalance);
	}
}
