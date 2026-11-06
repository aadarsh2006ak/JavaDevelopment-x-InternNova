
/**
 * Task 5: Type Casting (15 Marks)
 * 
 * Objective: Demonstrate Implicit (Widening) and Explicit (Narrowing) Type Casting.
 * 
 * Explanation:
 * 1. Implicit Type Casting (Widening): Happens automatically when converting a smaller 
 *    data type into a larger data type (e.g., int to double). There is no loss of data.
 * 2. Explicit Type Casting (Narrowing): Must be done manually by specifying the target 
 *    type in parentheses (e.g., (int) doubleValue). It converts a larger data type to 
 *    a smaller data type and may result in truncation or precision loss.
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("            TASK 5: TYPE CASTING IN JAVA          ");
        System.out.println("==================================================");

        // 1. Implicit Type Casting (Widening: int -> double)
        int intVal = 100;
        double implicitDoubleVal = intVal; // Automatic conversion

        System.out.println("1. IMPLICIT CASTING (Widening):");
        System.out.println("   Original value (int)    : " + intVal);
        System.out.println("   Casted value (double)   : " + implicitDoubleVal);
        System.out.println("   Note: Automatic conversion without data loss.\n");

        // 2. Explicit Type Casting (Narrowing: double -> int)
        double doubleVal = 99.78;
        int explicitIntVal = (int) doubleVal; // Manual casting

        System.out.println("2. EXPLICIT CASTING (Narrowing):");
        System.out.println("   Original value (double) : " + doubleVal);
        System.out.println("   Casted value (int)      : " + explicitIntVal);
        System.out.println("   Note: Fractional part is truncated (data loss).");
        System.out.println("==================================================");
    }
}

