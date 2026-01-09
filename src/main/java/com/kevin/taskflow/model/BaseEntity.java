package com.kevin.taskflow.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public abstract class BaseEntity {
    protected String id;
    protected LocalDateTime createdDate;

    public BaseEntity(String id, LocalDateTime createdDate) {
        this.id = id;
        this.createdDate = createdDate;
    }

    public BaseEntity(String id) {
        this.id = id;
        this.createdDate = LocalDateTime.now();
    }

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
        this.createdDate = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        BaseEntity baseEntity = (BaseEntity) obj;

        return Objects.equals(this.getId(), baseEntity.getId());
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }
}
