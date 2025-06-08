package myapp;

public class FindingRunwayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("a     b     pow(a,b)");
		
		int i;
		for(i = 1; i <= 5; i++) {
			
		int b = i+1;
		
		int c = (int) Math.pow(i, b);
		
		System.out.println(i + "     " + b + "     " + c);
			
		}

	}

}
