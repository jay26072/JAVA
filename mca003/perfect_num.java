class perfect_num
{
  public static void main(String args[])
  {
    int num=9;
    int i,j,tmp,tmp1,sum;
    //sum=tmp+tmp1;

    for(i=1;i<=num;i++)
    {
	for(j=2;j<num;j++)
	{
          if(i%j==0)
	  {
		tmp=i;
		tmp1=j;
		sum=tmp+tmp1;
		System.out.println(tmp);
	  }
	
        }
    }
    
  }
}