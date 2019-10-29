
public class Exercise_11_2 {

	public Exercise_11_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Exercise_11_2_Person person = new Exercise_11_2_Person("person");
		Exercise_11_2_Student student = new Exercise_11_2_Student("student");
		Exercise_11_2_Employee employee = new Exercise_11_2_Employee("employee");
		Exercise_11_2_Faculty faculty = new Exercise_11_2_Faculty("faculty");
		Exercise_11_2_Staff staff = new Exercise_11_2_Staff("staff");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
