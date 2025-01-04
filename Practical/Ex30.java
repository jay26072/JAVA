/* 30.Write a program in Java to demonstrate use of final class, final variable and final method */

final class X // final class
{
	final int x=90;//final variable  
	final public void disp() //final method
	{
		// x=99; // ERROR : final variable value can not be change
		System.out.println("final variable : "+x);
	}
}

class Ex30
{  	  
	public static void main(String args[])
	{  
		X obj=new  X();  		
		System.out.println("final variable : "+obj.x);
	}  
}