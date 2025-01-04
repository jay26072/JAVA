/* 29.Write a java program to use important methods of String class. */

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String targetString = "Java is OOP language. its fun to do coding";

        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a String: ");
        String s2 = sc.nextLine();
        String s3 = "  Hello Java  ";

        System.out.println("Length: " + targetString.length());
        System.out.println("lower case: " + targetString.toLowerCase());
        System.out.println("upper case: " + targetString.toUpperCase());
        System.out.println("Trim : " + s3.trim());
        System.out.println("Char at index 2: " + targetString.charAt(0));

        System.out.println("After Concat: " + targetString.concat(" lets enjoy it "));

        System.out.println("equals: " + s2.equals(s1));
        System.out.println("equals ignore case: " + s2.equalsIgnoreCase(s1));

        System.out.println("SubString: " + targetString.substring(5));
        System.out.println("SubString: " + targetString.substring(5, 7));

        System.out.println("Replace function: " + targetString.replace("fun", "easy"));

        System.out.println("searching s1 : " + targetString.contains(s1));
        System.out.println("searching s2 : " + targetString.contains(s2));

        char[] charArray = s2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);

    }
}
