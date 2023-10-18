package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Project> developers;
    private ArrayList<Task> tasks;
    private ArrayList<Project> projectsFromManager;

    public Employee(String name, String email, ArrayList<Project> developers, ArrayList<Task> tasks, ArrayList<Project> projects) {
        this.name = name;
        this.email = email;
        this.developers = new ArrayList<Project>(developers);
        this.tasks = tasks;
        this.projectsFromManager = projects;
    }

    void addTask(Task task){
        if (!tasks.contains(task)){tasks.add(task);}
    }

    void addDeveloper (Project p){
        if(!developers.contains(p)){developers.add(p);}
    }

    void addProjectsManager (Project p) {
        if(!projectsFromManager.contains(p)){projectsFromManager.add(p);}
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
        return developers;
    }

    public void setDevelopers(ArrayList<Project> developers) {
        this.developers = developers;
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
}
