package Basics;

public class StringOperations {
	    public static void main(String[] args) {
	        // Declare a few strings
	        String str1 = "Hello1";
	        String str2 = "World2";
	        String str3 = "Hello World3";

	        // 1. Length of a string
	        System.out.println("Length of str1: " + str1.length());

	        // 2. Concatenation of two strings
	        String concatenated = str1 + " " + str2;  // Using + operator
	        System.out.println("Concatenated string: " + concatenated);

	        // 3. String comparison (case-sensitive)
	        System.out.println("str1 equals str2: " + str1.equals(str2));  // False
	        System.out.println("str1 equals str3 (case-sensitive): " + str1.equals(str3));  // False

	        // 4. String comparison (ignoring case)
	        String str4 = "hello";
	        System.out.println("str1 equals str4 (ignoring case): " + str1.equalsIgnoreCase(str4));  // True

	        // 5. Substring extraction
	        System.out.println("Substring of str3 (from index 6 to end): " + str3.substring(6));

	        // 6. Character extraction
	        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

	        // 7. Finding the index of a character or substring
	        System.out.println("Index of 'W' in str3: " + str3.indexOf('W'));
	        System.out.println("Index of 'World' in str3: " + str3.indexOf("World"));

	        // 8. String replacement
	        String replacedString = str3.replace("World", "Java");
	        System.out.println("Replaced string: " + replacedString);

	        // 9. Convert to uppercase
	        System.out.println("Uppercase of str1: " + str1.toUpperCase());

	        // 10. Convert to lowercase
	        System.out.println("Lowercase of str2: " + str2.toLowerCase());

	        // 11. Check if string contains a substring
	        System.out.println("Does str3 contain 'Hello'? " + str3.contains("Hello"));

	        // 12. Trim spaces from both ends
	        String strWithSpaces = "   Hello World   ";
	        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

	        // 13. Splitting a string
	        String[] words = str3.split(" ");
	        System.out.println("Words in str3:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // 14. Converting other data types to String
	        int number = 100;
	        String numberStr = String.valueOf(number);
	        System.out.println("String representation of number: " + numberStr);

	        // 15. Check if string is empty or blank
	        String emptyStr = "";
	        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
	        System.out.println("Is emptyStr blank? " + emptyStr.isBlank());
	        System.out.println("Is str1 empty? " + str1.isEmpty());
	        System.out.println("Is str1 blank? " + str1.isBlank());
	    }
	}


