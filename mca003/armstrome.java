class armstrome
{
  public static void main(String args[])
  {
	int num=22,temp,sum=0;
	int i,n;
	
	i=num;
	while(num>0)
	{
	   n=num%10;
	   num=num/10;
	   sum=sum+(n*n*n);
	}
	
	if(sum==i)
	{
	  System.out.println(i+" Is Armstrome Num");
	}
	else
	{
	  System.out.println(i+" Is Not Armstrome Num");
	}
  }
}