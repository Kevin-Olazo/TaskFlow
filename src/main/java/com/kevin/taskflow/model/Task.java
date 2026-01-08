package com.kevin.taskflow.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    // private fields
    private String id;
    private String title;
    private String description;
    private boolean isCompleted;
    private LocalDateTime createdDate;

    // Constructor
    public Task(String title, String description) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Error. Enter a valid title");
        }
        this.title = title;
        this.description = description;

        this.id = UUID.randomUUID().toString();
        this.isCompleted = false;
        this.createdDate = LocalDateTime.now();

    }

    public void markAsComplete() {
        this.isCompleted = true;
    }

    public void markAsIncomplete() {
        this.isCompleted = false;
    }

    // SETTERS

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Error. Enter a valid title");
        }
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // GETTERS

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", title=" + title + " ,description=" + description + ", completed=" + isCompleted + ", created:" + createdDate +"}";
    }
}
