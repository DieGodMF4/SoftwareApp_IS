package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Task> tasks;
    private Effort effort;
    private ArrayList<Project> projects;

    public Employee(String name, String email, ArrayList<Task> tasks, ArrayList<Project> projects) {
        this.name = name;
        this.email = email;
        this.tasks = tasks;
        this.projects = projects;
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
        } else {
            System.out.println("Task already added!");
        }
    }

    public void addProject(Project project) {
        if (!projects.contains(project)) {
            projects.add(project);
        }
    }

    public ArrayList<Project> getProjects() {
        return projects;
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

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " with e-mail: " + this.getEmail();
    }

    public Effort getEffort() {
        return effort;
    }

    public void setEffort(Effort effort) {
        this.effort = effort;
    }
}
