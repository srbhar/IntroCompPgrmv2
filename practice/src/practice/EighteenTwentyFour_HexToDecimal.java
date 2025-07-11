package practice;
import java.util.Scanner;

public class EighteenTwentyFour_HexToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.next();
		System.out.print("Decimal integer: " + hex2Dec(hex));
		input.close();
	}
	
	public static int hex2Dec(String hexString) {

		if (hexString.length() == 0) {
			return 0;
		}
		int num;
		switch (hexString.charAt(0)) {
		case 'A':
			num = 10;
			break;
		case 'B':
			num = 11;
			break;
		case 'C':
			num = 12;
			break;
		case 'D':
			num = 13;
			break;
		case 'E':
			num = 14;
			break;
		case 'F':
			num = 15;
			break;
		case 'a':
			num = 10;
			break;
		case 'b':
			num = 11;
			break;
		case 'c':
			num = 12;
			break;
		case 'd':
			num = 13;
			break;
		case 'e':
			num = 14;
			break;
		case 'f':
			num = 15;
			break;
		default:
			num = hexString.charAt(0) - '0';
		}
		
		return (int) Math.pow(16, hexString.length()-1) * num + hex2Dec(hexString);
	}

}
