package javahomework3;

public class FiveTwentySeven_DisplayLeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		int lines = 0;
		
		for (int i = 101; i <= 2100; i++) {
			
			if ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))) {
				System.out.print(i + " ");
				count++;
				lines++;
				
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.print(lines + " leap years in total.");

	}

}
