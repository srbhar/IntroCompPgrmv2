package chapter7homework;

public class SevenSeven_CountSingleDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] counts = new int[10]; // new index from 0 to 9

	        for (int i = 0; i < 100; i++) {
	            int num = (int)(Math.random() * 10); // generate random number from 0 to 9
	            counts[num]++; // add to that number's count
	        }

	        // Print the counts
	        for (int i = 0; i < counts.length; i++) {
	            System.out.println("Digit " + i + " occurs " + counts[i] + " times.");
	        }

	}

}
