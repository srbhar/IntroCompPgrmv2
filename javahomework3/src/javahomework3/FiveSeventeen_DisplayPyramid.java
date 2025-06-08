package javahomework3;

import java.util.Scanner;

public class FiveSeventeen_DisplayPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= -i+15; j++) {
				
				System.out.print(" ");
				System.out.print(" ");
			}
			
			for (int k = i; k>1; k--) {
				
				System.out.print(k);
				System.out.print(" ");
			}
			
			System.out.print("1");
			System.out.print(" ");
			
			for (int p = 2; p <= i; p++) {
				
				System.out.print(p);
				System.out.print(" ");
			}
			
			for (int m = 1; m <= -i+15; m++) {
				
				System.out.print(" ");
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
		
		input.close();

	}

}
