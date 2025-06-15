package javahomework4;

public class SixTwentySix_PalindromicPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 2;
		
		int palprime = 0;
		
		while (palprime < 100) {
			
			if (prime(number) && pal(number)) {
				
				System.out.print(number + " ");
				palprime++;
				
				if (palprime % 10 == 0) {
					
					System.out.println();
				}
			}
			
			number++;
		}

	}
	
	public static boolean prime(int number) {
		
	    if (number <= 1) return false;
		
	    for (int i = 2; i <= Math.sqrt(number); i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}
	
	public static boolean pal(int number) {
		
		boolean pal = false;
		
		String hi = Integer.toString(number);
		
		String reversed = "";
		
		for (int i = hi.length()-1; i >= 0; i--) {
			
			reversed += hi.charAt(i);
		}
		
		if (number == Integer.parseInt(reversed)) {
			pal = true;
		} else {
			pal = false;
		}
		
		return pal;
	}

}
