package practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Person[] persons = new Person[1000];
		
		File file = new File("sample.txt");
		Scanner fileread = new Scanner(file);
		int i = 0;
		while (fileread.hasNext()) {
			String c = fileread.next();
			String ssn = fileread.next();
			String firstname = fileread.next();
			String lastname = fileread.next();
			String name = firstname + " " + lastname;
			persons[i] = new Person(ssn, name);
			i++;
		}
		
		fileread.close();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an SSN to search: ");
		String ssninput = input.next();
		input.close();
		for (int j = 0; j < persons.length; j++) {
			if ((persons[j].ssn).equals(ssninput)) {
				System.out.print("Index: " + j);
				break;
			}
		}
		

	}

}

class Person {
	String ssn;
	String name;
	
	Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}