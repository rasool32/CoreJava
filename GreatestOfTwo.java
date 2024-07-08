//GREATEST OF TWO NUMBERS WITHOUT USING IF ELSE AND LOOPS
package Basics;
import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Take input for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Determine the greatest number
        int greatest = (num1 > num2) ? num1 : num2;

        // Display the result
        System.out.println("The greatest number is: " + greatest);

        // Close the scanner
        scanner.close();
    }
}

	



