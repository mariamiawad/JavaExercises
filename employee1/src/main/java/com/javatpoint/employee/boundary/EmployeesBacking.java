package com.javatpoint.employee.boundary;
import com.javatpoint.employee.control.EmployeeManager;
import com.javatpoint.employee.entity.Employee;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class EmployeesBacking implements Serializable {

    private List<Employee> employees;

    private Employee employee = new Employee();

    @Inject
    private EmployeeManager employeeManager;

    @PostConstruct
    public void init() {
        this.employees = employeeManager.loadAllCEmployees();
    }

    public void delete(Employee employee) {
    	employeeManager.delete(employee);
        employees.remove(employee);
    }

    public void add() {
        employeeManager.addNewEmployee(employee);
        this.employees = employeeManager.loadAllCEmployees();
        this.employee = new Employee(employee.getName(), employee.getEmail(), employee.getAddress(),employee.getEmployeeCode() );
    }

    public void update() {
        employeeManager.update(employees);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Update successful"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
}
