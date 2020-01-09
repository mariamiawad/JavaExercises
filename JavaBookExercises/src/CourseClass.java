import java.util.ArrayList;
import java.util.List;

public class CourseClass {
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	

	public CourseClass(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		students.remove(student);
	}
	public static void main(String[] args) {
		CourseClass courseClass = new CourseClass("Math");
		courseClass.addStudent("Mariam");
		courseClass.addStudent("Ibrahim");
		int number = courseClass.getNumberOfStudents();
		System.out.println(number);
		String string = courseClass.getCourseName();
		System.out.println(string);
		ArrayList<String> arrayList = courseClass.getStudents();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
		
	}
}