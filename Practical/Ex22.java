/* 22.Write a java program to illustrate how to access a hidden variable. Class A declares a static variable x. 
The class B extends A and declares an instance variable x. display ( ) method in B displays both of these variables. */

class A
{
	static int a=10;
	A()
	{
		a=20;
	}	
}
class B extends A
{
	int a;
	B()
	{
		a=1000;
	}
	public void display()
	{
		System.out.println("local  a : "+a);
		System.out.println("static a : "+super.a);
	}
}
class Ex22
{
	public static void main(String args[])
	{
			B obj = new B();
			obj.display();
	}
}
