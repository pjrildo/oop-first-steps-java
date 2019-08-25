package composition.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(input.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(input.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			input.nextLine();
			System.out.println("\nEnter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = input.nextLine();
			System.out.print("Product price: ");
			double productPrice = input.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = input.nextInt();
			
			OrderItem item = new OrderItem(quantity, productPrice, product);
			order.addItem(item);
			
		}
		
		System.out.println("\nORDER SUMMARY: ");
		System.out.println(order);
		
		
		input.close();
	}

}
