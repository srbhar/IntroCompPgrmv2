package javahomework3;

public class FiveFifteen_AscIICharacterTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		for (int i = 33; i <= 126; i++) {
			
			System.out.print((char)i + " ");
			count++;
			
			if (count % 10 == 0) {
				
				System.out.println();
			}
		}

	}

}
