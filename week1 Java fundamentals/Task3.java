
import java.util.Scanner;

/**
 * Task 3: Input & Output using Scanner Class (20 Marks)
 * 
 * Objective: Accept user details using Scanner and display in formatted manner.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("   TASK 3: USER INPUT VIA SCANNER CLASS           ");
        System.out.println("==================================================");

        // Taking Inputs
        System.out.print("Enter your Full Name    : ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your Age          : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear newline buffer

        System.out.print("Enter your College Name : ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter your Branch       : ");
        String branch = scanner.nextLine();

        System.out.print("Enter your City         : ");
        String city = scanner.nextLine();

        // Displaying the gathered information
        System.out.println("\n--------------------------------------------------");
        System.out.println("              ENTERED DETAILS SUMMARY             ");
        System.out.println("--------------------------------------------------");
        System.out.println("Full Name    : " + fullName);
        System.out.println("Age          : " + age);
        System.out.println("College Name : " + collegeName);
        System.out.println("Branch       : " + branch);
        System.out.println("City         : " + city);
        System.out.println("==================================================");

        scanner.close();
    }
}

