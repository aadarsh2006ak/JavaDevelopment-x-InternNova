# Week 1 Assignment: Java Fundamentals
**Course / Internship:** Java Programming Internship (Nova)  
**Student Name:** Aadarsh  
**College Name:** Ganga Institute of Technology & Management  
**Branch:** Computer Science & Engineering  
**Google Drive Source Code Link:** [PASTE_YOUR_GOOGLE_DRIVE_FOLDER_LINK_HERE]  

---

## Task 1: Java Setup & Hello World (10 Marks)

### Objective
Create a first Java program to display Name, College Name, Branch, and a Welcome Message.

### Source Code (`Task1.java`)
```java
/**
 * Task 1: Java Setup & Hello World (10 Marks)
 * Objective: Display personal details and a welcome message.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("            TASK 1: HELLO WORLD & DETAILS         ");
        System.out.println("==================================================");
        System.out.println("Name            : Aadarsh");
        System.out.println("College Name    : Ganga Institute of Technology & Management");
        System.out.println("Branch          : Computer Science & Engineering");
        System.out.println("--------------------------------------------------");
        System.out.println("Welcome Message : Welcome to Java Programming & Internship!");
        System.out.println("==================================================");
    }
}
```

### Output
```text
==================================================
            TASK 1: HELLO WORLD & DETAILS         
==================================================
Name            : Aadarsh
College Name    : Ganga Institute of Technology & Management
Branch          : Computer Science & Engineering
--------------------------------------------------
Welcome Message : Welcome to Java Programming & Internship!
==================================================
```
*(Insert your terminal screenshot here)*

---

## Task 2: Variables & Data Types (20 Marks)

### Objective
Declare and display variables with appropriate data types: Name (`String`), Age (`int`), Height (`double`), Weight (`double`), CGPA (`double`), Gender (`char`), and Is Student (`boolean`).

### Source Code (`Task2.java`)
```java
/**
 * Task 2: Variables & Data Types (20 Marks)
 * Objective: Store and display personal information using appropriate Java data types.
 */
public class Task2 {
    public static void main(String[] args) {
        String name = "Aadarsh";              // String for text
        int age = 20;                        // int for whole numbers
        double height = 5.9;                 // double for decimal height
        double weight = 65.5;                // double for decimal weight
        double cgpa = 8.75;                  // double for decimal grades
        char gender = 'M';                   // char for single character
        boolean isStudent = true;            // boolean for true/false

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
```

### Output
```text
==================================================
         TASK 2: VARIABLES & DATA TYPES           
==================================================
Name       (String)  : Aadarsh
Age        (int)     : 20 years
Height     (double)  : 5.9 ft
Weight     (double)  : 65.5 kg
CGPA       (double)  : 8.75
Gender     (char)    : M
Is Student (boolean) : true
==================================================
```
*(Insert your terminal screenshot here)*

---

## Task 3: Input & Output using Scanner Class (20 Marks)

### Objective
Accept Full Name, Age, College Name, Branch, and City from user input using the `Scanner` class and display in a well-formatted summary.

### Source Code (`Task3.java`)
```java
import java.util.Scanner;

/**
 * Task 3: Input & Output using Scanner Class (20 Marks)
 * Objective: Accept user details using Scanner and display in formatted manner.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("   TASK 3: USER INPUT VIA SCANNER CLASS           ");
        System.out.println("==================================================");

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
```

### Output
```text
==================================================
   TASK 3: USER INPUT VIA SCANNER CLASS           
==================================================
Enter your Full Name    : Aadarsh
Enter your Age          : 20
Enter your College Name : Ganga Institute of Technology & Management
Enter your Branch       : Computer Science & Engineering
Enter your City         : Jhajjar / Delhi NCR

--------------------------------------------------
              ENTERED DETAILS SUMMARY             
--------------------------------------------------
Full Name    : Aadarsh
Age          : 20
College Name : Ganga Institute of Technology & Management
Branch       : Computer Science & Engineering
City         : Jhajjar / Delhi NCR
==================================================
```
*(Insert your terminal screenshot here)*

---

## Task 4: Operators Practice (20 Marks)

### Objective
Create a calculator program to perform Addition, Subtraction, Multiplication, Division, and Modulus on two numbers provided by the user.

### Source Code (`Task4.java`)
```java
import java.util.Scanner;

/**
 * Task 4: Operators Practice (20 Marks)
 * Objective: Arithmetic Calculator performing +, -, *, /, % on two numbers.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("          TASK 4: ARITHMETIC OPERATORS            ");
        System.out.println("==================================================");

        System.out.print("Enter first number  : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        System.out.println("\n--------------------------------------------------");
        System.out.println("                CALCULATION RESULTS               ");
        System.out.println("--------------------------------------------------");
        System.out.println("Addition       (" + num1 + " + " + num2 + ") = " + sum);
        System.out.println("Subtraction    (" + num1 + " - " + num2 + ") = " + diff);
        System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + prod);

        if (num2 != 0) {
            double div = num1 / num2;
            double mod = num1 % num2;
            System.out.println("Division       (" + num1 + " / " + num2 + ") = " + div);
            System.out.println("Modulus        (" + num1 + " % " + num2 + ") = " + mod);
        } else {
            System.out.println("Division       : Error (Division by zero is not allowed)");
            System.out.println("Modulus        : Error (Modulo by zero is not allowed)");
        }
        System.out.println("==================================================");

        scanner.close();
    }
}
```

### Output
```text
==================================================
          TASK 4: ARITHMETIC OPERATORS            
==================================================
Enter first number  : 25
Enter second number : 4

--------------------------------------------------
                CALCULATION RESULTS               
--------------------------------------------------
Addition       (25.0 + 4.0) = 29.0
Subtraction    (25.0 - 4.0) = 21.0
Multiplication (25.0 * 4.0) = 100.0
Division       (25.0 / 4.0) = 6.25
Modulus        (25.0 % 4.0) = 1.0
==================================================
```
*(Insert your terminal screenshot here)*

