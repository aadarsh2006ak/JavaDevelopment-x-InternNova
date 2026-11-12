
/**
 * Task 2: Variables & Data Types (20 Marks)
 * 
 * Objective: Store and display personal information using appropriate Java data types.
 */
public class Task2 {
    public static void main(String[] args) {
        // Variable declarations with appropriate data types
        String name = "Aadarsh";             // Text (String)
        int age = 20;                        // Whole number (int)
        double height = 5.9;                 // Decimal value in feet (double)
        double weight = 65.5;                // Decimal value in kg (double)
        double cgpa = 8.75;                  // Decimal value (double)
        char gender = 'M';                   // Single character (char)
        boolean isStudent = true;            // Logical true/false (boolean)

        // Displaying variables neatly
        System.out.println("==================================================");
        System.out.println("         TASK 2: VARIABLES & DATA TYPES           ");
        System.out.println("==================================================");
        System.out.println("Name       (String)  : " + name);
        System.out.println("Age        (int)     : " + age + " years");
        System.out.println("Height     (double)  : " + height + " ft");
        System.out.println("Weight     (double)  : " + weight + " kg");
        System.out.println("CGPA       (double)  : " + cgpa);
        System.out.println("Gender     (char)    : " + gender);
        System.out.println("Is Student (boolean) : " + isStudent);
        System.out.println("==================================================");
    }
}
