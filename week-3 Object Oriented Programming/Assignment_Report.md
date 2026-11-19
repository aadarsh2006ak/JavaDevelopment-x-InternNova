# Week 3 Assignment: Object-Oriented Programming in Java
**Course / Internship:** Java Programming Internship (InternNova)  
**Student Name:** Aadarsh  
**College Name:** Ganga Institute of Technology & Management  
**Branch:** Computer Science & Engineering  
**Google Drive Source Code Link:** [PASTE_YOUR_GOOGLE_DRIVE_FOLDER_LINK_HERE]  

---

## Task 1: Classes & Objects — Student Management (15 Marks)

### Objective
Create a `Student` class with attributes (Name, Roll Number, Branch, CGPA), instantiate multiple objects (at least 3 students), and display their details in a structured format.

### Source Code (`Task1.java`)
```java
public class Task1 {

    static class Student {
        String name;
        int rollNumber;
        String branch;
        double cgpa;

        public void displayDetails(int index) {
            System.out.printf("| %-5d | %-12s | %-10d | %-28s | %-6.2f |%n", 
                index, name, rollNumber, branch, cgpa);
        }
    }

    public static void main(String[] args) {
        System.out.println("============================================================================");
        System.out.println("            TASK 1: CLASSES & OBJECTS - STUDENT MANAGEMENT                  ");
        System.out.println("============================================================================");

        Student s1 = new Student();
        s1.name = "Aadarsh";
        s1.rollNumber = 101;
        s1.branch = "Computer Science & Engg";
        s1.cgpa = 8.85;

        Student s2 = new Student();
        s2.name = "Priya Sharma";
        s2.rollNumber = 102;
        s2.branch = "Information Technology";
        s2.cgpa = 9.10;

        Student s3 = new Student();
        s3.name = "Rahul Verma";
        s3.rollNumber = 103;
        s3.branch = "Electronics & Comm";
        s3.cgpa = 8.40;

        System.out.println("+-------+--------------+------------+------------------------------+--------+");
        System.out.printf("| %-5s | %-12s | %-10s | %-28s | %-6s |%n", "S.No", "Name", "Roll No", "Branch", "CGPA");
        System.out.println("+-------+--------------+------------+------------------------------+--------+");
        s1.displayDetails(1);
        s2.displayDetails(2);
        s3.displayDetails(3);
        System.out.println("+-------+--------------+------------+------------------------------+--------+");
    }
}
```

### Output
```text
============================================================================
            TASK 1: CLASSES & OBJECTS - STUDENT MANAGEMENT                  
============================================================================
+-------+--------------+------------+------------------------------+--------+
| S.No  | Name         | Roll No    | Branch                       | CGPA   |
+-------+--------------+------------+------------------------------+--------+
| 1     | Aadarsh      | 101        | Computer Science & Engg      | 8.85   |
| 2     | Priya Sharma | 102        | Information Technology       | 9.10   |
| 3     | Rahul Verma  | 103        | Electronics & Comm           | 8.40   |
+-------+--------------+------------+------------------------------+--------+
```
*(Insert your terminal screenshot here)*

### Brief Explanation
A class is a blueprint from which individual objects are created. In this program, the `Student` class defines member fields (`name`, `rollNumber`, `branch`, `cgpa`) and a method `displayDetails()`. In `main()`, three distinct student objects are instantiated and their attributes are populated and printed in a neat table.

---

## Task 2: Constructors — Employee Information (15 Marks)

### Objective
Implement both default and parameterized constructors in an `Employee` class, create objects using both types, and display their information.

### Source Code (`Task2.java`)
```java
public class Task2 {

    static class Employee {
        int employeeId;
        String employeeName;
        String department;
        double salary;

        // 1. Default Constructor
        public Employee() {
            this.employeeId = 1000;
            this.employeeName = "Not Assigned";
            this.department = "General";
            this.salary = 25000.00;
        }

        // 2. Parameterized Constructor
        public Employee(int employeeId, String employeeName, String department, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.department = department;
            this.salary = salary;
        }

        public void displayDetails(String constructorType) {
            System.out.println("--------------------------------------------------");
            System.out.println("Constructor Type : " + constructorType);
            System.out.println("Employee ID      : " + employeeId);
            System.out.println("Employee Name    : " + employeeName);
            System.out.println("Department       : " + department);
            System.out.printf("Salary           : Rs. %.2f%n", salary);
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         TASK 2: CONSTRUCTORS PRACTICE            ");
        System.out.println("==================================================");

        Employee emp1 = new Employee();
        emp1.displayDetails("Default Constructor");

        Employee emp2 = new Employee(101, "Aadarsh", "Software Development", 75000.00);
        emp2.displayDetails("Parameterized Constructor");

        Employee emp3 = new Employee(102, "Rohit Mehra", "DevOps & Cloud", 82000.00);
        emp3.displayDetails("Parameterized Constructor");

        System.out.println("==================================================");
    }
}
```

