package oointro.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = entrada.nextLine();
		System.out.print("Grades: ");
		student.grade1 = entrada.nextDouble();
		student.grade2 = entrada.nextDouble();
		student.grade3 = entrada.nextDouble();
		
		System.out.println();
		
		System.out.printf("FINAL GRADE = %.2f \n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS \n", student.missingPoints());
		}	
		else
			System.out.println("PASS");
		entrada.close();
	}

}
