package files.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	//reading .csv file content and instantiate a new Product
	public static List<Product> readFile(String fileName) {
		List<Product> products = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line = br.readLine();
			
			while(line != null) {
				String[] elements = line.split(";");
				products.add(new Product(elements[0], Double.parseDouble(elements[1]), Integer.parseInt(elements[2])));
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return products;
	}
	
	//creates a new subdir from source file dir and write the .csv file on it
	public static boolean writeFile(List<Product> products, String filePath) {
		new File(filePath + "\\out").mkdir();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "\\out\\summary.csv"))){
			for(Product p : products) {
				bw.write(p.toString());
				bw.newLine();
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		return true;
	}
}