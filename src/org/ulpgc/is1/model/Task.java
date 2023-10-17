package org.ulpgc.is1.model;

import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date start;
    private Date end;
    private TaskType taskType;

    public Task(String name, String description, Date start, Date end, TaskType taskType) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
        this.taskType = taskType;
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
}
