
/*10.Write a Java application which takes several command line arguments, which are supposed to be names of students and prints output as given below:
(Suppose we enter 3 names then output should be as follows).. Number of arguments = 3
1. First Student Name is = Arun
2. Second Student Name is = Hiren
3. Third Student Name is = Hitesh
*/

import java.util.Scanner;
class students
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of arguments: ");
        int numArgs=sc.nextInt();
        String Sname[]=new String[numArgs];
        for(int i=0;i<Sname.length;i++)
        {
            System.out.println("Enter name of student "+(i+1));
            Sname[i]=sc.next();
        }
        for(int i=0;i<Sname.length;i++)
        {
            System.out.println((i+1)+". Student Name is = "+Sname[i]);
        }
    }
}