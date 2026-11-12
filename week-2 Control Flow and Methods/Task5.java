import java.util.Scanner;

/**
 * Week 2 - Task 5: 1D Array — Student Marks (15 Marks)
 * 
 * Objective: Store marks of 5 students in a 1D array, display them,
 * and calculate total, average, highest, and lowest marks.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("==================================================");
        System.out.println("        TASK 5: 1D ARRAY - STUDENT MARKS          ");
        System.out.println("==================================================");

        // Accept marks of 5 students
        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("  Student " + (i + 1) + " marks : ");
            marks[i] = scanner.nextInt();
        }

        // Display all marks and compute total, highest, and lowest
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        System.out.println("\n--------------------------------------------------");
        System.out.println("               ENTERED STUDENT MARKS              ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " : " + marks[i]);
            total += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / marks.length;

        // Display statistics
        System.out.println("\n--------------------------------------------------");
        System.out.println("               MARKS STATISTICS                   ");
        System.out.println("--------------------------------------------------");
        System.out.println("Total Marks   : " + total);
        System.out.printf("Average Marks : %.2f%n", average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);
        System.out.println("==================================================");

        scanner.close();
    }
}

