package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Project> developersProjects;
    private ArrayList<Task> tasks;
    private ArrayList<Project> projectsFromManager;

    public Employee(String name, String email, ArrayList<Project> developers, ArrayList<Task> tasks, ArrayList<Project> projects) {
        this.name = name;
        this.email = email;
        this.developersProjects = new ArrayList<>(developers);
        this.tasks = tasks;
        this.projectsFromManager = projects;
    }

    public void addTask(Task task){
        if (!tasks.contains(task)){tasks.add(task);} else {System.out.println("Task already added!");}
    }

    public void addDevelopersProjects (Project p){
        if(!developersProjects.contains(p)){developersProjects.add(p);} else {System.out.println("Project already added!");}
    }

    public void addProjectsFromManager (Project p) {
        if(!projectsFromManager.contains(p)){projectsFromManager.add(p);} else {System.out.println("Project already added!");}
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

    public ArrayList<Project> getDevelopers() {
        return developersProjects;
    }

    public void setDevelopers(ArrayList<Project> developers) {
        this.developersProjects = developers;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Project> getProjectsFromManager() {
        return projectsFromManager;
    }

    public void setProjectsFromManager(ArrayList<Project> projectsFromManager) {
        this.projectsFromManager = projectsFromManager;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " with e-mail: " + this.getEmail();
    }
}
