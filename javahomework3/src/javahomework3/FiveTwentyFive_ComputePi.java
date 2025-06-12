package javahomework3;

public class FiveTwentyFive_ComputePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 10000; i <= 100000; i+= 10000) {
			
			double pi = 0;
			
			for (int k = 1; k <= i; k++) {
				
				pi += Math.pow(-1, k+1)/(2*k-1);
			}
			
			pi *= 4;
			
			System.out.print(pi + " ");
		}

	}

}
