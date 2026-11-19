/**
 * Week 3 - Task 4: Inheritance — Employee Management (20 Marks)
 * 
 * Objective: Demonstrate inheritance using a parent class (Employee) and child classes
 * (Developer, Manager) with 'extends', 'super', and specific child properties/methods.
 * 
 * Explanation of Inheritance:
 * 1. Inheritance is an OOP mechanism where one class (child/subclass) acquires all the 
 *    properties and behaviors of another class (parent/superclass).
 * 2. It is achieved using the 'extends' keyword in Java.
 * 3. Key Benefits:
 *    - Code Reusability: Common fields and methods are written once in the superclass and reused.
 *    - Method Overriding & Runtime Polymorphism: Child classes can specialize behaviors.
 * 4. The 'super' keyword is used to invoke the immediate parent class constructor or methods.
 */

public class Task4 {

    // Parent Class
    static class Employee {
        String name;
        int employeeId;
        double salary;

        // Parent constructor
        public Employee(String name, int employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }

        // Common method to display basic details
        public void displayBasicInfo() {
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name        : " + name);
            System.out.printf("Base Salary : Rs. %.2f%n", salary);
        }
    }

    // Child Class 1: Developer
    static class Developer extends Employee {
        String programmingLanguage;
        String projectTitle;

        // Child constructor calling super()
        public Developer(String name, int employeeId, double salary, String programmingLanguage, String projectTitle) {
            super(name, employeeId, salary); // Reusing parent constructor
            this.programmingLanguage = programmingLanguage;
            this.projectTitle = projectTitle;
        }

        // Specific method for Developer
        public void displayDeveloperDetails() {
            System.out.println("Role        : Software Developer");
            displayBasicInfo(); // Inherited from parent class
            System.out.println("Language    : " + programmingLanguage);
            System.out.println("Project     : " + projectTitle);
        }

        public void writeCode() {
            System.out.println("Action      : " + name + " is writing and optimizing " + programmingLanguage + " modules.");
        }
    }

    // Child Class 2: Manager
    static class Manager extends Employee {
        int teamSize;
        String department;

        // Child constructor calling super()
        public Manager(String name, int employeeId, double salary, int teamSize, String department) {
            super(name, employeeId, salary); // Reusing parent constructor
            this.teamSize = teamSize;
            this.department = department;
        }

        // Specific method for Manager
        public void displayManagerDetails() {
            System.out.println("Role        : Engineering Manager");
            displayBasicInfo(); // Inherited from parent class
            System.out.println("Department  : " + department);
            System.out.println("Team Size   : " + teamSize + " Engineers");
        }

        public void conductMeeting() {
            System.out.println("Action      : " + name + " is conducting a sprint planning meeting for " + department + ".");
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("           TASK 4: INHERITANCE PRACTICE           ");
        System.out.println("==================================================");

        // Instantiating Developer (Child class 1)
        Developer dev = new Developer("Aadarsh", 201, 75000.00, "Java & Spring Boot", "Banking Microservices");
        System.out.println("1. DEVELOPER DETAILS:");
        System.out.println("--------------------------------------------------");
        dev.displayDeveloperDetails();
        dev.writeCode();

        System.out.println("\n2. MANAGER DETAILS:");
        System.out.println("--------------------------------------------------");
        // Instantiating Manager (Child class 2)
        Manager mgr = new Manager("Ananya Roy", 101, 120000.00, 12, "Backend Architecture");
        mgr.displayManagerDetails();
        mgr.conductMeeting();

        System.out.println("==================================================");
    }
}