### Output
```text
=================================================="
         TASK 2: CONSTRUCTORS PRACTICE            
=================================================="
--------------------------------------------------
Constructor Type : Default Constructor
Employee ID      : 1000
Employee Name    : Not Assigned
Department       : General
Salary           : Rs. 25000.00
--------------------------------------------------
Constructor Type : Parameterized Constructor
Employee ID      : 101
Employee Name    : Aadarsh
Department       : Software Development
Salary           : Rs. 75000.00
--------------------------------------------------
Constructor Type : Parameterized Constructor
Employee ID      : 102
Employee Name    : Rohit Mehra
Department       : DevOps & Cloud
Salary           : Rs. 82000.00
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation of Constructors
1. **Definition:** A constructor is a special block of code automatically invoked when an object is created with `new`. It shares the exact name of the class and has no return type.
2. **Default Constructor:** Has no parameters and initializes member variables with standard fallback/default values.
3. **Parameterized Constructor:** Accepts custom values as arguments at instantiation time, allowing distinct initial states for each object.

---

## Task 3: "this" & "static" — Bank Account (15 Marks)

### Objective
Create a `BankAccount` class utilizing the `this` keyword to differentiate instance variables from constructor parameters, and a `static` counter to track the total accounts created across all instances.

### Source Code (`Task3.java`)
```java
public class Task3 {

    static class BankAccount {
        private String accountHolderName;
        private long accountNumber;
        private double balance;

        public static int totalAccounts = 0;

        public BankAccount(String accountHolderName, long accountNumber, double balance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
            totalAccounts++;
        }

        public void displayAccountDetails() {
            System.out.println("--------------------------------------------------");
            System.out.println("Account Number : " + this.accountNumber);
            System.out.println("Account Holder : " + this.accountHolderName);
            System.out.printf("Current Balance: Rs. %.2f%n", this.balance);
        }

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

        BankAccount acc1 = new BankAccount("Aadarsh", 100123456789L, 50000.00);
        BankAccount acc2 = new BankAccount("Neha Singh", 100987654321L, 75500.50);
        BankAccount acc3 = new BankAccount("Vikas Sharma", 100555666777L, 32000.75);

