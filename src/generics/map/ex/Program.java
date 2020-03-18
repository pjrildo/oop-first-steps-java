package generics.map.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votes = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String key = fields[0];
				Integer value = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(key)) {
					votes.put(key, value + votes.get(key));
				}
				else {
					votes.put(key, value);
				}
				
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for(String key : votes.keySet()) {
			System.out.println(key + ": " + votes.get(key));
		}
		
		sc.close();
	}
}