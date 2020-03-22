package functional.stream.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			List<Employee> employees = new ArrayList<>();
			
			while(line != null) {
				String[] fields = line.split(";");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
			}
			
			List<String> filteredEmployees = employees.stream()
					.filter(emp -> emp.getSalary() > salary)
					.map(emp -> emp.getName() + " - " + emp.getEmail())
					.sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
					.collect(Collectors.toList());
			
			double sum = employees.stream()
					.filter(emp -> emp.getName().charAt(0) == 'M')
					.map(emp -> emp.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println();
			filteredEmployees.forEach(System.out::println);
			System.out.println();
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}