package javahomework4;

import java.util.Scanner;

public class SixSeventeen_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
		
		input.close();

	}
	
	public static void printMatrix(int n) {
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				int lol = (int)(Math.random()*2);
				System.out.print(lol + " ");
			}
			
			System.out.println();
		}
		
	}

}
