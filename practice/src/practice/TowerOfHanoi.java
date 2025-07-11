package practice;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(3, 'A', 'B', 'C');

	}
	
	public static void solve(int n, char source, char auxiliary, char destination) {
		if (n == 1) {
			System.out.println("Move disk 1 from " + source + " to " + destination);
			return;
		}
		
		solve(n-1, source, destination, auxiliary);
		System.out.println("Move disk " + n + " from " + source + " to " + destination);
		solve(n-1, auxiliary, source, destination);
	}

}
