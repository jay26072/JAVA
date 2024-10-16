class interest
{
  public static void main(String args[])
  {
	int p=20;
	int r=5;
	int n=15;
	int t=5;
	double i,c;

	i=p*r*n/100;
	c=p*(Math.pow((1+r/100),t));
	System.out.println("Simple Interest Is "+ i);
	System.out.println("Compund Interest Is "+ c);
  }
}