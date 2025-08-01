package pres;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("hi.txt");
		PrintWriter output = new PrintWriter(file);
		output.print("Hello!");
		output.close();
	}

}
