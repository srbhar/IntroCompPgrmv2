package chapter8homework;

import java.util.Scanner;

public class EightThirteen_LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int cols = input.nextInt();

		double[][] elements = new double[rows][cols];

		System.out.println("Enter the array:");

		// fill the array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				elements[i][j] = input.nextDouble();
			}
		}

		int[] location = locateLargest(elements);
		System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");

		input.close();
	}

	public static int[] locateLargest(double[][] elements) {
		int[] position = new int[2]; // position[0] = row, position[1] = col
		double max = elements[0][0];

		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				if (elements[i][j] > max) {
					max = elements[i][j];
					position[0] = i;
					position[1] = j;
				}
			}
		}

		return position;
	}
}
