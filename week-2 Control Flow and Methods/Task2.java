/**
 * Week 2 - Task 2: Loops — Number Practice (20 Marks)
 * 
 * Objective: Practice for, while, and do-while loops to print numbers 1-100,
 * even numbers, odd numbers, and calculate the total sum.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("            TASK 2: LOOPS NUMBER PRACTICE         ");
        System.out.println("==================================================");

        // 1. Print numbers from 1 to 100 using a for loop
        System.out.println("\n1. Numbers from 1 to 100 (for loop):");
        System.out.println("--------------------------------------------------");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) {
                System.out.println(); // New line after every 10 numbers
            }
        }

        // 2. Print all even numbers between 1 and 100 using a while loop
        System.out.println("\n2. Even numbers between 1 and 100 (while loop):");
        System.out.println("--------------------------------------------------");
        int even = 2;
        int evenCount = 0;
        while (even <= 100) {
            System.out.printf("%4d", even);
            evenCount++;
            if (evenCount % 10 == 0) {
                System.out.println();
            }
            even += 2;
        }

        // 3. Print all odd numbers between 1 and 100 using a do-while loop
        System.out.println("\n3. Odd numbers between 1 and 100 (do-while loop):");
        System.out.println("--------------------------------------------------");
        int odd = 1;
        int oddCount = 0;
        do {
            System.out.printf("%4d", odd);
            oddCount++;
            if (oddCount % 10 == 0) {
                System.out.println();
            }
            odd += 2;
        } while (odd <= 100);

        // 4. Calculate the sum of numbers from 1 to 100 using a for loop
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("4. Sum of numbers from 1 to 100 = " + sum);
        System.out.println("==================================================");
    }
}

