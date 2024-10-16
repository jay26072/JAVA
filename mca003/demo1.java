class vehical
{
	int person;
	int fulecap;
}

class demo1
{
	public static void main(String args[])
	{
		vehical obj1=new vehical();
		vehical obj2=new vehical();
		
		obj1.person=12;
		obj2.fulecap=2;
		
		obj1=obj2;
		
		System.out.println(obj1.person);
		
	}
}