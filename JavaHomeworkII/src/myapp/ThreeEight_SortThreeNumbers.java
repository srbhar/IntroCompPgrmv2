package myapp;

import java.util.Scanner;

public class ThreeEight_SortThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integers:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Swap a and b if needed
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Swap a and c if needed
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        // Swap b and c if needed
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // Now a <= b <= c
        System.out.println("Numbers in order: " + a + " " + b + " " + c);
        
        input.close();
	}

}
