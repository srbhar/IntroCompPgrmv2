package chapter7homework;

import java.util.Scanner;

public class SevenNine_SmallestElement {
		
		public static double min(double[] array) {
	        double minVal = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < minVal) {
	                minVal = array[i];
	            }
	        }
	        return minVal;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double[] numbers = new double[10];

	        System.out.println("Enter 10 numbers:");
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextDouble();
	        }

	        double minValue = min(numbers);
	        System.out.println("The minimum value is: " + minValue);
	        
	        input.close();
	}

}
