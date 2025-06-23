package chapter8homework;

import java.util.Scanner;

public class EightThirtySix_LatinSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = input.nextInt();
        input.nextLine();

        char[][] square = new char[n][n]; // new array of characters
        System.out.println("Enter " + n + " rows of letters (space-separated):");

        for (int i = 0; i < n; i++) {
            String[] row = input.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                square[i][j] = row[j].charAt(0);
            }
        }

        if (isLatinSquare(square, n)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("The input array is not a Latin square");
        }

        input.close();
    }

    public static boolean isLatinSquare(char[][] square, int n) {
 
        char[] valid = new char[n];
        for (int i = 0; i < n; i++) {
            valid[i] = (char) ('A' + i);
        }

        for (int row = 0; row < n; row++) {
            boolean[] seen = new boolean[n];

            for (int col = 0; col < n; col++) {
                char current = square[row][col];

                int index = current - 'A';

                if (index < 0 || index >= n) {
                    return false;
                }
                if (seen[index]) {
                    return false;
                }
                seen[index] = true;
            }
        }

        for (int col = 0; col < n; col++) {

            boolean[] seen = new boolean[n];

            for (int row = 0; row < n; row++) {
                char current = square[row][col];

                int index = current - 'A';

                if (index < 0 || index >= n) {
                    return false;
                }

                if (seen[index]) {
                    return false;
                }

                seen[index] = true;
            }
        }
        return true;
}
}
