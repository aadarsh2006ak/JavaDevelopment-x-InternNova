# Week 2 Assignment: Control Flow & Methods
**Course / Internship:** Java Programming Internship (InternNova)  
**Student Name:** Aadarsh  
**College Name:** Ganga Institute of Technology & Management  
**Branch:** Computer Science & Engineering  
**Google Drive Source Code Link:** [PASTE_YOUR_GOOGLE_DRIVE_FOLDER_LINK_HERE]  

---

## Task 1: Conditional Statements — Student Result (15 Marks)

### Objective
Accept student name and marks in 3 subjects, calculate total marks and percentage, and determine the result using conditional statements (`if-else if-else`).

### Source Code (`Task1.java`)
```java
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("       TASK 1: STUDENT RESULT CALCULATOR          ");
        System.out.println("==================================================");

        System.out.print("Enter Student Name           : ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Marks in Subject 1 (0-100): ");
        double sub1 = scanner.nextDouble();

        System.out.print("Enter Marks in Subject 2 (0-100): ");
        double sub2 = scanner.nextDouble();

        System.out.print("Enter Marks in Subject 3 (0-100): ");
        double sub3 = scanner.nextDouble();

        double totalMarks = sub1 + sub2 + sub3;
        double percentage = (totalMarks / 300.0) * 100.0;

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
```

### Output
```text
==================================================
       TASK 1: STUDENT RESULT CALCULATOR          
==================================================
Enter Student Name           : Aadarsh
Enter Marks in Subject 1 (0-100): 85
Enter Marks in Subject 2 (0-100): 90
Enter Marks in Subject 3 (0-100): 80

--------------------------------------------------
                 STUDENT REPORT CARD              
--------------------------------------------------
Student Name : Aadarsh
Total Marks  : 255.00 / 300.00
Percentage   : 85.00%
Result       : PASS - Distinction
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation
This program uses the `Scanner` class to read a student's name and marks across three subjects, computes total marks and overall percentage, and applies an `if-else if-else` ladder to validate marks and classify the final result (Distinction, Divisions, or Fail).

---

## Task 2: Loops — Number Practice (20 Marks)

### Objective
Use `for`, `while`, and `do-while` loops to print numbers from 1 to 100, even numbers between 1 and 100, odd numbers between 1 and 100, and calculate their total sum.

### Source Code (`Task2.java`)
```java
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
                System.out.println();
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

        // 4. Calculate the sum of numbers from 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("4. Sum of numbers from 1 to 100 = " + sum);
        System.out.println("==================================================");
    }
}
```

### Output
```text
==================================================
            TASK 2: LOOPS NUMBER PRACTICE         
==================================================

1. Numbers from 1 to 100 (for loop):
--------------------------------------------------
   1   2   3   4   5   6   7   8   9  10
  11  12  13  14  15  16  17  18  19  20
...
  91  92  93  94  95  96  97  98  99 100

2. Even numbers between 1 and 100 (while loop):
--------------------------------------------------
   2   4   6   8  10  12  14  16  18  20
...
  82  84  86  88  90  92  94  96  98 100

3. Odd numbers between 1 and 100 (do-while loop):
--------------------------------------------------
   1   3   5   7   9  11  13  15  17  19
...
  81  83  85  87  89  91  93  95  97  99

--------------------------------------------------
4. Sum of numbers from 1 to 100 = 5050
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation
This program demonstrates all three loop constructs in Java: a `for` loop prints 1–100 and accumulates their sum (`5050`), a `while` loop prints all even numbers up to 100, and a `do-while` loop prints all odd numbers up to 100, formatted neatly in 10-column grids.

---

## Task 3: Methods — Calculator (20 Marks)

### Objective
Implement a calculator program using separate methods for Addition, Subtraction, Multiplication, Division, and Modulus, invoked based on user input.

