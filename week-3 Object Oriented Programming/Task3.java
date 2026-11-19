/**
 * Week 3 - Task 3: "this" & "static" — Bank Account (15 Marks)
 * 
 * Objective: Demonstrate the use of 'this' keyword to eliminate variable shadowing
 * and 'static' keyword to maintain a class-level account counter.
 * 
 * Explanation of "this" and "static":
 * 1. "this" Keyword:
 *    - Refers to the current object instance within a method or constructor.
 *    - Commonly used to differentiate instance variables from constructor/method parameters 
 *      when they share identical names (resolving variable shadowing).
 * 2. "static" Keyword:
 *    - Belongs to the class rather than individual object instances.
 *    - Memory for static variables is allocated once at class loading time and is 
 *      shared among all objects of that class.
 *    - Useful for global properties, shared counters, and utility methods that do not depend 
 *      on instance state.
 */

public class Task3 {

    // BankAccount class definition
    static class BankAccount {
        // Instance variables (unique to each object)
        private String accountHolderName;
        private long accountNumber;
        private double balance;

        // Static variable (shared among all objects of the class)
        public static int totalAccounts = 0;

        // Constructor using 'this' keyword
        public BankAccount(String accountHolderName, long accountNumber, double balance) {
            // 'this.variable' refers to the instance variable, while RHS is the parameter
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;

            // Increment shared static counter upon every account creation
            totalAccounts++;
        }

        // Method to display account details
        public void displayAccountDetails() {
            System.out.println("--------------------------------------------------");
            System.out.println("Account Number : " + this.accountNumber);
            System.out.println("Account Holder : " + this.accountHolderName);
            System.out.printf("Current Balance: Rs. %.2f%n", this.balance);
        }

        // Static method to display the total accounts created
        public static void displayTotalAccounts() {
            System.out.println("\n==================================================");
            System.out.println(">> Total Bank Accounts Created (static) : " + totalAccounts);
            System.out.println("==================================================");
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       TASK 3: 'this' & 'static' KEYWORDS         ");
        System.out.println("==================================================");

        // Creating 3 BankAccount objects
        BankAccount acc1 = new BankAccount("Aadarsh", 100123456789L, 50000.00);
        BankAccount acc2 = new BankAccount("Neha Singh", 100987654321L, 75500.50);
        BankAccount acc3 = new BankAccount("Vikas Sharma", 100555666777L, 32000.75);

        // Display individual account details
        System.out.println("ACCOUNT DETAILS:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        acc3.displayAccountDetails();

        // Display total accounts using class name (static access)
        BankAccount.displayTotalAccounts();
    }
}
