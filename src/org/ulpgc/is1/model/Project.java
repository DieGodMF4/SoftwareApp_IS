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
    private ArrayList<Employee> developers;
    private Customer customer;


    public Project(String name, String description, ProjectType type, Employee manager, Date contractStart,
                   Date contractEnd, int contractBudget, ArrayList<Employee> developers, Customer customer) {
        this.manager = manager;
        this.developers = developers;
        this.id = nextID++;
        this.name = name;
        this.description = description;
        this.type = type;
        this.customer = customer;
        contract = new Contract(contractStart, contractEnd, contractBudget);
        tasks = new ArrayList<>();
    }

    public void addTask(String name, String description, Date start, Date end, TaskType taskType) { // TASK ES COMPOSICIÓN DE PROJECT
        Task task = new Task(name, description, start, end, taskType);
        if (!tasks.contains(task)) {
            tasks.add(task);
        }
    }

    void addDeveloper(Employee employee) {
        if (!developers.contains(employee)) {
            developers.add(employee);
        }
    }

    public void setManager(Employee employee) {
        if (this.developers.contains(employee))
            manager = employee;
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

    public ArrayList<Employee> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Employee> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "Project called: " + this.getName() + " with description: " + this.getDescription() +
                ".\nManager: " + this.getManager() + "; and developers: " + this.getDevelopers() +
                ".\nThe project has these tasks: " + this.getTasks() + ".\nThe contract is: " + this.getContract().toString();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
