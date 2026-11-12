import java.util.Scanner;

/**
 * Week 2 - Task 4: Method Parameters & Return Types (15 Marks)
 * 
 * Objective: Create parameterized methods with return values for square,
 * cube, average of three numbers, and maximum of two numbers.
 */
public class Task4 {

    // Method to find the square of a number
    public static double findSquare(double num) {
        return num * num;
    }

    // Method to find the cube of a number
    public static double findCube(double num) {
        return num * num * num;
    }

    // Method to find the average of three numbers
    public static double findAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    // Method to find the maximum of two numbers
    public static double findMaximum(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("    TASK 4: METHOD PARAMETERS & RETURN TYPES      ");
        System.out.println("==================================================");

        // 1. Input for Square and Cube
        System.out.print("Enter a number for Square & Cube : ");
        double num = scanner.nextDouble();

        // 2. Input for Average of Three Numbers
        System.out.print("Enter 3 numbers for Average      : ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        // 3. Input for Maximum of Two Numbers
        System.out.print("Enter 2 numbers for Maximum      : ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Calling methods and storing returned values
        double squareResult = findSquare(num);
        double cubeResult = findCube(num);
        double avgResult = findAverage(n1, n2, n3);
        double maxResult = findMaximum(x, y);

        // Displaying returned results
        System.out.println("\n--------------------------------------------------");
        System.out.println("                 METHOD RESULTS                   ");
        System.out.println("--------------------------------------------------");
        System.out.printf("Square of %.2f              : %.2f%n", num, squareResult);
        System.out.printf("Cube of %.2f                : %.2f%n", num, cubeResult);
        System.out.printf("Average of (%.1f, %.1f, %.1f) : %.2f%n", n1, n2, n3, avgResult);
        System.out.printf("Maximum of (%.1f, %.1f)       : %.2f%n", x, y, maxResult);
        System.out.println("==================================================");

        scanner.close();
    }
}

