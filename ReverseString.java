package Basics;
	import java.util.Scanner;

	public class ReverseString {
	    public static String reverse(String str) {
	        StringBuilder reversed = new StringBuilder();

	        // Iterate over the string from the end to the beginning
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }

	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String reversedString = reverse(input);
	        System.out.println("Reversed string: " + reversedString);
	    }
	}


