
import java.util.Scanner;

/* Create a class "Student" that would contain enrollment No, name, and gender and marks as instance variables and count as static variable which stores the count of the objects; constructors and display(). Implement constructors to initialize instance variables. Also demonstrate constructor chaining. Create objects of class “Student” and displays all values of objects.*/

class Student1
{
    int enroll;
    String name;
    String gender;
    int marks;
    static int count;
    Student1(int enroll,String name,String gender,int marks)
    {
        this.enroll=enroll;
        this.name=name;
        this.gender=gender;
        this.marks=marks;
        count++;
    }
    void display()
    {
        System.out.println("Roll No : "+enroll);
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Marks : "+marks);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Roll No : ");
        int enroll=sc.nextInt();

        System.out.print("Enter Name : ");
        String name=sc.next();
        
        System.out.print("Enter Gender : ");
        String gender=sc.next();

        System.out.print("Enter Marks : ");
        int marks=sc.nextInt();

        Student1 s1=new Student1(enroll,name,gender,marks);
        System.out.println("\n");

        s1.display();
        System.out.println("Total Objects : "+count);
    }
}