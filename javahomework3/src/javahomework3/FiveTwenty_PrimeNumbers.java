package javahomework3;

public class FiveTwenty_PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 1000; i++) {
			
			boolean prime = true;
			
			for (int k = 2; k <= i/2; k++) {
				
				if (i % k == 0) {
					
					prime = false;
					
					break;
				}
			}
			
			if (prime) {
				
				System.out.print(i + " ");
			}
		}

	}

}
