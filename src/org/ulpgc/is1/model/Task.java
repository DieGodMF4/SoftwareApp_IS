package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date start;
    private Date end;
    private TaskType taskType;
    private ArrayList<Employee> employees;
    private Effort effort;

    public Task(String name, String description, Date start, Date end, TaskType taskType) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
        this.taskType = taskType;
        employees = new ArrayList<>();
    }

    public void addEffort(Effort effort) {
        this.effort = effort;
    }

    public ArrayList<Employee> getEmployee() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getDescription() + ". " + this.getTaskType() +
                " starting " + this.getStart() + " and ending " + getEnd();
    }

    public Effort getEffort() {
        return effort;
    }

    public void setEffort(Effort effort) {
        this.effort = effort;
    }
}
