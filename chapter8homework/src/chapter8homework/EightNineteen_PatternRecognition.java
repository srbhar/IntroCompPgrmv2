package chapter8homework;

import java.util.Scanner;

public class EightNineteen_PatternRecognition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        // fill array
        int[][] values = new int[rows][cols];
        System.out.println("Enter the values row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                values[i][j] = input.nextInt();
            }
        }

        boolean result = isConsecutiveFour(values);
        System.out.println(result);

        input.close();
    }

    public static boolean isConsecutiveFour(int[][] values) {
        int rows = values.length;
        int cols = values[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int current = values[i][j];

                // horizontal
                if (j + 3 < cols &&
                    current == values[i][j + 1] &&
                    current == values[i][j + 2] &&
                    current == values[i][j + 3]) {
                    return true;
                }

                // vertical
                if (i + 3 < rows &&
                    current == values[i + 1][j] &&
                    current == values[i + 2][j] &&
                    current == values[i + 3][j]) {
                    return true;
                }

                // diagonal major
                if (i + 3 < rows && j + 3 < cols &&
                    current == values[i + 1][j + 1] &&
                    current == values[i + 2][j + 2] &&
                    current == values[i + 3][j + 3]) {
                    return true;
                }

                // diagonal minor
                if (i - 3 >= 0 && j + 3 < cols &&
                    current == values[i - 1][j + 1] &&
                    current == values[i - 2][j + 2] &&
                    current == values[i - 3][j + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

}
