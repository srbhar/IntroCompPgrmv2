package chapter8homework;

import java.util.Scanner;

public class EightTwo_SumMajorDiagonal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }
            double majordiagonal = sumMajorDiagonal(matrix);
            System.out.println("Sum of the elements in the major diagonal is " + majordiagonal);

        input.close();
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += m[i][i];
        }
        return sum;
    }

}
