package com.kevin.taskflow;

import com.kevin.taskflow.model.Task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TaskFlow!");

        // Test 1: Valid task creation
        Task task1 = new Task("Buy groceries", "Milk, eggs, bread");
        System.out.println("✓ Task created: " + task1.getTitle());

        // Test 2: Empty title should fail
        try {
            Task invalid = new Task("", "This should fail");
            System.out.println("✗ FAIL: Empty title was accepted");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Empty title rejected correctly");
        }

        // Test 3: Mark as complete
        task1.markAsComplete();
        System.out.println("✓ Task completed: " + task1.isCompleted());

        // Test 4: toString
        System.out.println("Task details: " + task1);
    }


}