### Source Code (`Task3.java`)
```java
import java.util.Scanner;

public class Task3 {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }
    public static double modulus(double a, double b) { return a % b; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("        TASK 3: METHOD-BASED CALCULATOR           ");
        System.out.println("==================================================");

        System.out.print("Enter first number  : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = scanner.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Perform All Operations");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        System.out.println("\n--------------------------------------------------");
        System.out.println("                     RESULTS                      ");
        System.out.println("--------------------------------------------------");

        switch (choice) {
            case 1:
                System.out.println("Addition       : " + num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case 2:
                System.out.println("Subtraction    : " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Multiplication : " + num1 + " * " + num2 + " = " + multiply(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division       : " + num1 + " / " + num2 + " = " + divide(num1, num2));
                } else {
                    System.out.println("Division       : Error (Cannot divide by zero)");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Modulus        : " + num1 + " % " + num2 + " = " + modulus(num1, num2));
                } else {
                    System.out.println("Modulus        : Error (Cannot find modulus by zero)");
                }
                break;
            case 6:
                System.out.println("Addition       : " + num1 + " + " + num2 + " = " + add(num1, num2));
                System.out.println("Subtraction    : " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                System.out.println("Multiplication : " + num1 + " * " + num2 + " = " + multiply(num1, num2));
                if (num2 != 0) {
                    System.out.println("Division       : " + num1 + " / " + num2 + " = " + divide(num1, num2));
                    System.out.println("Modulus        : " + num1 + " % " + num2 + " = " + modulus(num1, num2));
                } else {
                    System.out.println("Division       : Error (Cannot divide by zero)");
                    System.out.println("Modulus        : Error (Cannot find modulus by zero)");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 and 6.");
        }

        System.out.println("==================================================");
        scanner.close();
    }
}
```

### Output
```text
==================================================
        TASK 3: METHOD-BASED CALCULATOR           
==================================================
Enter first number  : 25
Enter second number : 4

Choose an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Modulus (%)
6. Perform All Operations
Enter your choice (1-6): 6

--------------------------------------------------
                     RESULTS                      
--------------------------------------------------
Addition       : 25.0 + 4.0 = 29.0
Subtraction    : 25.0 - 4.0 = 21.0
Multiplication : 25.0 * 4.0 = 100.0
Division       : 25.0 / 4.0 = 6.25
Modulus        : 25.0 % 4.0 = 1.0
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation
This program encapsulates each arithmetic operation (`add`, `subtract`, `multiply`, `divide`, `modulus`) into its own reusable `static` method and uses a `switch` statement to invoke the selected operation (or all operations) safely with division-by-zero checks.

---

## Task 4: Method Parameters & Return Types (15 Marks)

### Objective
Create parameterized methods that return the square of a number, cube of a number, average of three numbers, and maximum of two numbers.

### Source Code (`Task4.java`)
```java
import java.util.Scanner;

public class Task4 {
    public static double findSquare(double num) {
        return num * num;
    }

    public static double findCube(double num) {
        return num * num * num;
    }

