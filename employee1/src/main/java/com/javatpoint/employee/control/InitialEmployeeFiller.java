package com.javatpoint.employee.control;

import com.javatpoint.employee.entity.Employee;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.UUID;

@Startup
@Singleton
public class InitialEmployeeFiller {

	@PersistenceContext
	private EntityManager entityManager;

	@PostConstruct
	public void init() {

		System.out.println("Storing three initial employees");

		this.entityManager.persist(createEmployee("John", "doe@john.de", "14 sokar st", "1111"));
		this.entityManager.persist(createEmployee("Max", "max@gmail.com", "14 sokar st", "2222"));
		this.entityManager.persist(createEmployee("Philip", "philip@riecks.de", "14 sokar st", "3333"));

	}

	private Employee createEmployee(String name, String email, String address, String employeeCode) {
		Employee result = new Employee();
		result.setName(name);
		result.setEmployeeCode(employeeCode);
		result.setAddress(address);
		result.setEmail(email);
		return result;
	}
}