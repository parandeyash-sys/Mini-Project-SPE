package org.example;

import java.util.Scanner;

public class ScientificCalculator {
    private Scanner scanner;

    public ScientificCalculator() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = getChoice();
            
            if (choice == 9) {
                System.out.println("Exiting calculator. Goodbye!!! ");
                break;
            }
            
            processChoice(choice);
            System.out.println();
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("=== Scientific Calculator ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Square Root (√x)");
        System.out.println("6. Factorial (x!)");
        System.out.println("7. Natural Logarithm (ln(x))");
        System.out.println("8. Power (x^b)");
        System.out.println("9. Exit");
        System.out.print("Enter your choice (1-9): ");
    }

    private int getChoice() {
        while (true) {
            try {
                if (!scanner.hasNextInt()) {
                    if (!scanner.hasNext()) {
                        // No input stream available (like in Docker without -it)
                        System.out.println("No input available. Waiting...");
                        try {
                            Thread.sleep(20000);
                        } catch (InterruptedException e) {
                            return 9; // exit safely
                        }
                        continue;
                    }

                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // clear invalid token
                    continue;
                }

                int choice = scanner.nextInt();

                if (choice < 1 || choice > 9) {
                    System.out.println("Invalid choice. Please enter 1-9.");
                    continue;
                }

                return choice;

            } catch (Exception e) {
                System.out.println("Unexpected error. Retrying...");
            }
        }
    }

    private void processChoice(int choice) {
        switch (choice) {
            case 1:
                calculateAddition();
                break;
            case 2:
                calculateSubtraction();
                break;
            case 3:
                calculateMultiplication();
                break;
            case 4:
                calculateDivision();
                break;
            case 5:
                calculateSquareRoot();
                break;
            case 6:
                calculateFactorial();
                break;
            case 7:
                calculateNaturalLogarithm();
                break;
            case 8:
                calculatePower();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void calculateAddition() {
        System.out.print("Enter first number: ");
        try {
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 + num2;
            System.out.printf("%.4f + %.4f = %.4f%n", num1, num2, result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private void calculateSubtraction() {
        System.out.print("Enter first number: ");
        try {
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 - num2;
            System.out.printf("%.4f - %.4f = %.4f%n", num1, num2, result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private void calculateMultiplication() {
        System.out.print("Enter first number: ");
        try {
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = num1 * num2;
            System.out.printf("%.4f * %.4f = %.4f%n", num1, num2, result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private void calculateDivision() {
        System.out.print("Enter numerator: ");
        try {
            double num1 = scanner.nextDouble();
            System.out.print("Enter denominator: ");
            double num2 = scanner.nextDouble();
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double result = num1 / num2;
                System.out.printf("%.4f / %.4f = %.4f%n", num1, num2, result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private void calculateSquareRoot() {
        System.out.print("Enter a number: ");
        try {
            double number = scanner.nextDouble();
            if (number < 0) {
                System.out.println("Error: Cannot calculate square root of a negative number.");
            } else {
                double result = Math.sqrt(number);
                System.out.printf("√%.4f = %.4f%n", number, result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private void calculateFactorial() {
        System.out.print("Enter a non-negative integer: ");
        try {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else if (number > 20) {
                System.out.println("Error: Factorial of numbers greater than 20 may cause overflow.");
            } else {
                long result = factorial(number);
                System.out.printf("%d! = %d%n", number, result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private void calculateNaturalLogarithm() {
        System.out.print("Enter a positive number: ");
        try {
            double number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Error: Natural logarithm is only defined for positive numbers.");
            } else {
                double result = Math.log(number);
                System.out.printf("ln(%.4f) = %.4f%n", number, result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private void calculatePower() {
        System.out.print("Enter the base (x): ");
        try {
            double base = scanner.nextDouble();
            System.out.print("Enter the exponent (b): ");
            double exponent = scanner.nextDouble();
            
            double result = Math.pow(base, exponent);
            System.out.printf("%.4f^%.4f = %.4f%n", base, exponent, result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            scanner.nextLine(); // Clear the invalid input
        }
    }
}
