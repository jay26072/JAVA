class Fibo
{
	public static void main(String args[])
	{
		int num=6;
		int i,tmp=0,tmp1=1;
		int fibo;
		fibo=tmp+tmp1;
		System.out.println(tmp);
		System.out.println(tmp1);
		for(i=3;i<=num;i++)
		{
			tmp=tmp1;
			tmp1=fibo;
			fibo=tmp+tmp1;
			System.out.println(fibo);
		}

	}
}