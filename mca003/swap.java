class swap
{
    public static void main(String args [])
    {
	int a=20;
	int b=10;
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("Swap Value of A is" + a);
	System.out.println("Swap Value of B is" + b);
	
    }

}