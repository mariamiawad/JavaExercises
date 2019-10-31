public class Exercise_13_13 implements Cloneable {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Exercise_13_13(String courseName) {
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

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Exercise_13_13 exercise_13_13 = new Exercise_13_13("Math");
		exercise_13_13.addStudent("Mariam");
		exercise_13_13.addStudent("Abdallah");
		String[] strings = exercise_13_13.getStudents();
		Exercise_13_13 exercise_13_13_Object = (Exercise_13_13) exercise_13_13.clone();
		System.out.println(exercise_13_13.getStudents().equals(exercise_13_13_Object.getStudents()));
		for (int i = 0; i < exercise_13_13.getNumberOfStudents(); i++) {
			System.out.println(strings[i]);
		}
		exercise_13_13.dropStudent("Mariam");
		for (int i = 0; i < exercise_13_13.getNumberOfStudents(); i++) {
			System.out.println(strings[i]);
		}

		exercise_13_13.clear();
		for (int i = 0; i < exercise_13_13.getNumberOfStudents(); i++) {
			System.out.println(strings[i]);
		}

	}
}
