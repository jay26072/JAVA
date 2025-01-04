/* 28. Write a java program to accept string to check whether it is in Upper or Lower case. After checking, case will be reversed.*/

import java.util.Scanner;
class Ex28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a String: ");
        String sentence=sc.nextLine();
        if(sentence.equals(sentence.toUpperCase()))
        {
            System.out.println(sentence.toLowerCase());
        }
        else
        {
            System.out.println(sentence.toUpperCase());
        }
    }
}