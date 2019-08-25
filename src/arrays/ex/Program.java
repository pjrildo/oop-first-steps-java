package arrays.ex;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Student vect[] = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = entrada.nextInt();
		
		for(int i = 0; i < n; i++) {
			entrada.nextLine();
			System.out.printf("\nRent #%d:", i+1);
			System.out.print("\nName: ");
			String name = entrada.nextLine();
			System.out.print("Email: ");
			String email = entrada.nextLine();
			System.out.print("Room (0 to 9): ");
			int room = entrada.nextInt();
			
			vect[room] = new Student(name, email);
		}
		
		System.out.println("\nBusy rooms: ");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.printf("%d: %s, %s \n", i, vect[i].getName(), vect[i].getEmail());
			}
			
		}
		entrada.close();
	}
}


