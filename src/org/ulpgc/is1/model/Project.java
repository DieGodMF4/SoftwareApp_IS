package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private final int id;
    private static int nextID = 0;
    private String name;
    private String description;
    private ProjectType type;
    private Contract contract;
    private ArrayList<Task> tasks;
    private Employee manager;


    public Project(int id, String name, String description, ProjectType type, Contract contract, ArrayList<Task> tasks, Employee manager) {
        this.manager = manager;
        this.id = nextID++;
        this.name = name;
        this.description = description;
        this.type = type;
        this.contract = contract;
        this.tasks = tasks;
    }

        public void addTask(String name, String description, Date start, Date end, TaskType taskType) {
        Task t = new Task(name, description, start, end, taskType);
        tasks.add(t);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public int getNextID() {
        return nextID;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
