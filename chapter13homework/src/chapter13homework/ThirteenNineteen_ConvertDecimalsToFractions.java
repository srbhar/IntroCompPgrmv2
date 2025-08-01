package chapter13homework;
import java.util.Scanner;
public class ThirteenNineteen_ConvertDecimalsToFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		String number = input.next();
		String[] parts = number.split("\\.");
		String intpart = parts[0];
		String decpart = parts.length>1 ? parts[1] : "0";
		
		String together = intpart + decpart;
		int numerator = Integer.parseInt(together);
		
		int[] togetherreduced = new int[2];
		togetherreduced = reduce(numerator, decpart);
		
		System.out.print(togetherreduced[0] + "/" + togetherreduced[1]);
		
	}
	
	public static int[] reduce(int together, String decpart) {
	    int denominator = (int) Math.pow(10, decpart.length());
	    int numerator = together;
	    
	    int gcd = gcd(numerator, denominator);
	    
	    int[] reduced = new int[2];
	    
	    reduced[0] = numerator/gcd;
	    reduced[1] = denominator/gcd;
	    
	    return reduced;
	}
	
	public static int gcd(int a, int b) {
	    if (b == 0)
	        return a;
	    return gcd(b, a % b);
	}

}
