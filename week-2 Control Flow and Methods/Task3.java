import java.util.Scanner;

/**
 * Week 2 - Task 3: Methods — Calculator (20 Marks)
 * 
 * Objective: Implement a calculator using separate methods for
 * Addition, Subtraction, Multiplication, Division, and Modulus.
 */
public class Task3 {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double divide(double a, double b) {
        return a / b;
    }

    // Method for Modulus
    public static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("        TASK 3: METHOD-BASED CALCULATOR           ");
        System.out.println("==================================================");

        System.out.print("Enter first number  : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Perform All Operations");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        System.out.println("\n--------------------------------------------------");
        System.out.println("                     RESULTS                      ");
        System.out.println("--------------------------------------------------");

        switch (choice) {
            case 1:
                System.out.println("Addition       : " + num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case 2:
                System.out.println("Subtraction    : " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Multiplication : " + num1 + " * " + num2 + " = " + multiply(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division       : " + num1 + " / " + num2 + " = " + divide(num1, num2));
                } else {
                    System.out.println("Division       : Error (Cannot divide by zero)");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Modulus        : " + num1 + " % " + num2 + " = " + modulus(num1, num2));
                } else {
                    System.out.println("Modulus        : Error (Cannot find modulus by zero)");
                }
                break;
            case 6:
                System.out.println("Addition       : " + num1 + " + " + num2 + " = " + add(num1, num2));
                System.out.println("Subtraction    : " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                System.out.println("Multiplication : " + num1 + " * " + num2 + " = " + multiply(num1, num2));
                if (num2 != 0) {
                    System.out.println("Division       : " + num1 + " / " + num2 + " = " + divide(num1, num2));
                    System.out.println("Modulus        : " + num1 + " % " + num2 + " = " + modulus(num1, num2));
                } else {
                    System.out.println("Division       : Error (Cannot divide by zero)");
                    System.out.println("Modulus        : Error (Cannot find modulus by zero)");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 and 6.");
        }

        System.out.println("==================================================");
        scanner.close();
    }
}

