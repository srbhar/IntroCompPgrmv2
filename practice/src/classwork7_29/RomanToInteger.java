package classwork7_29;
import java.util.Scanner;
public class RomanToInteger {
	
    public static final int I = 1;
    public static final int V = 5;
    public static final int X = 10;
    public static final int L = 50;
    public static final int C = 100;
    public static final int D = 500;
    public static final int M = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a roman number: ");
		String num = input.next();
		input.close();
		System.out.print("Number: " + romanToInt(num));
	}
	
	public static int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				if ( i < s.length()-1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
					sum += 0;
				}
				else { sum += I; }
				break;
			case 'V':
				if (i > 0 && s.charAt(i-1) == 'I') {
					sum += V-I;
				}
				else { sum += V; }
				break;
			case 'X':
				if ( i < s.length()-1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
					sum += 0;
				}
				else if (i > 0 && s.charAt(i-1) == 'I') {
					sum += X-I;
				}
				else { sum += X; }
				break;
			case 'L':
				if (i > 0 && s.charAt(i-1) == 'X') {
					sum += L-X;
				}
				else { sum += L; }
				break;
			case 'C':
				if ( i < s.length()-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
					sum += 0;
				}
				else if (i > 0 && s.charAt(i-1) == 'X') {
					sum += C-X;
				}
				else { sum += C; }
				break;
			case 'D':
				if (i > 0 && s.charAt(i-1) == 'C') {
					sum += D-C;
				}
				else { sum += D; }
				break;
			case 'M':
				if (i > 0 && s.charAt(i-1) == 'C') {
					sum += M-C;
				}
				else { sum += M; }
				break;
			}
		}
		return sum;
	}

}
