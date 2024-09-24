package Basics;

import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        // Input string like "a2b3c4"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string (e.g., a2b3c4): ");
        String input = sc.nextLine();

        // Result string to hold the expanded output
        StringBuilder result = new StringBuilder();

        // Iterate over the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the next character is a digit
            if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                int count = Character.getNumericValue(input.charAt(i + 1)); // Get the numeric value

                // Append the character 'count' number of times
                for (int j = 0; j < count; j++) {
                    result.append(currentChar);
                }

                // Skip the digit by incrementing the index
                i++;
            }
        }

        // Print the expanded result
        System.out.println("Expanded string: " + result.toString());
    }
}

