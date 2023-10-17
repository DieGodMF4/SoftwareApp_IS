package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Project> developers;
    private ArrayList<Task> tasks;
    private ArrayList<Project> projects;

    public Employee(String name, String email, ArrayList<Project> developer, ArrayList<Task> tasks, ArrayList<Project> projects) {
        this.name = name;
        this.email = email;
        this.developers = new ArrayList<Project>();
        this.tasks = tasks;
        this.projects = projects;
    }

    void addTask(Task task){
        tasks.add(task);
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

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }
}
