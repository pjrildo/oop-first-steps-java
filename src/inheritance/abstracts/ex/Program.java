package inheritance.abstracts.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("\nTax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
				
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		
		double sum = 0.0;
		
		for(TaxPayer t : list) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
			sum += t.tax();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
			
		
		sc.close();
	}
}