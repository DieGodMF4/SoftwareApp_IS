package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();

        // Aggregate client
        projectManager.addCustomer("George", "Smith", new Phone("677735244"));
        projectManager.addCustomer("George", "SmithPhoneCloner", new Phone("677735244"));
        projectManager.addCustomer("George", "Smith", new Phone("677735266"));
        projectManager.addCustomer("Ada", "Dai", new Phone("698795244"));
        projectManager.addCustomer("Mr.", "WrongNumber", new Phone("6987952"));
        projectManager.addCustomer("Mrs.", "WrongNumberTwo", new Phone("aaaaaaaaa"));
        projectManager.addCustomer("Mrs.", "WrongNumberTwo", new Phone("aaaaaaaaa"));


        // Aggregate employable
        projectManager.addEmployee("James", "james1897@empresa.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        projectManager.addEmployee("Charles", "Charles1765@empresa.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Customer customer = projectManager.getCustomerByNameAndSurname("George","Smith");
        ArrayList<Customer> customers = projectManager.getCustomers();
        System.out.println(customer.toString());
        System.out.println(customers);
    }
    }
