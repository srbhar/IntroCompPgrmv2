package javahomework3;

public class FiveFive_KgToLbLbToKg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pounds;
		double kilograms;
		
		System.out.println("Kilograms   Pounds   |   Pounds    Kilograms");
		
		for (int i = 1, j = 20; i < 200 && j < 516; i += 2, j += 5) {
			
			pounds = i * 2.2;
			kilograms = j/2.2;
			
			System.out.printf("%-11d%7.1f   |   %-11d%7.1f\n", i, pounds, j, kilograms);
			
		}
		
		

	}

}
	