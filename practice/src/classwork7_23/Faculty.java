package classwork7_23;

public class Faculty extends Employee {
	
	private String officehours;
	private String rank;
	
	public Faculty() {
		officehours = "9-5";
		rank = "Low";
	}
	
	public void setOfficeHours(String officehours) {
		this.officehours = officehours;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officehours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public String toString() {
		return "Faculty: " + super.getName();
	}

}
