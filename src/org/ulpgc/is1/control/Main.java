package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();

        // Aggregate client
        projectManager.addCustomer("George", "Smith", new Phone("677735244"));

        projectManager.addCustomer("Ada", "Dai", new Phone("698795244"));

        // Aggregate employable
        projectManager.addEmployee("James", "james1897@empresa.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        projectManager.addEmployee("Charles", "Charles1765@empresa.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Customer customer = projectManager.getCustomerByNameAndSurname("George","Smith");
        System.out.println(customer.toString());
    }
    }
