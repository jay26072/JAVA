/* Create a class “Rectangle” that would contain length and width as an instance variable and count as a static variable.
Define constructors [constructor overloading (default, parameterized and copy)] to initialize variables of objects. Define methods to find area and to display variables’ value of objects which are created.
[Note: define initializer block, static initializer block and the static variable and method. Also demonstrate the sequence of execution of initializer block and static initialize block] */


class Rectangle
{   
    int l,w;
    static int count;
    Rectangle(int l,int w)
    {
        this.l=l;
        this.w=w;
        count++;
    }
    Rectangle(Rectangle r)
    {
        this.l=r.l;
        this.w=r.w;
        count++;
    }
    void area() 
    {
        int a=l*w;
        System.out.println("Area of Rectangle is :"+a);
    }
    void display()
    {
        System.out.println("Length of Rectangle is :"+l);
        System.out.println("Width of Rectangle is :"+w);
        System.out.println("Count of Rectangle is :"+count);
    }
    static void count1()
    {
        System.out.println("Count of Rectangle is :"+count);
    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        r1.area();
        r1.display();
        count1();

        System.out.println("\n");

        Rectangle r2=new Rectangle(r1);
        r2.area();
        r2.display();
        count1();
    }
}