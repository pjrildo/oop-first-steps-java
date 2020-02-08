package files.ex;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> products;
		
		System.out.print("Enter the source file path: ");
		String filePath = sc.nextLine();
		
		File path = new File(filePath);
		File[] files = path.listFiles(File::isFile);
		
		System.out.println();
		System.out.println("FILES ON THIS PATH:");
		for(File file : files) {
			System.out.println(file.getName());
		}
		
		System.out.println();
		System.out.print("Enter the name of source file: ");
		String fileName = filePath + sc.nextLine();
		
		products = FileUtil.readFile(fileName);
		boolean success = FileUtil.writeFile(products, filePath);
		
		if(success) {
			System.out.println("Output file successfully created.");
		}
		
		sc.close();
	}
}