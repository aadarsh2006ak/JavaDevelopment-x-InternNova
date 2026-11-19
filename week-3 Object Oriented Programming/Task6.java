/**
 * Week 3 - Task 6: Encapsulation & Abstraction — Banking System (15 Marks)
 * 
 * Objective: Implement a banking system demonstrating Encapsulation (data hiding
 * via private fields and public getters/setters) and Abstraction (abstract classes
 * and abstract methods).
 * 
 * Explanation of Encapsulation & Abstraction:
 * 1. Encapsulation:
 *    - The bundling of data (fields) and methods that operate on that data into a single unit.
 *    - Data hiding is achieved by declaring fields as 'private' and providing controlled 
 *      access via 'public' getter and setter methods with validation checks.
 * 2. Abstraction:
 *    - The process of hiding internal implementation details and showing only essential 
 *      features to the user.
 *    - In Java, abstraction is achieved via abstract classes (0-100% abstraction) and interfaces (100%).
 *    - An abstract class cannot be instantiated directly and serves as a template for subclasses.
 */

public class Task6 {

    // =========================================================================
    // SECTION 1: ENCAPSULATION DEMONSTRATION
    // =========================================================================
    static class BankAccount {
        // Private variables (data hiding)
        private long accountNumber;
        private String accountHolderName;
        private double balance;

        // Constructor
        public BankAccount(long accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0.0;
            }
        }

        // Getters and Setters with validation
        public long getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public void setAccountHolderName(String accountHolderName) {
            if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
                this.accountHolderName = accountHolderName;
            } else {
                System.out.println("Invalid name! Cannot set empty holder name.");
            }
        }

        public double getBalance() {
            return balance;
        }

        // Controlled modification of balance through business methods
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.printf("Deposited   : Rs. %.2f | New Balance: Rs. %.2f%n", amount, this.balance);
            } else {
                System.out.println("Deposit failed! Amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= this.balance) {
                this.balance -= amount;
                System.out.printf("Withdrawn   : Rs. %.2f | Remaining Balance: Rs. %.2f%n", amount, this.balance);
            } else {
                System.out.println("Withdrawal failed! Insufficient funds or invalid amount.");
            }
        }
    }

    // =========================================================================
    // SECTION 2: ABSTRACTION DEMONSTRATION
    // =========================================================================
    // Abstract Class
    static abstract class Account {
        protected String accountType;
        protected double annualInterestRate;

        public Account(String accountType, double annualInterestRate) {
            this.accountType = accountType;
            this.annualInterestRate = annualInterestRate;
        }

        // 1. Abstract method (no implementation in parent class)
        public abstract double calculateInterest(double principal, int years);

        // 2. Concrete/Normal method (shared implementation)
        public void displayAccountPolicy() {
            System.out.println("Account Type         : " + accountType);
            System.out.println("Annual Interest Rate : " + annualInterestRate + "% per annum");
            System.out.println("Policy Terms         : Governed by Reserve Bank of India regulations.");
        }
    }

    // Concrete subclass implementing the abstract method
    static class SavingsAccount extends Account {

        public SavingsAccount(double interestRate) {
            super("High-Yield Savings Account", interestRate);
        }

        // Implementing the abstract method
        @Override
        public double calculateInterest(double principal, int years) {
            // Compound interest formula: A = P(1 + r/100)^t - P
            double totalAmount = principal * Math.pow((1 + (annualInterestRate / 100.0)), years);
            return totalAmount - principal;
        }
    }

    // =========================================================================
    // MAIN DRIVER METHOD
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    TASK 6: ENCAPSULATION & ABSTRACTION DEMO      ");
        System.out.println("==================================================");

        // 1. Encapsulation Demo
        System.out.println("PART 1: ENCAPSULATION DEMONSTRATION");
        System.out.println("--------------------------------------------------");
        BankAccount bankAcc = new BankAccount(987654321012L, "Aadarsh", 25000.00);

        System.out.println("Account Number : " + bankAcc.getAccountNumber());
        System.out.println("Account Holder : " + bankAcc.getAccountHolderName());
        System.out.printf("Initial Balance: Rs. %.2f%n", bankAcc.getBalance());

        // Demonstrating controlled modification
        System.out.println("\nTransaction Operations:");
        bankAcc.deposit(10000.00);
        bankAcc.withdraw(5000.00);
        bankAcc.withdraw(50000.00); // Invalid withdrawal test

        // 2. Abstraction Demo
        System.out.println("\n--------------------------------------------------");
        System.out.println("PART 2: ABSTRACTION DEMONSTRATION");
        System.out.println("--------------------------------------------------");
        Account savings = new SavingsAccount(6.5);
        savings.displayAccountPolicy(); // Concrete method call

        double principal = bankAcc.getBalance();
        int tenureYears = 3;
        double interestEarned = savings.calculateInterest(principal, tenureYears);

        System.out.println("\nInterest Calculation on Account Balance:");
        System.out.printf("Principal Amount     : Rs. %.2f%n", principal);
        System.out.println("Investment Tenure    : " + tenureYears + " Years");
        System.out.printf("Interest Earned      : Rs. %.2f%n", interestEarned);
        System.out.printf("Maturity Amount      : Rs. %.2f%n", (principal + interestEarned));
        System.out.println("==================================================");
    }
}
