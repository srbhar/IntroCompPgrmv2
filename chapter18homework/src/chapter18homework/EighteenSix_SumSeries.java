package chapter18homework;

public class EighteenSix_SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for (int i = 1; i <= 10; i++) {
            double result = m(i);
            System.out.printf("m(" + i + ") = %.6f\n", result);
        }

	}
	
    public static double m(int i) {
        if (i == 1) {
            return 1.0 / 2;
        }
        return (double) i / (i + 1) + m(i - 1);
    }

}
