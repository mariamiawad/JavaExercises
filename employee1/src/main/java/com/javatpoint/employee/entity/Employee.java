package com.javatpoint.employee.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@NotEmpty
	private String name;
	@Column(nullable = false)
	@NotEmpty
	private String address;
	
	@Column(nullable = false)
	@NotEmpty
	@Email
	private String email;


	@Column(nullable = false)
	@NotEmpty
	private String employeeCode;

	public Employee() {

	}

	public Employee(String name, String email,String address,String employeeCode) {
		this.name = name;
		this.email = email;
		this.employeeCode = employeeCode;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Long getEmployeeId() {
		return id;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	
}
