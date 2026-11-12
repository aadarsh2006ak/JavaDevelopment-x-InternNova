import java.util.Scanner;

/**
 * Week 2 - Task 1: Conditional Statements — Student Result (15 Marks)
 * 
 * Objective: Take marks of a student in 3 subjects, calculate total and percentage,
 * and determine the result using conditional statements.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("       TASK 1: STUDENT RESULT CALCULATOR          ");
        System.out.println("==================================================");

        // Accept student name
        System.out.print("Enter Student Name : ");
        String studentName = scanner.nextLine();

        // Accept marks in 3 subjects (out of 100 each)
        System.out.print("Enter Marks in Subject 1 (0-100): ");
        double sub1 = scanner.nextDouble();

        System.out.print("Enter Marks in Subject 2 (0-100): ");
        double sub2 = scanner.nextDouble();

        System.out.print("Enter Marks in Subject 3 (0-100): ");
        double sub3 = scanner.nextDouble();

        // Calculate total and percentage
        double totalMarks = sub1 + sub2 + sub3;
        double percentage = (totalMarks / 300.0) * 100.0;

        // Determine result using conditional statements
        String result;
        if (sub1 < 0 || sub1 > 100 || sub2 < 0 || sub2 > 100 || sub3 < 0 || sub3 > 100) {
            result = "Invalid Marks Entered (Must be between 0 and 100)";
        } else if (sub1 < 33 || sub2 < 33 || sub3 < 33) {
            result = "FAIL (Scored below 33 in one or more subjects)";
        } else if (percentage >= 75) {
            result = "PASS - Distinction";
        } else if (percentage >= 60) {
            result = "PASS - First Division";
        } else if (percentage >= 45) {
            result = "PASS - Second Division";
        } else if (percentage >= 33) {
            result = "PASS - Third Division";
        } else {
            result = "FAIL";
        }

        // Display formatted result
        System.out.println("\n--------------------------------------------------");
        System.out.println("                 STUDENT REPORT CARD              ");
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name : " + studentName);
        System.out.printf("Total Marks  : %.2f / 300.00%n", totalMarks);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Result       : " + result);
        System.out.println("==================================================");

        scanner.close();
    }
}

