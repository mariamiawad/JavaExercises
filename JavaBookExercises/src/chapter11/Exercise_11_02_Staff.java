package chapter11;
public class Exercise_11_02_Staff extends Exercise_11_02_Employee {

	protected String title;

	public Exercise_11_02_Staff(String name) {
		this(name, "none");

	}

	public Exercise_11_02_Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
