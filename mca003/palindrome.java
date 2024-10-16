class palindrome
{
    public static void main(String args[])
    {
	int r,sum=0,num=213,temp;
	    temp=num;
   	while(num>0)
	{
	    r=num%10;   
	    sum=(sum*10)+r;
	    num=num/10;  
	}
	if(temp==sum)
	{
	   System.out.println(temp+" Num Is Palindrome");
	}
	else
	{
	   System.out.println(temp+" Is not palindrome");
	}	
	
    }
}