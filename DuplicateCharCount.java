package Basics;

public class DuplicateCharCount {
	    public static void countDuplicateCharacters(String str) {
	        int[] charCount = new int[256]; // Assuming ASCII character set

	        // Convert the string to a character array
	        char[] chars = str.toCharArray();

	        // Count occurrences of each character
	        for (char c : chars) {
	            charCount[c]++;
	        }

	        // Print characters with count greater than 1 (duplicates)
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > 1) {
	                System.out.println("Character: " + (char) i + ", Count: " + charCount[i]);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String inputString = "This is a program to find the count of duplicate charcters in a string";
	        countDuplicateCharacters(inputString);
	    }
	}

