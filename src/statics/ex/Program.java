package statics.ex;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = entrada.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = entrada.nextDouble();
		
		System.out.println();
		System.out.printf("Amount to be paid in your currency: %.2f", 
		CurrencyConverter.finalPrice(dollar, amount));
		entrada.close();
	}
}