        System.out.println("ACCOUNT DETAILS:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        acc3.displayAccountDetails();

        BankAccount.displayTotalAccounts();
    }
}
```

### Output
```text
==================================================
       TASK 3: 'this' & 'static' KEYWORDS         
==================================================
ACCOUNT DETAILS:
--------------------------------------------------
Account Number : 100123456789
Account Holder : Aadarsh
Current Balance: Rs. 50000.00
--------------------------------------------------
Account Number : 100987654321
Account Holder : Neha Singh
Current Balance: Rs. 75500.50
--------------------------------------------------
Account Number : 100555666777
Account Holder : Vikas Sharma
Current Balance: Rs. 32000.75

==================================================
>> Total Bank Accounts Created (static) : 3
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation of "this" and "static"
1. **"this" Keyword:** Refers to the current object instance within constructors and methods. It resolves ambiguity when parameter names match instance variable names (`this.balance = balance`).
2. **"static" Keyword:** Belongs to the class itself rather than individual instances. A single copy of memory is allocated and shared among all objects, making it ideal for counters, constants, and utility routines.

---

## Task 4: Inheritance — Employee Management (20 Marks)

### Objective
Demonstrate inheritance by creating a parent class `Employee` and two child classes `Developer` and `Manager` with specialized attributes and methods using `extends` and `super`.

### Source Code (`Task4.java`)
```java
public class Task4 {

    static class Employee {
        String name;
        int employeeId;
        double salary;

        public Employee(String name, int employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }

        public void displayBasicInfo() {
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name        : " + name);
            System.out.printf("Base Salary : Rs. %.2f%n", salary);
        }
    }

    static class Developer extends Employee {
        String programmingLanguage;
        String projectTitle;

        public Developer(String name, int employeeId, double salary, String programmingLanguage, String projectTitle) {
            super(name, employeeId, salary);
            this.programmingLanguage = programmingLanguage;
            this.projectTitle = projectTitle;
        }

        public void displayDeveloperDetails() {
            System.out.println("Role        : Software Developer");
            displayBasicInfo();
            System.out.println("Language    : " + programmingLanguage);
            System.out.println("Project     : " + projectTitle);
        }

        public void writeCode() {
            System.out.println("Action      : " + name + " is writing and optimizing " + programmingLanguage + " modules.");
        }
    }

    static class Manager extends Employee {
        int teamSize;
        String department;

        public Manager(String name, int employeeId, double salary, int teamSize, String department) {
            super(name, employeeId, salary);
            this.teamSize = teamSize;
            this.department = department;
        }

        public void displayManagerDetails() {
            System.out.println("Role        : Engineering Manager");
            displayBasicInfo();
            System.out.println("Department  : " + department);
            System.out.println("Team Size   : " + teamSize + " Engineers");
        }

        public void conductMeeting() {
            System.out.println("Action      : " + name + " is conducting a sprint planning meeting for " + department + ".");
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("           TASK 4: INHERITANCE PRACTICE           ");
        System.out.println("==================================================");

        Developer dev = new Developer("Aadarsh", 201, 75000.00, "Java & Spring Boot", "Banking Microservices");
        System.out.println("1. DEVELOPER DETAILS:");
        System.out.println("--------------------------------------------------");
        dev.displayDeveloperDetails();
        dev.writeCode();

        System.out.println("\n2. MANAGER DETAILS:");
        System.out.println("--------------------------------------------------");
        Manager mgr = new Manager("Ananya Roy", 101, 120000.00, 12, "Backend Architecture");
        mgr.displayManagerDetails();
        mgr.conductMeeting();

        System.out.println("==================================================");
    }
}
```

### Output
```text
==================================================
           TASK 4: INHERITANCE PRACTICE           
==================================================
1. DEVELOPER DETAILS:
--------------------------------------------------
Role        : Software Developer
Employee ID : 201
Name        : Aadarsh
Base Salary : Rs. 75000.00
Language    : Java & Spring Boot
Project     : Banking Microservices
Action      : Aadarsh is writing and optimizing Java & Spring Boot modules.

2. MANAGER DETAILS:
--------------------------------------------------
Role        : Engineering Manager
Employee ID : 101
Name        : Ananya Roy
Base Salary : Rs. 120000.00
Department  : Backend Architecture
Team Size   : 12 Engineers
Action      : Ananya Roy is conducting a sprint planning meeting for Backend Architecture.
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation of Inheritance
Inheritance is an OOP mechanism where a subclass derives common properties and methods from a superclass using the `extends` keyword. It promotes code reusability by avoiding code duplication. Subclasses can reuse superclass constructors via `super()` while introducing role-specific attributes (`programmingLanguage`, `teamSize`) and behaviors (`writeCode()`, `conductMeeting()`).

---

## Task 5: Polymorphism — Method Overloading & Overriding (20 Marks)

### Objective
Demonstrate both Compile-Time Polymorphism (Method Overloading) and Runtime Polymorphism (Method Overriding).

### Source Code (`Task5.java`)
```java
public class Task5 {

    static class Calculator {
        public int calculate(int a, int b) {
            System.out.print("calculate(int, int)       : ");
            return a + b;
        }

        public double calculate(double a, double b) {
            System.out.print("calculate(double, double) : ");
            return a * b;
        }

        public int calculate(int a, int b, int c) {
            System.out.print("calculate(int, int, int)  : ");
            return a + b + c;
        }
    }

    static class Vehicle {
        public void start() {
            System.out.println("Vehicle: General vehicle startup ignition sequence initiated.");
        }
    }

    static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Car    : Push-button start activated. Engine purring smoothly with AC on.");
        }
    }

    static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("Bike   : Self-start pressed. Two-wheeler engine revving with high torque.");
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("          TASK 5: POLYMORPHISM IN JAVA            ");
        System.out.println("==================================================");

        System.out.println("PART A: METHOD OVERLOADING (Compile-Time)");
        System.out.println("--------------------------------------------------");
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(15, 25));
        System.out.println(calc.calculate(4.5, 3.2));
        System.out.println(calc.calculate(10, 20, 30));

        System.out.println("\nPART B: METHOD OVERRIDING (Run-Time)");
        System.out.println("--------------------------------------------------");
        Vehicle v1 = new Vehicle();
        v1.start();

        Vehicle v2 = new Car();
        v2.start();

        Vehicle v3 = new Bike();
        v3.start();

        System.out.println("==================================================");
    }
}
```

### Output
```text
==================================================
          TASK 5: POLYMORPHISM IN JAVA            
==================================================
PART A: METHOD OVERLOADING (Compile-Time)
--------------------------------------------------
calculate(int, int)       : 40
calculate(double, double) : 14.4
calculate(int, int, int)  : 60

PART B: METHOD OVERRIDING (Run-Time)
--------------------------------------------------
Vehicle: General vehicle startup ignition sequence initiated.
Car    : Push-button start activated. Engine purring smoothly with AC on.
Bike   : Self-start pressed. Two-wheeler engine revving with high torque.
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation of Overloading and Overriding
1. **Method Overloading (Compile-Time / Static Polymorphism):** Occurs within the same class where multiple methods have the same name but different argument counts or parameter data types. The compiler resolves the exact method call based on passed argument signatures.
2. **Method Overriding (Runtime / Dynamic Polymorphism):** Occurs between parent and child classes where a subclass provides its own specific implementation of an inherited method with identical name and signature. At runtime, Java uses **Dynamic Method Dispatch** to execute the method belonging to the actual object instance.

