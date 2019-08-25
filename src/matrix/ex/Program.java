package matrix.ex;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matrix M lines: ");
		int m = input.nextInt();
		System.out.print("Matrix N columns: ");
		int n = input.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("Input for M = %d and N = %d: ", i, j);
				mat[i][j] = input.nextInt();
			}
		}
		
		System.out.print("\nChoose a matrix element: ");
		int chosen = input.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == chosen) {
					System.out.print("\nPosition " + i + "," + j + ":");
					if(j - 1 >= 0) {
						System.out.print("\nLeft: " + mat[i][j - 1]);
					}
					if(j + 1 < mat[i].length) {
						System.out.print("\nRight: " + mat[i][j + 1]);
					}
					if(i + 1 < mat.length) {
						System.out.print("\nDown: " + mat[i + 1][j]);
					}	
					if(i - 1 >= 0) {
						System.out.print("\nUp: " + mat[i - 1][j]);
					}	
				}
			}
		}

		input.close();

	}
}
