import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static final Comparator<Student> STUDENT_GRADE_COMPARATOR = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			
			if (s1.grade < s2.grade) return 1;
			else if (s1.grade > s2.grade)return -1;
			return 0;
		}
		
	};
	
	public static final Comparator<Student> STUDENT_Name_COMPARATOR = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			
			return s1.name.compareTo(s2.name);
		}
		
	};

	public static void main(String[] args) {
		Student s1 = new Student("Khaled", 10);
		Student s2 = new Student("Mariam", 10);
		Student s3 = new Student("Amr", 1);
		Student s4 = new Student("Karim", 5);
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(s2);
		list.add(s1);
		list.add(s3);
		list.add(s4);
		
		Collections.sort(list, STUDENT_Name_COMPARATOR);
		Collections.sort(list, STUDENT_GRADE_COMPARATOR);
		
		System.out.println(list);

	}
	
	

}

class Student {
	String name;
	double grade;
	
	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return name + " " + grade;
	}
	

}
