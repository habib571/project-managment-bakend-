package com.project_app.project_management.project;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project_app.project_management.auth.User;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="project" )
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Column(length = 15)
    private  String name  ;
    private  String description ;
    private  double progress ;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User createdBy;
    @OneToMany(mappedBy = "project")
    @JsonIgnore
    private List<ProjectUsers> projectUsers ;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectUsers> getProjectUsers() {
        return projectUsers;
    }

    public void setProjectUsers(List<ProjectUsers> projectUsers) {
        this.projectUsers = projectUsers;
    }
}
