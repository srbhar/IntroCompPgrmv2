package chapter7homework;

import java.util.Scanner;

public class SevenTwentyOne_BeanMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter the number of balls: ");
        int numBalls = input.nextInt();

        System.out.print("Enter the number of slots: ");
        int numSlots = input.nextInt();

        // slot counter
        int[] slots = new int[numSlots];

        // path of each ball
        for (int i = 0; i < numBalls; i++) {
            int rightCount = 0;
            StringBuilder path = new StringBuilder();

            for (int j = 0; j < numSlots - 1; j++) {
                if (Math.random() < 0.5) {
                    path.append("L");
                } else {
                    path.append("R");
                    rightCount++;
                }
            }

            // path
            System.out.println(path);

            // drop ball
            slots[rightCount]++;
        }

        // vertical histogram
        int maxHeight = 0;
        for (int count : slots) {
            if (count > maxHeight) {
                maxHeight = count;
            }
        }

        System.out.println("\nResult:");
        for (int row = maxHeight; row > 0; row--) {
            for (int col = 0; col < numSlots; col++) {
                if (slots[col] >= row) {
                    System.out.print("O ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // slot labels
        for (int i = 0; i < numSlots; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 0; i < numSlots; i++) {
            System.out.print(i + " ");
        }
        
        input.close();

	}

}
