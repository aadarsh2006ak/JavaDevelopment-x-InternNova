import java.util.Scanner;

/**
 * Week 2 - Task 6: 2D Array — Matrix Operations (15 Marks)
 * 
 * Objective: Store a 3x3 matrix in a 2D array, take user inputs,
 * display it in matrix format, and calculate the sum of all elements.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        System.out.println("==================================================");
        System.out.println("       TASK 6: 2D ARRAY - 3x3 MATRIX              ");
        System.out.println("==================================================");

        // Input matrix elements
        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("  Element [" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display matrix in proper format and calculate total sum
        int sum = 0;
        System.out.println("\n--------------------------------------------------");
        System.out.println("               3x3 MATRIX DISPLAY                 ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < rows; i++) {
            System.out.print("  | ");
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d ", matrix[i][j]);
                sum += matrix[i][j];
            }
            System.out.println(" |");
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("Sum of all matrix elements = " + sum);
        System.out.println("==================================================");

        scanner.close();
    }
}

