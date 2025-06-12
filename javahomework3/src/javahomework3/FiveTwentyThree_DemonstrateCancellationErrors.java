package javahomework3;

public class FiveTwentyThree_DemonstrateCancellationErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sumleftright = 0.0;
		
		for (double i = 1; i <= 50000; i++) {
			
			sumleftright += 1/i;
		}
		
		System.out.println("Left to right: " + sumleftright);
		
		double sumrightleft = 0.0;
		
		for (double q = 50000; q>= 1; q--) {
			
			sumrightleft += 1/q;
		}
		
		System.out.print("Right to left: " + sumrightleft);

	}

}
