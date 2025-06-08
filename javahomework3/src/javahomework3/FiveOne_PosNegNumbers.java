package javahomework3;

import java.util.Scanner;

public class FiveOne_PosNegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner input = new Scanner(System.in);

	        int total = 0;
	        int positiveCount = 0;
	        int negativeCount = 0;
	        int numberCount = 0;

	        while (true) {
	            System.out.print("Enter an integer (0 to stop): ");
	            int number = input.nextInt();

	            if (number == 0) {
	                break;
	            }

	            total += number;
	            numberCount++;

	            if (number > 0) {
	                positiveCount++;
	            } else {
	                negativeCount++;
	            }
	        }

	        if (numberCount > 0) {
	            double average = (double) total / numberCount;

	            System.out.println("Number of positive numbers: " + positiveCount);
	            System.out.println("Number of negative numbers: " + negativeCount);
	            System.out.println("Total: " + total);
	            System.out.printf("Average: %.2f\n", average);
	        } else {
	            System.out.println("No numbers were entered except 0.");
	        }
	        
	        input.close();

	}

}
