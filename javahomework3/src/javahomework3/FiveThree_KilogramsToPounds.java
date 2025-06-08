package javahomework3;

public class FiveThree_KilogramsToPounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Kilograms     Pounds");
		
		int i;
		
		double pounds;
		
		for (i=1; i< 200; i++) {
			
			pounds = i * 2.2;
			
			System.out.printf("%-12d%7.1f\n", i, pounds);
			
		}

	}

}
