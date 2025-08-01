package classwork7_23;

public class Person {
	
	private String name;
	private String address;
	private int phonenumber;
	private String emailaddress;
	
	public Person() {
		name = "Bob";
		address = "123 lane";
		phonenumber = 67;
		emailaddress = "hi@gmail.com";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public void setEmailAddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getPhoneNumber() {
		return phonenumber;
	}
	
	public String getEmailAddress() {
		return emailaddress;
	}
	
	public String toString() {
		return "Person: " + name;
	}

}