package practice;
	
	public class NumberAnalyzer {

	    public static void main(String[] args) {
	        // Sample input data
	        int[] data = {3, 8, 13, 21, 34, 55};

	        // Step 1: Process each number
	        processNumbers(data);

	        // Step 2: Print final summary
	        summarizeResults(data);
	    }

	    // Step 1: Analyze each number and print result
	    public static void processNumbers(int[] nums) {
	        for (int num : nums) {
	        	if (num % 2 == 0) {
	        		System.out.println(num + " is even.");
	        	}
	        	else if (isPrime(num)) {
	        		System.out.println(num + " is odd and prime.");
	        	}
	        	else {
	        		System.out.println(num + " is odd and not prime.");
	        	}
	        }
	    }

	    // Returns true if a number is even
	    public static boolean isEven(int n) {
	        if (n % 2 == 0) {
	        	return true;
	        }
	        return false;
	    }

	    // Returns true if a number is prime
	    public static boolean isPrime(int n) {
	    	int i = 2;
	    	boolean prime = true;
	    	while (i <= n/2) {
	    		if (n % i == 0) {
	    			prime = false;
	    			break;
	    		}
	    		i++;
	    	}
	        // A number is prime if it has no divisors other than 1 and itself
	        return prime;
	    }

	    // Step 2: Print a summary of even and prime numbers
	    public static void summarizeResults(int[] nums) {
	        int evenCount = 0;
	        int primeCount = 0;

	        for (int i = 0; i < nums.length; i++) {
	        	if (isEven(nums[i])) {
	        		evenCount++;
	        	}
	        	else if (isPrime(nums[i])){
	        		primeCount++;
	        	}
	        }

	        System.out.println("\nSummary:");
	        System.out.println("Total even numbers: " + evenCount);
	        System.out.println("Total prime numbers: " + primeCount);
	    }
	}
