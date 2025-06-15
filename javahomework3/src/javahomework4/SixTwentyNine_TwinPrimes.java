package javahomework4;

public class SixTwentyNine_TwinPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 1000; i++) {
			if (prime(i)) {
				if (prime(i+2)) {
					System.out.print("(" + i + ", " + (i+2) + ")");
					System.out.println();
				}
			}
		}

	}
	
	public static boolean prime(int i) {
		
	    if (i <= 1) return false;
		
	    for (int j = 2; j <= Math.sqrt(i); j++) {
	        if (i % j == 0) {
	            return false;
	        }
	    }

	    return true;
	}

}
