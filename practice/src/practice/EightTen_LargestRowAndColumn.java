package practice;

public class EightTen_LargestRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = new int[4][4];
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				matrix[row][col] = (int)(Math.random()*2);
			}
		}
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
		
		int greatest = 0;
		int rowindex = 0;
		int sum = 0;
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				sum = 0;
				sum += matrix[row][col];
			}
			if (sum > greatest) {
				greatest = sum;
				rowindex = row;
			}
		}
		
		System.out.println("The largest row index is: " + rowindex);
		
		int great = 0;
		int colindex = 0;
		int sums = 0;
		
		for (int col = 0; col < 4; col++) {
			for (int row = 0; row < 4; row++) {
				sums = 0;
				sums += matrix[row][col];
			}
			if (sums > great) {
				great = sums;
				colindex = col;
			}
		}
		
		System.out.println("The largest column index is: " + colindex);

	}

}
