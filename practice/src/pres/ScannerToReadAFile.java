package pres;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerToReadAFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file name: ");
		File file = new File(input.next());
		Scanner fileread = new Scanner(file); // This method reads from a file using scanner
		while (fileread.hasNext()) {
			System.out.println(input.next());
		}
	}

}
