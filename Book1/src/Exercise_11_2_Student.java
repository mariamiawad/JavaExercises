
public class Exercise_11_2_Student extends Exercise_11_2_Person {
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	protected String status;

	public Exercise_11_2_Student(String name, String adress, String phoneNumber, String email) {
		super(name, adress, phoneNumber, email);
	}

	public Exercise_11_2_Student(String name) {
		super(name);
	}

	public Exercise_11_2_Student(String name, String status) {
		super(name);
		this.status = status;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}

}
