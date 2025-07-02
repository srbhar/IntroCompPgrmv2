package practice;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter matrix1: ");
		for (int rows = 0; rows < 3; rows++) {
			for (int cols = 0; cols < 3; cols++) {
				matrix1[rows][cols] = input.nextDouble();
			}
		}
		System.out.print("Enter matrix2: ");
		for (int rows = 0; rows < 3; rows++) {
			for (int cols = 0; cols < 3; cols++) {
				matrix2[rows][cols] = input.nextDouble();
			}
		}
		
		double[][] addedmatrix = addMatrix(matrix1, matrix2);
		
		System.out.println("The matrices are printed as follows:");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("+");
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("=");
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(addedmatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
	
	public static double[][] addMatrix(double[][]a, double[][]b) {
		
		double[][] addedmatrix = new double[3][3];
		
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				addedmatrix[row][col] = a[row][col] + b[row][col];
			}
		}
		
		return addedmatrix;
	}

}
