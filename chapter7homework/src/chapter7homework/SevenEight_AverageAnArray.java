package chapter7homework;

import java.util.Scanner;

public class SevenEight_AverageAnArray {
		
	    public static int average(int[] array) {
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            int num = array[i];
	            System.out.println(num);
	        }
	        return sum / array.length;
	    }

	    public static double average(double[] array) {
	        double sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            double num = array[i];
	            System.out.println(num);
	        }
	        return sum / array.length;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double[] numbers = new double[10];

	        System.out.println("Enter 10 double values:");
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextDouble();
	        }

	        double avg = average(numbers);
	        System.out.println("The average is: " + avg);
	        
	        input.close();

	}

}