    public static double findAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static double findMaximum(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("    TASK 4: METHOD PARAMETERS & RETURN TYPES      ");
        System.out.println("==================================================");

        System.out.print("Enter a number for Square & Cube : ");
        double num = scanner.nextDouble();

        System.out.print("Enter 3 numbers for Average      : ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        System.out.print("Enter 2 numbers for Maximum      : ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double squareResult = findSquare(num);
        double cubeResult = findCube(num);
        double avgResult = findAverage(n1, n2, n3);
        double maxResult = findMaximum(x, y);

        System.out.println("\n--------------------------------------------------");
        System.out.println("                 METHOD RESULTS                   ");
        System.out.println("--------------------------------------------------");
        System.out.printf("Square of %.2f              : %.2f%n", num, squareResult);
        System.out.printf("Cube of %.2f                : %.2f%n", num, cubeResult);
        System.out.printf("Average of (%.1f, %.1f, %.1f) : %.2f%n", n1, n2, n3, avgResult);
        System.out.printf("Maximum of (%.1f, %.1f)       : %.2f%n", x, y, maxResult);
        System.out.println("==================================================");

        scanner.close();
    }
}
```

### Output
```text
==================================================
    TASK 4: METHOD PARAMETERS & RETURN TYPES      
==================================================
Enter a number for Square & Cube : 5
Enter 3 numbers for Average      : 10 20 30
Enter 2 numbers for Maximum      : 45 78

--------------------------------------------------
                 METHOD RESULTS                   
--------------------------------------------------
Square of 5.00              : 25.00
Cube of 5.00                : 125.00
Average of (10.0, 20.0, 30.0) : 20.00
Maximum of (45.0, 78.0)       : 78.00
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation
This program defines four methods (`findSquare`, `findCube`, `findAverage`, `findMaximum`) demonstrating different parameter counts (1, 2, and 3 parameters) and `double` return types, storing each returned value in `main` before printing.

---

## Task 5: 1D Array — Student Marks (15 Marks)

### Objective
Store marks of 5 students in a 1D array, display all marks, and calculate total, average, highest, and lowest marks.

### Source Code (`Task5.java`)
```java
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("==================================================");
        System.out.println("        TASK 5: 1D ARRAY - STUDENT MARKS          ");
        System.out.println("==================================================");

        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("  Student " + (i + 1) + " marks : ");
            marks[i] = scanner.nextInt();
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        System.out.println("\n--------------------------------------------------");
        System.out.println("               ENTERED STUDENT MARKS              ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " : " + marks[i]);
            total += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / marks.length;

        System.out.println("\n--------------------------------------------------");
        System.out.println("               MARKS STATISTICS                   ");
        System.out.println("--------------------------------------------------");
        System.out.println("Total Marks   : " + total);
        System.out.printf("Average Marks : %.2f%n", average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);
        System.out.println("==================================================");

        scanner.close();
    }
}
```

### Output
```text
==================================================
        TASK 5: 1D ARRAY - STUDENT MARKS          
==================================================
Enter marks for 5 students:
  Student 1 marks : 78
  Student 2 marks : 85
  Student 3 marks : 92
  Student 4 marks : 64
  Student 5 marks : 88

--------------------------------------------------
               ENTERED STUDENT MARKS              
--------------------------------------------------
Student 1 : 78
Student 2 : 85
Student 3 : 92
Student 4 : 64
Student 5 : 88

--------------------------------------------------
               MARKS STATISTICS                   
--------------------------------------------------
Total Marks   : 407
Average Marks : 81.40
Highest Marks : 92
Lowest Marks  : 64
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation
This program uses a 1D integer array of size 5 to store student marks via a `for` loop, traverses the array to print each entry, and simultaneously computes the sum, floating-point average, maximum, and minimum values.

---

## Task 6: 2D Array — Matrix Operations (15 Marks)

### Objective
Store a 3 × 3 matrix using a 2D array, take user inputs, display the matrix in a structured grid format, and calculate the sum of all elements.

### Source Code (`Task6.java`)
```java
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        System.out.println("==================================================");
        System.out.println("       TASK 6: 2D ARRAY - 3x3 MATRIX              ");
        System.out.println("==================================================");

        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("  Element [" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        System.out.println("\n--------------------------------------------------");
        System.out.println("               3x3 MATRIX DISPLAY                 ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < rows; i++) {
            System.out.print("  | ");
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d ", matrix[i][j]);
                sum += matrix[i][j];
            }
            System.out.println(" |");
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("Sum of all matrix elements = " + sum);
        System.out.println("==================================================");

        scanner.close();
    }
}
```

### Output
```text
==================================================
       TASK 6: 2D ARRAY - 3x3 MATRIX              
==================================================
Enter elements for a 3x3 matrix:
  Element [0][0] : 1
  Element [0][1] : 2
  Element [0][2] : 3
  Element [1][0] : 4
  Element [1][1] : 5
  Element [1][2] : 6
  Element [2][0] : 7
  Element [2][1] : 8
  Element [2][2] : 9

--------------------------------------------------
               3x3 MATRIX DISPLAY                 
--------------------------------------------------
  |    1    2    3  |
  |    4    5    6  |
  |    7    8    9  |

--------------------------------------------------
Sum of all matrix elements = 45
==================================================
```
*(Insert your terminal screenshot here)*

### Brief Explanation
This program declares a `3×3` two-dimensional array (`int[3][3]`) and uses nested `for` loops—outer loop for rows and inner loop for columns—to populate elements, format the grid output, and sum all 9 elements.

