package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private Phone phone;
    private ArrayList<Project> projects;

    public Customer(String name, String surname, String number, ArrayList<Project> projects) {
        this.name = name;
        this.surname = surname;
        this.phone = new Phone(number);
        this.projects = projects;
    }

    public void setPhone(String number){
        if (this.phone.isValid()){this.phone.setNumber(number);} else {this.phone.setNumber("XXXX");}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Phone getPhone() {
        return phone;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        if (!projects.contains(project)) {
            projects.add(project);
        }
    }
}
