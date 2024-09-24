//SMALLEST OF TWO NUMBERS WITHOUT USING IF ELSE AND LOOPS
package Basics;

import java.util.Scanner;

public class SmallestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        // Take input for the second number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Determine the smallest number
        int smallest = (num1 < num2) ? num1 : num2;

        // Display the result
        System.out.println("The smallest number is: " + smallest);

        // Close the sc
        sc.close();
    }
}

	



