package javahomework3;

public class FiveFourtyThree_MathCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		  for (int i = 1; i <= 7; i++) {
	            for (int j = i + 1; j <= 7; j++) {
	                System.out.println(i + " " + j);
	                count++;
	            }
	        }

	        System.out.println("Total number of combinations: " + count);

	}

}
