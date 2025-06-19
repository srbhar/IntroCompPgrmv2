package chapter7homework;

import java.util.Scanner;

public class SevenFive_PrintDistinctNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10]; // to store distinct numbers
        int count = 0;               // how many distinct numbers we've added
        int inputs = 0;              // how many total inputs we've processed

        System.out.println("Enter 10 numbers:");

        while (inputs < 10) {
            int num = input.nextInt();
            inputs++; // increment inputs (want 10)

            boolean isNew = true;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isNew = false;
                    break;
                }
            }

            if (isNew) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();

	}

}
