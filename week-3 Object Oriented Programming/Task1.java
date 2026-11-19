/**
 * Week 3 - Task 1: Classes & Objects — Student Management (15 Marks)
 * 
 * Objective: Create a Student class with attributes (Name, Roll Number, Branch, CGPA),
 * instantiate multiple objects, and display their details in a proper format.
 */

public class Task1 {

    // Student class definition
    static class Student {
        String name;
        int rollNumber;
        String branch;
        double cgpa;

        // Method to display student information
        public void displayDetails(int index) {
            System.out.printf("| %-5d | %-12s | %-10d | %-28s | %-6.2f |%n", 
                index, name, rollNumber, branch, cgpa);
        }
    }

    public static void main(String[] args) {
        System.out.println("============================================================================");
        System.out.println("            TASK 1: CLASSES & OBJECTS - STUDENT MANAGEMENT                  ");
        System.out.println("============================================================================");

        // Creating Object 1
        Student s1 = new Student();
        s1.name = "Aadarsh";
        s1.rollNumber = 101;
        s1.branch = "Computer Science & Engg";
        s1.cgpa = 8.85;

        // Creating Object 2
        Student s2 = new Student();
        s2.name = "Priya Sharma";
        s2.rollNumber = 102;
        s2.branch = "Information Technology";
        s2.cgpa = 9.10;

        // Creating Object 3
        Student s3 = new Student();
        s3.name = "Rahul Verma";
        s3.rollNumber = 103;
        s3.branch = "Electronics & Comm";
        s3.cgpa = 8.40;

        // Displaying student information in tabular format
        System.out.println("+-------+--------------+------------+------------------------------+--------+");
        System.out.printf("| %-5s | %-12s | %-10s | %-28s | %-6s |%n", "S.No", "Name", "Roll No", "Branch", "CGPA");
        System.out.println("+-------+--------------+------------+------------------------------+--------+");
        s1.displayDetails(1);
        s2.displayDetails(2);
        s3.displayDetails(3);
        System.out.println("+-------+--------------+------------+------------------------------+--------+");
    }
}
