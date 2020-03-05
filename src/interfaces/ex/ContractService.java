package interfaces.ex;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
	
	private PaymentService paymentService;
	
	public ContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double amount = contract.getTotalValue() / months;
		Calendar cal = Calendar.getInstance();
		
		for(int i = 1; i <= months; i++) {
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Date dueDate = cal.getTime();
			
			double finalValue = paymentService.interest(amount, i);
			finalValue = paymentService.paymentFee(finalValue);
			
			contract.addInstallment(new Installment(dueDate, finalValue));
		}
	}
}