/**
 * Week 3 - Task 5: Polymorphism — Method Overloading & Overriding (20 Marks)
 * 
 * Objective: Demonstrate both Compile-time Polymorphism (Method Overloading)
 * and Runtime Polymorphism (Method Overriding).
 * 
 * Explanation of Polymorphism:
 * 1. Polymorphism means "many forms". It allows one interface or method name to perform 
 *    different operations based on context.
 * 2. Method Overloading (Compile-Time / Static Polymorphism):
 *    - Multiple methods in the same class share the same method name but have different 
 *      parameter lists (different number of parameters, different data types, or sequence).
 *    - Resolved at compile time.
 * 3. Method Overriding (Runtime / Dynamic Polymorphism):
 *    - A subclass provides a specific implementation of a method that is already defined 
 *      in its superclass with the exact same signature and return type.
 *    - Resolved at runtime using Dynamic Method Dispatch (virtual method invocation).
 */

public class Task5 {

    // =========================================================================
    // PART A: Method Overloading (Compile-Time Polymorphism)
    // =========================================================================
    static class Calculator {
        // 1. calculate(int, int) -> Addition of two integers
        public int calculate(int a, int b) {
            System.out.print("calculate(int, int)       : ");
            return a + b;
        }

        // 2. calculate(double, double) -> Product of two doubles
        public double calculate(double a, double b) {
            System.out.print("calculate(double, double) : ");
            return a * b;
        }

        // 3. calculate(int, int, int) -> Sum of three integers
        public int calculate(int a, int b, int c) {
            System.out.print("calculate(int, int, int)  : ");
            return a + b + c;
        }
    }

    // =========================================================================
    // PART B: Method Overriding (Runtime Polymorphism)
    // =========================================================================
    // Parent class
    static class Vehicle {
        public void start() {
            System.out.println("Vehicle: General vehicle startup ignition sequence initiated.");
        }
    }

    // Child class 1
    static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Car    : Push-button start activated. Engine purring smoothly with AC on.");
        }
    }

    // Child class 2
    static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("Bike   : Self-start pressed. Two-wheeler engine revving with high torque.");
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("          TASK 5: POLYMORPHISM IN JAVA            ");
        System.out.println("==================================================");

        // --- PART A DEMO: METHOD OVERLOADING ---
        System.out.println("PART A: METHOD OVERLOADING (Compile-Time)");
        System.out.println("--------------------------------------------------");
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(15, 25));
        System.out.println(calc.calculate(4.5, 3.2));
        System.out.println(calc.calculate(10, 20, 30));

        // --- PART B DEMO: METHOD OVERRIDING ---
        System.out.println("\nPART B: METHOD OVERRIDING (Run-Time)");
        System.out.println("--------------------------------------------------");
        // Parent class reference holding parent object
        Vehicle v1 = new Vehicle();
        v1.start();

        // Parent class reference holding Car object (Dynamic Method Dispatch)
        Vehicle v2 = new Car();
        v2.start();

        // Parent class reference holding Bike object (Dynamic Method Dispatch)
        Vehicle v3 = new Bike();
        v3.start();

        System.out.println("==================================================");
    }
}
