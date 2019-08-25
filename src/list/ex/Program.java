package list.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("How many employees will be registered? ");
		short employees = entrada.nextShort();
		
		for(int i = 1; i <= employees; i++) {
			System.out.println("\nEmployee #" + i + ":");
			System.out.print("ID: ");
			short id = entrada.nextShort();
			System.out.print("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.print("Salary: ");
			double salary = entrada.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee ID that will have salary increase: ");
		short id = entrada.nextShort();
		
		//predicate filter
		
		/*Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);*/
		
		Double percentage = null;
		
		for(Employee x : list) {
			if(x.getId() == id) {
				System.out.print("Enter the percentage: ");
				percentage = entrada.nextDouble();
				x.increaseSalary(percentage);
				break;
			}
		}
		
		if(percentage == null)
			System.out.println("This ID does not exist!");
		
		System.out.println("\nList of employees: ");
		
		for(Employee x : list)
			System.out.println(x);
		
		
		entrada.close();

	}
}


