/* 11.Write a Java application to count and display frequency of letters and digits from the String given by user as 
      command-line argument. 
*/

import java.util.Scanner;
// class count
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a String:");
//         String s=sc.nextLine();
//         int count=0;
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)>='0' && s.charAt(i)<='9')
//             {
//                 count++;
//             }
//         }
//         System.out.println("Number of digits in String is "+count);
//     }
// }

class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        int countdig=0,countalpha=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                countdig++;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                countalpha++;
            }
        }
        System.out.println("Number of Digits in String is : "+countdig);
        System.out.println("Number of Alphabets in String is : "+countalpha);
    }
}
