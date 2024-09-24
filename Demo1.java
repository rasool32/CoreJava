package Basics;


public class Demo1{
public static void comparereference() {
String str1 = new String("hello");
String str2 = new String("hello");
if (str1 == str2) {
    System.out.println("str1 and str2 are the same object");
} else {
    System.out.println("str1 and str2 are different objects");
}
}

public void compareContent() {
String str1 = new String("hello");
String str2 = new String("hello");
if (str1.equals(str2)) {
    System.out.println("str1 and str2 have the same content");
} else {
    System.out.println("str1 and str2 have different content");
}
}}


