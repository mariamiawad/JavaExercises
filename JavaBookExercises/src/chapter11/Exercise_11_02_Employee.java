package chapter11;
import java.util.Date;

public class Exercise_11_02_Employee extends Exercise_11_02_Person {
	protected String office;
	protected double salary;
	protected Date hireDate;

	public Exercise_11_02_Employee(String name) {
		super(name);
	}

	public Exercise_11_02_Employee(String name, double salary, Date hireDate, String office) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.office = office;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}
