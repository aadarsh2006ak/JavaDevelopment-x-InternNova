@echo off
title Week 3 Java Assignment Runner
:menu
cls
echo ====================================================
echo   WEEK 3: OBJECT-ORIENTED PROGRAMMING ASSIGNMENT
echo ====================================================
echo 1. Compile All Tasks
echo 2. Run Task 1 (Classes ^& Objects - Student Management)
echo 3. Run Task 2 (Constructors - Employee Information)
echo 4. Run Task 3 ("this" ^& "static" - Bank Account)
echo 5. Run Task 4 (Inheritance - Employee Management)
echo 6. Run Task 5 (Polymorphism - Overloading ^& Overriding)
echo 7. Run Task 6 (Encapsulation ^& Abstraction - Banking System)
echo 8. Exit
echo ====================================================
set /p choice="Choose an option [1-8]: "

if "%choice%"=="1" goto compile
if "%choice%"=="2" goto run1
if "%choice%"=="3" goto run2
if "%choice%"=="4" goto run3
if "%choice%"=="5" goto run4
if "%choice%"=="6" goto run5
if "%choice%"=="7" goto run6
if "%choice%"=="8" exit

:compile
cls
echo Compiling all Week 3 tasks...
javac Task1.java Task2.java Task3.java Task4.java Task5.java Task6.java
if %errorlevel% equ 0 (
    echo [SUCCESS] All tasks compiled with 0 errors!
) else (
    echo [ERROR] Compilation failed. Please check error messages above.
)
pause
goto menu

:run1
cls
java Task1
echo.
pause
goto menu

:run2
cls
java Task2
echo.
pause
goto menu

:run3
cls
java Task3
echo.
pause
goto menu

:run4
cls
java Task4
echo.
pause
goto menu

:run5
cls
java Task5
echo.
pause
goto menu

:run6
cls
java Task6
echo.
pause
goto menu
