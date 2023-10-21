package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();

        // Aggregate Customers
        projectManager.addCustomer("George", "Smith", new Phone("677735244"));
        projectManager.addCustomer("George", "SmithPhoneCloner", new Phone("677735244"));
        projectManager.addCustomer("George", "Smith", new Phone("677735266"));
        projectManager.addCustomer("Ada", "Dai", new Phone("698795244"));
        projectManager.addCustomer("Mr.", "WrongNumber", new Phone("6987952"));
        projectManager.addCustomer("Mrs.", "WrongNumberTwo", new Phone("aaaaaaaaa"));
        projectManager.addCustomer("Mrs.", "WrongNumberTwo", new Phone("aaaaaaaaa"));

        Customer customer = projectManager.getCustomerByNameAndSurname("George","Smith");
        ArrayList<Customer> customers = projectManager.getCustomers();
        System.out.println(customer.toString());
        System.out.println(customers);


        // Aggregate Employees
        projectManager.addEmployee("Trump", "trumppresident@empresa.com", new ArrayList<>(), new ArrayList<>());
        projectManager.addEmployee("AnotherTrump", "trumppresident@empresa.com", new ArrayList<>(), new ArrayList<>());
        projectManager.addEmployee("Charles", "CharlesKing69@empresa.com", new ArrayList<>(), new ArrayList<>());

        ArrayList<Employee> employees = projectManager.getEmployees();
        System.out.println(employees.toString());
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
                "Proyecto de prueba", ProjectType.WebDevelopment, employee2Manager, contractStart,
                contractEnd, contractBudget, developers);

        Project project = customer.getProjects().get(0);
        System.out.println(project.toString());


        // Create tasks
        project.addTask("Task 1", "Developing a web for adult content", contractStart,
                contractEnd, TaskType.Programming);
        project.addTask("Task 2", "Developing an ad-service web for kid's toys", contractStart,
                contractEnd, TaskType.Design);
        System.out.println(project);


    }
    }
