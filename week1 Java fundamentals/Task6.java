
import java.util.Scanner;

/**
 * Task 6: Java Fundamentals Practice (15 Marks)
 * 
 * Objective: Accept integer, float, and double from user, display them,
 * perform implicit and explicit casting, and print before and after values.
 * 
 * Where Type Casting is commonly used in Java:
 * 1. Arithmetic & Precision Control: Converting integer division to floating-point (e.g., (double) a / b) to retain decimals.
 * 2. Mathematical Functions: Many Java Math library functions (like Math.round, Math.sqrt) return double, needing casting to int.
 * 3. Object-Oriented Polymorphism: Downcasting superclass references to subclass instances.
 * 4. Interfacing with APIs / Databases: Converting incoming generalized numeric types (e.g. Long or Object) to specific primitive types.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("    TASK 6: USER INPUT & TYPE CASTING PRACTICE    ");
        System.out.println("==================================================");

        // Accept values from user
        System.out.print("Enter an integer value (e.g., 25)    : ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a float value (e.g., 14.5)     : ");
        float userFloat = scanner.nextFloat();

        System.out.print("Enter a double value (e.g., 89.9876) : ");
        double userDouble = scanner.nextDouble();

        System.out.println("\n--------------------------------------------------");
        System.out.println("               ORIGINAL INPUT VALUES              ");
        System.out.println("--------------------------------------------------");
        System.out.println("Integer value : " + userInt);
        System.out.println("Float value   : " + userFloat);
        System.out.println("Double value  : " + userDouble);

        // 1. Implicit Type Casting (Widening)
        // int -> double, float -> double
        double intToDouble = userInt;       // Widening: int to double
        double floatToDouble = userFloat;   // Widening: float to double

        System.out.println("\n--------------------------------------------------");
        System.out.println("          IMPLICIT CASTING (WIDENING)             ");
        System.out.println("--------------------------------------------------");
        System.out.println("int (" + userInt + ") -> double                 : " + intToDouble);
        System.out.println("float (" + userFloat + ") -> double             : " + floatToDouble);

        // 2. Explicit Type Casting (Narrowing)
        // double -> int, float -> int
        int doubleToInt = (int) userDouble; // Narrowing: double to int
        int floatToInt = (int) userFloat;   // Narrowing: float to int

        System.out.println("\n--------------------------------------------------");
        System.out.println("          EXPLICIT CASTING (NARROWING)            ");
        System.out.println("--------------------------------------------------");
        System.out.println("double (" + userDouble + ") -> int (explicit) : " + doubleToInt);
        System.out.println("float (" + userFloat + ") -> int (explicit)   : " + floatToInt);
        System.out.println("==================================================");

        scanner.close();
    }
}

