package bsr.bpack;
// import bsr.apack.*;
import bsr.apack.*;
public class B extends A
{
	public void display()
	{
		System.out.println("-----------------------------");
		System.out.println("Class B");
		System.out.println("protected x : "+x);
		//System.out.println("private y : "+y);//ERROR : can't inherited private variable
		System.out.println("private y : "+getY());
		System.out.println("public z : "+z);
		System.out.println("-----------------------------\n");
	}
}
