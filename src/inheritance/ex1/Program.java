package inheritance.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\nEmployee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, 
				valuePerHour, additionalCharge));
				
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				
				list.add(emp);
			}	
		}
		
		System.out.println("\nPAYMENTS: ");
		
		for(Employee emp : list)
			System.out.println(emp.getName() 
			+ " - $ " 
			+ String.format("%.2f", emp.payment()));
		
		sc.close();
		
	}
}