package pres;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ThrowVsThrows {
// This method prints the words in a file line by line
	public static void main(String[] args) throws FileNotFoundException { // Declared in method header
		File file = new File("hello.txt");
		Scanner readfile = new Scanner(file);
		while (readfile.hasNext()) {
			String s = readfile.next();
			System.out.println(s);
		}
	}

}
