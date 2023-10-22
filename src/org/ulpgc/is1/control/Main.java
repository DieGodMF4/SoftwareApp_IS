package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();

        // Aggregate Customers
        projectManager.addCustomer("George", "Washington", new Phone("677735244"));
        projectManager.addCustomer("George", "WashingtonPhoneCloner", new Phone("677735244"));
        projectManager.addCustomer("George", "Washington", new Phone("677735266"));
        projectManager.addCustomer("Levi", "Ackerman", new Phone("123456789"));
        projectManager.addCustomer("Mr.", "WrongNumber", new Phone("6987952"));
        projectManager.addCustomer("Mrs.", "WrongNumberTwo", new Phone("aaaaaaaaa"));
        projectManager.addCustomer("Mrs.", "WrongNumberThree", new Phone("aua675890"));

        Customer customer = projectManager.getCustomerByNameAndSurname("George", "Washington");
        Customer customer2 = projectManager.getCustomerByPosition(1);
        ArrayList<Customer> customers = projectManager.getCustomers();
        System.out.println(customer.toString());
        System.out.println(customers);


        // Aggregate Employees
        projectManager.addEmployee("Trump", "trumppresident@empresa.com", new ArrayList<>(), new ArrayList<>());
        projectManager.addEmployee("AnotherTrump", "trumppresident@empresa.com", new ArrayList<>(), new ArrayList<>());
        projectManager.addEmployee("Charles", "CharlesKing69@empresa.com", new ArrayList<>(), new ArrayList<>());

        ArrayList<Employee> employees = projectManager.getEmployees();
        System.out.println(employees.toString() + '\n');
        Employee employee1Developer = projectManager.getEmployeeByEmail("CharlesKing69@empresa.com");
        Employee employee2Manager = projectManager.getEmployeeByName("Trump");
        System.out.println(employee1Developer);
        System.out.println(employee2Manager);

        Date contractStart = new Date(2023, Calendar.NOVEMBER, 1);
        Date contractEnd = new Date(2023, Calendar.DECEMBER, 31);
        int contractBudget = 1000;
        ArrayList<Employee> developers = new ArrayList<>();
        developers.add(employee1Developer);

        // Project:
        projectManager.project(customer, "Proyecto 1",
                "Test for a new Project", ProjectType.WebDevelopment, employee2Manager, contractStart,
                contractEnd, contractBudget, developers);

        // 1st customer Project
        Project project = customer.getProjects().get(0);
        System.out.println(project.toString() + '\n');

        // Create tasks
        project.addTask("Task 1", "Developing a web for adult content", contractStart,
                contractEnd, TaskType.Programming);
        project.addTask("Task 2", "Developing an ad-service web for kid's toys", contractStart,
                contractEnd, TaskType.Design);
        System.out.println(project);    // Project with tasks implemented

        // Remove second customer
        System.out.println("\nThe second customer is: " + customer2);
        System.out.println("Current number of customers: " + customers.size());
        customers.remove(1);
        System.out.println("The list of customer updated: " + customers);
        System.out.println("Current number of customers: " + customers.size());
    }
}
