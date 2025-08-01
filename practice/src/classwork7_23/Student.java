package classwork7_23;

public class Student extends Person {

	private String classstatus;
	
	public Student() {
		classstatus = "Freshman";
	}
	
	public void setClassStatus(String classstatus) {
		this.classstatus = classstatus;
	}
	
	public String getClassStatus() {
		return classstatus;
	}
	
	public String toString() {
		return "Student: " + super.getName();
	}
	
}
