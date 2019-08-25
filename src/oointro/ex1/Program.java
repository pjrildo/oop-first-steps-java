package oointro.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter rectangle width and height: ");
		rectangle.width = entrada.nextDouble();
		rectangle.height = entrada.nextDouble();
		
		System.out.printf("AREA: %.2f \nPERIMETER: %.2f \nDIAGONAL: %.2f", 
		rectangle.area(), rectangle.perimeter(), rectangle.diagonal());
		entrada.close();
	}

}
