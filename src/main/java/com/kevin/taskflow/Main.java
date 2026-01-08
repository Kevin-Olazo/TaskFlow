package com.kevin.taskflow;

import com.kevin.taskflow.model.Task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TaskFlow!");

        // Test 1: Valid task creation
        Task task1 = new Task("T100","Buy groceries", "Milk, eggs, bread");
        Task task2 = new Task("T100","Buy groceries", "Milk, eggs, bread");
        System.out.println("✓ Task created: " + task1.getTitle());

        System.out.println(task1.toString());
        System.out.println(task2.toString());

        task2.setDescription("Meat, Tomatoes, fish");
        System.out.println(task1.getDescription());
        System.out.println(task2.getDescription());


        // Test 2: Empty title should fail
        try {
            Task invalid = new Task("12", "", "This should fail");
            System.out.println("✗ FAIL: Empty title was accepted");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Empty title rejected correctly");
        }

        // Test 3: Mark as complete
        task1.markAsComplete();
        System.out.println("✓ Task completed: " + task1.isCompleted());

        // Test 4: Mark as incomplete
        task1.markAsIncomplete();
        System.out.println("✓ Task completed: " + task1.isCompleted());

        // Test 5: toString
        System.out.println("Task details: " + task1);

        // Test 6: equals
        System.out.println("Is equal?: " + task1.equals(task2));

        System.out.println("h1" + task1.hashCode());
        System.out.println("h1" + task2.hashCode());


    }


}

