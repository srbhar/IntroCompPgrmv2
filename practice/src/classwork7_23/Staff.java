package classwork7_23;

public class Staff extends Employee {
	
	private String title;
	
	public Staff() {
		title = "Coder";
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return "Staff: " + super.getName();
	}

}
