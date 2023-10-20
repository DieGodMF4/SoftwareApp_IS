package org.ulpgc.is1.control;

import org.junit.runner.manipulation.InvalidOrderingException;
import org.ulpgc.is1.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class ProjectManager {
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;

    public ProjectManager() {
        customers = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, Phone number) {
        Customer customer = new Customer(name, surname, number);
        boolean condition = false;
        for (Customer currentCustomer : customers){
            if ((customer.getName().equals(currentCustomer.getName()) &&
                    customer.getSurname().equals(currentCustomer.getSurname())) |
                    customer.getPhone().getNumber().equals(currentCustomer.getPhone().getNumber())) {
                condition = true;
                break;
            }
        }
        if (!(customers.contains(customer) || condition)) {
            customers.add(customer);
        } else {System.out.println("That customer is already in the list!");}
    }

    public void addEmployee(String name, String email, ArrayList<Project> developers, ArrayList<Task> tasks, ArrayList<Project> projects) {
        Employee employee = new Employee(name, email, developers, tasks, projects);
        boolean condition = false;
        for (Employee currentEmployee:employees) {
            if (currentEmployee.getEmail().equals(employee.getEmail())) {
                condition = true;
                break;
            }
        }
        if (!(employees.contains(employee) || condition)) {
            employees.add(employee);
        } else {System.out.println("That employee is already in the list!");}
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerByPosition(int i) {
        return customers.get(i);
    }

    public Customer getCustomerByNameAndSurname(String name, String surname) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getSurname().equals(surname)) {
                return customer;
            }
        } return null;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeByPosition(int i) {
        return employees.get(i);
    }

    public Employee getEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        } return null;
    }

    public Employee getEmployeeByEmail(String email) {
        for (Employee employee : employees) {
            if (employee.getEmail().equals(email)) {
                return employee;
            }
        } return null;
    }

    /*
    public void addProject(String name, String description, ProjectType type, Employee manager, Date contractStart,
                           Date contractEnd, int contractBudget, ArrayList<Employee> developers) {
        Project project = new Project(name, description, type, manager, contractStart, contractEnd,
                contractBudget, developers);
        if (!projects.contains(project)) {
            projects.add(project);
        } else {System.out.println("That project is already in the list!");}
    }
    **
    No válido pues se crearían dos listas: una para los proyectos creados en "Project" y otra diferente
    para los creados mediante la clase "ProjectManager".
    **
     */

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void project(Customer customer, Employee employee, String name, String description, ProjectType type, Employee manager, Date contractStart,
                                 Date contractEnd, int contractBudget, ArrayList<Employee> developers, String developer_or_manager) {
        Project project = new Project(name, description, type, manager, contractStart, contractEnd, contractBudget,
                developers);
        customer.addProject(project);
        if (developer_or_manager.equals("developer")) {
            employee.addDevelopersProjects(project);
        } else if (developer_or_manager.equals("manager")) {
            employee.addProjectsFromManager(project);
        } else {
            System.out.println("Select as last parameter \"developer\" or \"manager\"! Project not suitable!");
        }
    }

}
