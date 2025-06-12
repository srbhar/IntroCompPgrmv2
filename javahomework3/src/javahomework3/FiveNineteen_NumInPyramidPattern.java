package javahomework3;

public class FiveNineteen_NumInPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int totrow = 8;

	        for (int row = 1; row <= totrow; row++) {

	            for (int space = totrow - row; space > 0; space--) {
	                System.out.print("    ");
	            }

	            int value = 1;
	            for (int p = 0; p < row; p++) {
	                System.out.printf("%4d", value);
	                value *= 2;
	            }

	            value = value/2;
	            for (int b = 1; b < row; b++) {
	                value /= 2;
	                System.out.printf("%4d", value);
	            }

	            System.out.println();
	        }
	}

}
