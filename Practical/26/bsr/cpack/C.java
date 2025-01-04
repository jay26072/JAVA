package bsr.cpack;
import bsr.apack.*;
public class C
{
	public void display()
	{
		System.out.println("-----------------------------");
		A obj = new A();
		System.out.println("Class C");
		System.out.println("protected x : "+obj.getX());		
		System.out.println("private y : "+obj.getY());
		System.out.println("public z : "+obj.getZ());
		System.out.println("-----------------------------\n");
	}
}