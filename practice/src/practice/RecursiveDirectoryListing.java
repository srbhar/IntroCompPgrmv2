package practice;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecursiveDirectoryListing {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("output.txt");
		PrintWriter output = new PrintWriter(file);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter folder or file: ");
		String folderorfile = input.next();
		File fileinput = new File(folderorfile);
		boolean isDirectory = fileinput.isDirectory();
		boolean isFile = fileinput.isFile();   
		if (isFile) {
			output.write(fileinput.getAbsolutePath());
		}
		else if (isDirectory) {
			listFiles(fileinput, output);
		}
		input.close();
		output.close();
	}
	
	public static void listFiles(File folder, PrintWriter writer) {
	    File[] files = folder.listFiles();
		if (files == null || files.length == 0) {
			return;
		} else {
			for (File file : files) {
		        if (file.isFile()) {
		            writer.println("File: " + file.getAbsolutePath());
		        } else if (file.isDirectory()) {
		            writer.println("Directory: " + file.getAbsolutePath());
		            listFiles(file, writer);
		        }
			}
		}
	}

}
