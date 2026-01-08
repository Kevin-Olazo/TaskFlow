package com.kevin.taskflow.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Task {
    // private fields
    private String id;
    private String title;
    private String description;
    private boolean isCompleted;
    private LocalDateTime createdDate;

    // Constructor
    public Task(String id, String title, String description) {
        setTitle(title);
        this.description = description;
        this.id = id;
        this.isCompleted = false;
        this.createdDate = LocalDateTime.now();

    }

    public Task(String id, String title, String description, boolean isCompleted, LocalDateTime createdDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.createdDate = createdDate;
    }

    public void markAsComplete() {
        this.isCompleted = true;
    }

    public void markAsIncomplete() {
        this.isCompleted = false;
    }

    // SETTERS

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
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
        return "Task{id=" + id + ", title=" + title + " ,description=" + description + ", completed=" + isCompleted + ", created:" + createdDate + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Task task = (Task) obj;

        return Objects.equals(this.getId(), task.getId());
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }
}