---

## Task 5: Type Casting (15 Marks)

### Objective
Demonstrate Implicit (Widening) and Explicit (Narrowing) Type Casting in Java, display values before and after casting, and provide a short explanation.

### Source Code (`Task5.java`)
```java
/**
 * Task 5: Type Casting (15 Marks)
 * Objective: Demonstrate Implicit and Explicit Type Casting in Java.
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("            TASK 5: TYPE CASTING IN JAVA          ");
        System.out.println("==================================================");

        // 1. Implicit Type Casting (Widening: int -> double)
        int intVal = 100;
        double implicitDoubleVal = intVal; // Automatic

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
```

### Output
```text
==================================================
            TASK 5: TYPE CASTING IN JAVA          
==================================================
1. IMPLICIT CASTING (Widening):
   Original value (int)    : 100
   Casted value (double)   : 100.0
   Note: Automatic conversion without data loss.

2. EXPLICIT CASTING (Narrowing):
   Original value (double) : 99.78
   Casted value (int)      : 99
   Note: Fractional part is truncated (data loss).
==================================================
```
*(Insert your terminal screenshot here)*

### Short Explanation (Difference between Implicit & Explicit Type Casting)
1. **Implicit Type Casting (Widening):** This conversion happens automatically by the Java compiler when converting a smaller data type into a larger data type (e.g., `int` to `double`). Since the destination type has a larger memory size, there is **zero loss of data**.
2. **Explicit Type Casting (Narrowing):** This conversion must be performed manually by the programmer using a cast operator `(type)` when converting a larger data type to a smaller data type (e.g., `double` to `int`). Because smaller data types cannot hold the full precision or range, it can result in **data loss or fractional truncation**.

---

## Task 6: Java Fundamentals Practice (15 Marks)

### Objective
Accept `int`, `float`, and `double` values from user input, perform both implicit and explicit type conversions, print values before and after casting, and explain where type casting is commonly applied.

### Source Code (`Task6.java`)
```java
import java.util.Scanner;

/**
 * Task 6: Java Fundamentals Practice (15 Marks)
 * Objective: User input with implicit and explicit type casting.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("    TASK 6: USER INPUT & TYPE CASTING PRACTICE    ");
        System.out.println("==================================================");

        System.out.print("Enter an integer value (e.g., 25)    : ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a float value (e.g., 14.5)     : ");
        float userFloat = scanner.nextFloat();

        System.out.print("Enter a double value (e.g., 89.9876) : ");
        double userDouble = scanner.nextDouble();

        System.out.println("\n--------------------------------------------------");
        System.out.println("               ORIGINAL INPUT VALUES              ");
        System.out.println("--------------------------------------------------");
        System.out.println("Integer value : " + userInt);
        System.out.println("Float value   : " + userFloat);
        System.out.println("Double value  : " + userDouble);

        // 1. Implicit Type Casting (Widening)
        double intToDouble = userInt;
        double floatToDouble = userFloat;

        System.out.println("\n--------------------------------------------------");
        System.out.println("          IMPLICIT CASTING (WIDENING)             ");
        System.out.println("--------------------------------------------------");
        System.out.println("int (" + userInt + ") -> double                 : " + intToDouble);
        System.out.println("float (" + userFloat + ") -> double             : " + floatToDouble);

        // 2. Explicit Type Casting (Narrowing)
        int doubleToInt = (int) userDouble;
        int floatToInt = (int) userFloat;

        System.out.println("\n--------------------------------------------------");
        System.out.println("          EXPLICIT CASTING (NARROWING)            ");
        System.out.println("--------------------------------------------------");
        System.out.println("double (" + userDouble + ") -> int (explicit) : " + doubleToInt);
        System.out.println("float (" + userFloat + ") -> int (explicit)   : " + floatToInt);
        System.out.println("==================================================");

        scanner.close();
    }
}
```

### Output
```text
==================================================
    TASK 6: USER INPUT & TYPE CASTING PRACTICE    
==================================================
Enter an integer value (e.g., 25)    : 50
Enter a float value (e.g., 14.5)     : 12.5
Enter a double value (e.g., 89.9876) : 99.87

--------------------------------------------------
               ORIGINAL INPUT VALUES              
--------------------------------------------------
Integer value : 50
Float value   : 12.5
Double value  : 99.87

--------------------------------------------------
          IMPLICIT CASTING (WIDENING)             
--------------------------------------------------
int (50) -> double                 : 50.0
float (12.5) -> double             : 12.5

--------------------------------------------------
          EXPLICIT CASTING (NARROWING)            
--------------------------------------------------
double (99.87) -> int (explicit) : 99
float (12.5) -> int (explicit)   : 12
==================================================
```
*(Insert your terminal screenshot here)*

### Short Note (Where Type Casting is Commonly Used in Java)
1. **Mathematical Calculations & Arithmetic Precision:** Type casting is essential when dividing two integers to get a decimal output (e.g., `(double) a / b`), preventing integer truncation.
2. **Standard Library & Math Methods:** Methods like `Math.random()`, `Math.sqrt()`, or `Math.round()` return floating-point types (`double` / `long`) and often need explicit casting to fit into `int` variables.
3. **Object-Oriented Programming (Polymorphism):** Downcasting is used when handling objects stored in superclass or interface references (e.g., casting `Object` to a specific domain class).
4. **Data Handling & API Integration:** When parsing API payloads, database columns, or collections where numeric data arrives as generic types, casting ensures compatibility with target primitive variables.
