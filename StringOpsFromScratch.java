package Basics;

public class StringOpsFromScratch {

	    // 1. Calculate the length of a string
	    public static int stringLength(String str) {
	        int length = 0;
	        for (char c : str.toCharArray()) {
	            length++;
	        }
	        return length;
	    }

	    // 2. Concatenate two strings
	    public static String stringConcat(String str1, String str2) {
	        char[] concat = new char[stringLength(str1) + stringLength(str2)];
	        int i = 0;
	        for (char c : str1.toCharArray()) {
	            concat[i++] = c;
	        }
	        for (char c : str2.toCharArray()) {
	            concat[i++] = c;
	        }
	        return new String(concat);
	    }

	    // 3. String comparison (case-sensitive)
	    public static boolean stringEquals(String str1, String str2) {
	        if (stringLength(str1) != stringLength(str2)) {
	            return false;
	        }
	        for (int i = 0; i < stringLength(str1); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // 4. Substring extraction
	    public static String substring(String str, int start, int end) {
	        if (start < 0 || end > stringLength(str) || start > end) {
	            return "Invalid Range";
	        }
	        char[] subStr = new char[end - start];
	        for (int i = start; i < end; i++) {
	            subStr[i - start] = str.charAt(i);
	        }
	        return new String(subStr);
	    }

	    // 5. Character extraction
	    public static char charAt(String str, int index) {
	        if (index < 0 || index >= stringLength(str)) {
	            throw new IndexOutOfBoundsException("Invalid index");
	        }
	        return str.toCharArray()[index];
	    }

	    // 6. Find the index of a character
	    public static int indexOf(String str, char c) {
	        for (int i = 0; i < stringLength(str); i++) {
	            if (str.charAt(i) == c) {
	                return i;
	            }
	        }
	        return -1;  // Return -1 if character not found
	    }

	    // 7. Find the index of a substring
	    public static int indexOfSubstring(String str, String subStr) {
	        int lenStr = stringLength(str);
	        int lenSubStr = stringLength(subStr);
	        for (int i = 0; i <= lenStr - lenSubStr; i++) {
	            int j;
	            for (j = 0; j < lenSubStr; j++) {
	                if (str.charAt(i + j) != subStr.charAt(j)) {
	                    break;
	                }
	            }
	            if (j == lenSubStr) {
	                return i;
	            }
	        }
	        return -1;  // Return -1 if substring not found
	    }

	    public static void main(String[] args) {
	        // Test strings
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = "Hello World";

	        // 1. Length of a string
	        System.out.println("Length of str1: " + stringLength(str1));

	        // 2. Concatenate two strings
	        System.out.println("Concatenated string: " + stringConcat(str1, str2));

	        // 3. String comparison (case-sensitive)
	        System.out.println("str1 equals str2: " + stringEquals(str1, str2));

	        // 4. Substring extraction
	        System.out.println("Substring of str3 (from index 6 to end): " + substring(str3, 6, stringLength(str3)));

	        // 5. Character extraction
	        System.out.println("Character at index 1 of str1: " + charAt(str1, 1));

	        // 6. Find the index of a character
	        System.out.println("Index of 'W' in str3: " + indexOf(str3, 'W'));

	        // 7. Find the index of a substring
	        System.out.println("Index of 'World' in str3: " + indexOfSubstring(str3, "World"));
	    }
	}


