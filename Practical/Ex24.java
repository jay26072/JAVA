/* 24.Write a java program to implement an interface called Exam with a method Pass (int mark) that returns a boolean Write another interface called Classify with a method Division (int average) which returns a String. 
Write a class called Result which implements both Exam and Classify.The Pass method should return true if the mark is greater than or equal to 50 else false. 
The Division method must return “First” when the parameter average is 60 or more, “Second” when average is 50 or more but below 60, “No division” when average is less than 50. */

interface Exam
{
	public boolean pass(int mark);
}

interface Classify
{
	public String division (int average);
}

class Result implements Exam, Classify
{
	@Override
	public boolean pass(int mark)
	{
		return(mark>=50);		
	}
	@Override
	public String division (int average)
	{
		String d;
		if(average>=60)
			d="First";
		else if(average>=50)
			d="Second";
		else
			d="No division";
		
		return(d);
	}
}

class Ex24
{
	public static void main(String args[])
	{
		Result r= new Result();
		System.out.println("Result   : "+r.pass(50));
		System.out.println("Division : "+r.division(90));
	}
}