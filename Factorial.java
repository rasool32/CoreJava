package Basics;

import java.util.Scanner;

public class Factorial {

    /**
     * This method calculates the factorial of a given non-negative integer n.
     * 
     * @param n The number to calculate the factorial of.
     * @return The factorial of the number n.
     * @throws IllegalArgumentException if the number is negative.
     */
    public static long factorial(int n) {
        // Validate the input
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        
        // Read the input number
        int number = scanner.nextInt();

        try {
            // Calculate the factorial of the number
            long result = factorial(number);

            // Output the result
            System.out.println("The factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            // Handle invalid input
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }
}

