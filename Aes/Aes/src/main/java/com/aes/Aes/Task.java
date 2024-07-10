package com.aes.Aes;

import java.util.Date;

public class Task {
    private String id;
    private String title;
    private String description;
    private Date dueDate;
    private String userId; //relaicon con user
    private boolean completed ;


    public Task(boolean completed) {
        this.completed = false;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isCompleted() {
        return completed;
    }


    public void iscompleted(){
        this.completed = true;
    }

}