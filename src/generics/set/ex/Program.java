package generics.set.ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Number: ");
			courseA.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Number: ");
			courseB.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Number: ");
			courseC.add(sc.nextInt());
		}
		
		System.out.print("Total students: " + totalStudents(courseA, courseB, courseC));
		
		sc.close();
	}
	
	public static int totalStudents(Set<Integer> a, Set<Integer> b, Set<Integer> c) {
		if(a.isEmpty() || b.isEmpty() || c.isEmpty()){
			throw new IllegalArgumentException("Course can't be empty!");
		}
		Set<Integer> total = new HashSet<>(a);
		
		total.addAll(b);
		total.addAll(c);
		
		return total.size();
	}
}