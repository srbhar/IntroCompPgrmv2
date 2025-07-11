package practice;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.*;

public class TwelveOne_NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in); 
		 int count = 0;
		 String [] expression = new String[3];
		 System.out.print("Enter input: ");
		 while (input.hasNext()) {
		 expression[count]= input.next();
		 count++;
		 }

		try {
			if (expression.length != 3) {
				System.out.println("Usage: java Calculator operand1 operator operand2");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Wrong Input: " + e.getMessage());
		}

			// The result of the operation
			int result = 0;

			// Determine the operator
			switch (expression[1].charAt(0)) {
			case '+':
				result = Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]);
				break;
			case '-':
				result = Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]);
				break;
			case '.':
				result = Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]);
				break;
			case '/':
				result = Integer.parseInt(expression[0]) / Integer.parseInt(expression[2]);
			}

			// Display result
			System.out.println(expression[0] + ' ' + expression[1] + ' ' + expression[2] + " = " + result);
		
		input.close();
		
	}

}
