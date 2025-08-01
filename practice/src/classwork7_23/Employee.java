package classwork7_23;

public class Employee extends Person{
	
	private String office;
	private double salary;
	private int datehired;
	
	public Employee() {
		office = "Alabama";
		salary = 0;
		datehired = 4112010;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setDateHired(int datehired) {
		this.datehired = datehired;
	}
	
	public String getOffice() {
		return office;
	}
	
	public double getSalary() {
		return salary;
	}

	public int getDateHired() {
		return datehired;
	}
	
	public String toString() {
		return "Employee: " + super.getName();
	}
}
