package org.ulpgc.is1.control;

import org.ulpgc.is1.model.ProjectType;

public class Project {
    private final int id;
    private String name;
    private String description;
    private ProjectType type;


    public Project(int id, String name, String description, ProjectType type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }
}
