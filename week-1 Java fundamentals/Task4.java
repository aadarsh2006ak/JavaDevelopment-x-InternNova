
import java.util.Scanner;

/**
 * Task 4: Operators Practice (20 Marks)
 * 
 * Objective: Arithmetic Calculator performing Addition, Subtraction,
 * Multiplication, Division, and Modulus on two user-entered numbers.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("          TASK 4: ARITHMETIC OPERATORS            ");
        System.out.println("==================================================");

        System.out.print("Enter first number  : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        // Performing Arithmetic Operations
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        System.out.println("\n--------------------------------------------------");
        System.out.println("                CALCULATION RESULTS               ");
        System.out.println("--------------------------------------------------");
        System.out.println("Addition       (" + num1 + " + " + num2 + ") = " + sum);
        System.out.println("Subtraction    (" + num1 + " - " + num2 + ") = " + diff);
        System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + prod);

        if (num2 != 0) {
            double div = num1 / num2;
            double mod = num1 % num2;
            System.out.println("Division       (" + num1 + " / " + num2 + ") = " + div);
            System.out.println("Modulus        (" + num1 + " % " + num2 + ") = " + mod);
        } else {
            System.out.println("Division       : Error (Division by zero is not allowed)");
            System.out.println("Modulus        : Error (Modulo by zero is not allowed)");
        }
        System.out.println("==================================================");

        scanner.close();
    }
}

