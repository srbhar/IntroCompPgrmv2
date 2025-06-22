package chapter8homework;

import java.util.Scanner;

public class EightOne_SumElementsColumnByColumn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        for (int col = 0; col < 4; col++) {
            double columnSum = sumColumn(matrix, col);
            System.out.println("Sum of the elements at column " + col + " is " + columnSum);
        }

        input.close();
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }

}
