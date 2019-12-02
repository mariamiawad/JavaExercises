package chapter11;

public class Exercise_11_02_Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;

	public Exercise_11_02_Person(String name) {
		this.name = name;
	}

	public Exercise_11_02_Person(String name, String adress, String phoneNumber, String email) {
		this.name = name;
		this.address = adress;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
