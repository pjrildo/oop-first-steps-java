package oointro.ex4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int id = entrada.nextInt();
		System.out.print("Enter account holder: ");
		
		entrada.nextLine();
		
		String name = entrada.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = entrada.next().charAt(0);
		
		while(option != 'y' && option != 'n') {
			System.out.print("Invalid option! Try again (y/n): ");
			option = entrada.next().charAt(0);
		}
		
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = entrada.nextDouble();
			acc = new Account(name, id, value);
		}else
			acc = new Account(name, id);
			
		System.out.println("\nAccount data: ");
		System.out.println(acc);
		
		System.out.print("\nEnter a deposit value: ");
		double dValue = entrada.nextDouble();
		acc.accDeposit(dValue);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.print("\nEnter a withdraw value: ");
		double wValue = entrada.nextDouble();
		acc.accWithdraw(wValue);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		entrada.close();
	}

}