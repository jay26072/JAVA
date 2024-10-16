class maxnum
{
    public static void main(String[] args) 
    {
        int a=112,b=23,c=35,d=55;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // System.out.println("\n");

        if (a>b && a>c && a>d) 
        {
            System.out.println("A: "+a+" is Maximum");
        }
        if (b>a && b>c && b>d) 
        {
            System.out.println("B: "+b+" Is Maximun");
        }
        if (c>a && c>b && c>d) 
        {
            System.out.println("C: "+c+" Is Maximum");
        }
        if (d>a && d>b && d>c) 
        {
            System.out.println("D: "+d+" Is Maximum");
        }
    }
}