class maximum
{
	public static void main(String args [])
	{
		int a=20;
		int b=25;
		int c=12;

		if(a>b)
		{
			System.out.println("Maximum Is:"+ a);
			System.out.println("Minimum Is:"+ b);			
		}
		if(b>a)
		{
			System.out.println("Maximum Is:"+ b);
			System.out.println("Minimum Is:"+ a);
			System.out.println("Minimum Is:"+ c);
		}
		else
		{
			System.out.println("Maximum Is:"+ c);
			System.out.println("Minimum Is:"+ b);
			System.out.println("Minimum Is:"+ a);
		}
	}
}