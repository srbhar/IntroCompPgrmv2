package chapter18homework;
import java.util.Scanner;
public class EighteenTwentyThree_BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		String bin = input.next();
		input.close();
		System.out.print("Decimal equivalent: " + bin2Dec(bin));
	}
	
	public static int bin2Dec(String binaryString) {
		
	    if (binaryString.length() == 0) {
	        return 0;
	    }

	    int firstdig = binaryString.charAt(0) - '0';
	    int power = binaryString.length() - 1;

	    return (int)(firstdig * Math.pow(2, power)) + bin2Dec(binaryString.substring(1));
	}

}
