class circle
{
    double radius;
    static int count;
    
    circle()
    {
        this(1.0);
        count++;
    }
    
    circle(double r)
    {
        radius=r;
    }
    
    static int getInstanceCount()
    {
        return count;
    }
    
    public static void main(String args[])
    {
        circle c1=new circle();
        circle c2=new circle();
        circle c3=new circle();
        
        System.out.println("Number of instances created = "+circle.getInstanceCount());
    }
}

