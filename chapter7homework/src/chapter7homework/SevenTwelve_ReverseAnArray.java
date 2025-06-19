package chapter7homework;

import java.util.Scanner;

public class SevenTwelve_ReverseAnArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; // new array of length 10

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble(); // adding numbers to array
        }

        reverse(numbers); // reverses the array directly

        System.out.println("Reversed numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        input.close();
    }
    
    public static void reverse(double[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // swap array[start] and array[end]
            double temp = array[start];
            array[start] = array[end];
            array[end] = temp; // switching numbers until reached middle

            start++;
            end--;
        }
    }

}
