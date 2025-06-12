package javahomework3;

public class FiveThirtyThree_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10000; i++) {
			
			int hi = 0;
			
			for (int k = 1; k <= i/2; k++) {
				
				if (i % k == 0) {
					
					hi += k;
				}
			}
			
			if (hi == i) {
				
				System.out.print(i + " ");
			}
		}

	}

}
