package interfaces.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract (number, date, totalValue);
		
		System.out.print("Enter the number of installments: ");
		int n = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, n);
		
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}