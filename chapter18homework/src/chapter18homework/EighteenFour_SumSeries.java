package chapter18homework;

public class EighteenFour_SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = computeseries(10);
		System.out.print("m(i) is " + result);
	}
	
	public static double computeseries(int n) {
		if (n == 0) {
			return 0;
		}
		return 1.0 / n + computeseries(n-1);
	}

}
