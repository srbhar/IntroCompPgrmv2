package chapter8homework;

import java.util.Scanner;

public class EightEleven_NineHeadsAndTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        
        // number to binary string
        String binary = Integer.toBinaryString(number);
        
        // leading 0's
        while (binary.length() < 9) {
            binary = "0" + binary;
        }
        
        // loop through each char and print in a grid
        int index = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                char bit = binary.charAt(index);
                if (bit == '0') {
                    System.out.print("H ");
                } else {
                    System.out.print("T ");
                }
                index++;
            }
            System.out.println();
        }
        
        input.close();
    }

	}