
public class Exercise_11_2_Faculty extends Exercise_11_2_Employee {
	protected String office_hous;
	protected String rank;

	public Exercise_11_2_Faculty(String name) {
		super(name);
	}

	public Exercise_11_2_Faculty(String name, String office_hous, String rank) {
		super(name);
		this.office_hous = office_hous;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return office_hous;
	}

	public void setOfficeHours(String office_hous) {
		this.office_hous = office_hous;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}

}
