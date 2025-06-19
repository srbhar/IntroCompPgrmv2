package chapter7homework;

import java.util.Scanner;

public class SevenFifteen_EliminateDuplicates {

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = list[i];
                count++;
            }
        }

        // only distinct numbers array
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] uniqueNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
        
        input.close();
    }
}
