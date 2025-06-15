package javahomework4;

public class SixEight_CelsiusFahrenheitConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("C\tF\t|\tC\tF");
		
		System.out.println();
		
		for (int i = 40, j = 120; i >= 31 && j >= 30; i--, j -= 10) {
			System.out.print(i + "\t");
			System.out.print(9/5*i+32 + "\t|\t");
			System.out.print(j + "\t");
			System.out.print(5/9*(j-32));
			System.out.println();
		}

	}

}
