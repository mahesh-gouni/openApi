package com.yamlToProject.Contract.controller;

public class Car {
    private String model;
    private int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model; // 'this.model' refers to the instance variable
        this.year = year;   // 'this.year' refers to the instance variable
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Model: " + this.model + ", Year: " + this.year); // 'this' is optional here
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2020); // Creating a new instance of Car
        myCar.displayDetails(); // Calling the method to display details
    }
}

