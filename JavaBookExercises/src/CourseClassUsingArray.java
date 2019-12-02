import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseClassUsingArray {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public CourseClassUsingArray(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		if (numberOfStudents >= students.length) {
			String[] newStudents = new String[numberOfStudents * 2];
			System.arraycopy(students, 0, newStudents, 0, students.length);
			students = newStudents;
		}
		numberOfStudents++;

	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {

		for (int i = 0; i < students.length; i++) {

			if (student.equalsIgnoreCase(students[i])) {

				students[i] = null; 
				numberOfStudents--;
				while (i <= numberOfStudents) {
					students[i] = students[i + 1];
					i++;
				}
				break;
			}
		}

	}

	public void clear() {
		students = new String[100];
		numberOfStudents = 0;

	}

	public static void main(String[] args) {
		CourseClassUsingArray courseClassUsingArray = new CourseClassUsingArray("Math");
		courseClassUsingArray.addStudent("Mariam");
		courseClassUsingArray.addStudent("Abdallah");
		String [] strings = courseClassUsingArray.getStudents();
		for (int i = 0; i <courseClassUsingArray.getNumberOfStudents(); i++) {
			System.out.println(strings[i]);
		}
		courseClassUsingArray.dropStudent("Mariam");
		for (int i = 0; i < courseClassUsingArray.getNumberOfStudents(); i++) {
			System.out.println(strings[i]);
		}
		courseClassUsingArray.clear();
		for (int i = 0; i <courseClassUsingArray.getNumberOfStudents(); i++) {
			System.out.println(strings[i]);
		}
	}
}