package practice;

public class RecursiveLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
createLadder(4);

	}
	
	public static void createLadder(int n) {

		if (n == 1) {
			System.out.print("|-|\n");
		return;
		}
		if (n % 2 == 0) {
			createLadder(n-1);
			System.out.print("| |\n");
		}
		else {
			createLadder(n-1);
			System.out.print("|=|\n");
		}
	}
}
