/**
 * Week 3 - Task 2: Constructors — Employee Information (15 Marks)
 * 
 * Objective: Implement default and parameterized constructors in an Employee class,
 * create objects using both constructors, and display their details.
 * 
 * Explanation of Constructors:
 * 1. A constructor is a special member method that is automatically invoked when an object 
 *    is created using the 'new' keyword.
 * 2. It has the same name as the class and does not declare any return type (not even void).
 * 3. Default Constructor: A constructor that takes no parameters and initializes fields with 
 *    predefined or default values.
 * 4. Parameterized Constructor: A constructor that accepts arguments to initialize fields 
 *    with custom, user-supplied values during object instantiation.
 */

public class Task2 {

    // Employee class definition
    static class Employee {
        int employeeId;
        String employeeName;
        String department;
        double salary;

        // 1. Default Constructor
        public Employee() {
            this.employeeId = 1000;
            this.employeeName = "Not Assigned";
            this.department = "General";
            this.salary = 25000.00;
        }

        // 2. Parameterized Constructor
        public Employee(int employeeId, String employeeName, String department, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.department = department;
            this.salary = salary;
        }

        // Method to display employee details
        public void displayDetails(String constructorType) {
            System.out.println("--------------------------------------------------");
            System.out.println("Constructor Type : " + constructorType);
            System.out.println("Employee ID      : " + employeeId);
            System.out.println("Employee Name    : " + employeeName);
            System.out.println("Department       : " + department);
            System.out.printf("Salary           : Rs. %.2f%n", salary);
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         TASK 2: CONSTRUCTORS PRACTICE            ");
        System.out.println("==================================================");

        // Object 1: Created using Default Constructor
        Employee emp1 = new Employee();
        emp1.displayDetails("Default Constructor");

        // Object 2: Created using Parameterized Constructor
        Employee emp2 = new Employee(101, "Aadarsh", "Software Development", 75000.00);
        emp2.displayDetails("Parameterized Constructor");

        // Object 3: Another Parameterized Constructor instance
        Employee emp3 = new Employee(102, "Rohit Mehra", "DevOps & Cloud", 82000.00);
        emp3.displayDetails("Parameterized Constructor");

        System.out.println("==================================================");
    }
}
