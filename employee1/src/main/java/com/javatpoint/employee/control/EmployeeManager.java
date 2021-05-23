package com.javatpoint.employee.control;

import com.javatpoint.employee.entity.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

@Stateless
public class EmployeeManager {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Employee> loadAllCEmployees() {
		return this.entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
	}

	public void delete(Employee employee) {
		if (entityManager.contains(employee)) {
			entityManager.remove(employee);
		} else {
			Employee managedEmployee = entityManager.find(Employee.class, employee.getId());
			if (managedEmployee != null) {
				entityManager.remove(managedEmployee);
			}
		}
	}

	public void addNewEmployee(Employee employee) {

		
		Employee newEmployee = new Employee();
		newEmployee.setEmail(employee.getEmail());
		newEmployee.setName(employee.getName());
		newEmployee.setEmployeeCode(employee.getEmployeeCode());
		newEmployee.setAddress(employee.getAddress());

		this.entityManager.persist(newEmployee);
	}

	public void update(List<Employee> employees) {
		employees.forEach(entityManager::merge);
	}
}