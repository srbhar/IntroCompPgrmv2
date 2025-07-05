package chapter11homework;

import java.util.ArrayList;

public class ElevenNine_LargestRowsAndColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print random matrix of 1's and 0's
		
		int n = 4;
		
		int [][] array = new int[n][n];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				array[row][col] = (int)(Math.random()*2);
			}
		}
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(array[row][col]);
			}
			System.out.println();
		}
		
		// array counting all numbers in the rows and columns of the matrix
		
		int [] rowcount = new int[n];
		int [] colcount = new int[n];
		
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (array[row][col] == 1) {
					rowcount[row]++;
					colcount[col]++; // increment total number every time we see a one
				}
			}
		}
		
		int maxrowvalue = 0; // finding greatest value out of all rows
		for (int count : rowcount) {
			if (count > maxrowvalue) { // for each value in the "rowcount" 1D array, 
				// if it's greater than the current max value, it becomes the max value
				maxrowvalue = count;
			}
		}
		
		int maxcolvalue = 0; // finding greatest value out of all columns
		for (int count : colcount) {
			if (count > maxcolvalue) {
				maxcolvalue = count; // for each value in the "colcount" 1D array, 
				// if it's greater than the current max value, it becomes the max value
			}
		}
		
		// find which rows and columns have the max value
		// create array list which stores the columns and rows with the max value
		
		ArrayList<Integer> maxrows = new ArrayList<>();	
		for (int i = 0; i < n; i++) {
			if (rowcount[i] == maxrowvalue) {
				maxrows.add(i);
			}
		}
		
		ArrayList<Integer> maxcols = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (colcount[i] == maxcolvalue) {
				maxcols.add(i);
			}
		}
		
		System.out.println("The largest row index: " + maxrows);
		System.out.println("The largest column index: " + maxcols);

	}

}
