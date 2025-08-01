package practice;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        for (int a = 1; a < 1000 / 3; a++) {
            for (int b = a + 1; b < 1000 / 2; b++) {
                int c = 1000 - a - b;

                if (a * a + b * b == c * c) {
                    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    return;
                }
                
	}
        }
}
}