---

## Task 6: Encapsulation & Abstraction — Banking System (15 Marks)

### Objective
Implement a banking system showcasing Encapsulation (private fields, public getters/setters, validation) and Abstraction (abstract class `Account` with an abstract method `calculateInterest()` and concrete method `displayAccountPolicy()`).

### Source Code (`Task6.java`)
```java
public class Task6 {

    static class BankAccount {
        private long accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(long accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = (initialBalance >= 0) ? initialBalance : 0.0;
        }

        public long getAccountNumber() { return accountNumber; }
        public void setAccountNumber(long accountNumber) { this.accountNumber = accountNumber; }

        public String getAccountHolderName() { return accountHolderName; }
        public void setAccountHolderName(String accountHolderName) {
            if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
                this.accountHolderName = accountHolderName;
            } else {
                System.out.println("Invalid name! Cannot set empty holder name.");
            }
        }

        public double getBalance() { return balance; }

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

    static abstract class Account {
        protected String accountType;
        protected double annualInterestRate;

        public Account(String accountType, double annualInterestRate) {
            this.accountType = accountType;
            this.annualInterestRate = annualInterestRate;
        }

        public abstract double calculateInterest(double principal, int years);

        public void displayAccountPolicy() {
            System.out.println("Account Type         : " + accountType);
            System.out.println("Annual Interest Rate : " + annualInterestRate + "% per annum");
            System.out.println("Policy Terms         : Governed by Reserve Bank of India regulations.");
        }
    }

    static class SavingsAccount extends Account {
        public SavingsAccount(double interestRate) {
            super("High-Yield Savings Account", interestRate);
        }

        @Override
        public double calculateInterest(double principal, int years) {
            double totalAmount = principal * Math.pow((1 + (annualInterestRate / 100.0)), years);
            return totalAmount - principal;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    TASK 6: ENCAPSULATION & ABSTRACTION DEMO      ");
        System.out.println("==================================================");

        System.out.println("PART 1: ENCAPSULATION DEMONSTRATION");
        System.out.println("--------------------------------------------------");
        BankAccount bankAcc = new BankAccount(987654321012L, "Aadarsh", 25000.00);

        System.out.println("Account Number : " + bankAcc.getAccountNumber());
        System.out.println("Account Holder : " + bankAcc.getAccountHolderName());
        System.out.printf("Initial Balance: Rs. %.2f%n", bankAcc.getBalance());

        System.out.println("\nTransaction Operations:");
        bankAcc.deposit(10000.00);
        bankAcc.withdraw(5000.00);
        bankAcc.withdraw(50000.00);

        System.out.println("\n--------------------------------------------------");
        System.out.println("PART 2: ABSTRACTION DEMONSTRATION");
        System.out.println("--------------------------------------------------");
        Account savings = new SavingsAccount(6.5);
        savings.displayAccountPolicy();

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
```

### Output
```text
==================================================
    TASK 6: ENCAPSULATION & ABSTRACTION DEMO      
==================================================
PART 1: ENCAPSULATION DEMONSTRATION
--------------------------------------------------
Account Number : 987654321012
Account Holder : Aadarsh
Initial Balance: Rs. 25000.00

Transaction Operations:
Deposited   : Rs. 10000.00 | New Balance: Rs. 35000.00
Withdrawn   : Rs. 5000.00 | Remaining Balance: Rs. 30000.00
Withdrawal failed! Insufficient funds or invalid amount.

--------------------------------------------------
PART 2: ABSTRACTION DEMONSTRATION
--------------------------------------------------
Account Type         : High-Yield Savings Account
Annual Interest Rate : 6.5% per annum
Policy Terms         : Governed by Reserve Bank of India regulations.

Interest Calculation on Account Balance:
Principal Amount     : Rs. 30000.00
Investment Tenure    : 3 Years
Interest Earned      : Rs. 6238.49
Maturity Amount      : Rs. 36238.49
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation of Encapsulation and Abstraction
1. **Encapsulation:** Protects internal data by making fields `private` and exposing public getter/setter and business methods (`deposit`, `withdraw`) with validation logic to safeguard object integrity.
2. **Abstraction:** Hides underlying implementation complexity and displays only necessary features. The abstract class `Account` defines a contract (`calculateInterest()`) without implementation details, forcing subclasses (`SavingsAccount`) to supply the concrete formula while sharing general methods (`displayAccountPolicy()`).
