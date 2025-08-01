package classwork7_23;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.setName("Carl");
		Person student = new Student();
		student.setName("Cara");
		Person employee = new Employee();
		employee.setName("Carson");
		Employee faculty = new Faculty();
		faculty.setName("Carlos");
		Employee staff = new Staff();
		staff.setName("Carla");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
