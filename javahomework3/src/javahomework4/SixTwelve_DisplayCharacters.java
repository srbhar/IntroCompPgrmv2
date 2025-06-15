package javahomework4;

public class SixTwelve_DisplayCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printChars('1', 'Z', 10);

	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		int count = 0;
		
		for (char hi = ch1; hi <= ch2; hi++) {
			
			System.out.print(hi + " ");
			count++;
			
			if (count % numberPerLine == 0) {
				
				System.out.println();
			}
			
		}
	}

}
