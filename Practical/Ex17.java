/*17.Write a class “circle” with radius as data member and count the number of instances created using default constructor only. 
[Constructor Chaining] */

class Ex17
{
    int radius;
    static int count;
    Ex17()
    {
        count++;
    }
    Ex17(int r)
    {
        radius=r;
        count++;
    }
    public static void main(String[] args) {
        Ex17 c1=new Ex17();
        Ex17 c2=new Ex17(5);
        Ex17 c3=new Ex17();
        System.out.println("Number of instances created: "+count);
    }
}
