package javahomework4;

public class SixOne_PentagonalNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			int pentnum = getPentagonalNumber(i);
			System.out.print(pentnum + " ");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	public static int getPentagonalNumber(int i) {
		
		int pentnum = i*(3*i-1)/2;
		
		return pentnum;
	}
}