package oointro.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = entrada.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = entrada.nextDouble();
		System.out.print("Tax: ");
		employee.tax = entrada.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f", employee.name, employee.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary ? ");
		double percentage = entrada.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.netSalary());
		entrada.close();
	}

}
