class minnum
{
   public static void main(String args[])
   {
	int a=5,b=37,c=12;

	if(a<b && a<c)
	{
	 System.out.println("Minimum Num Is: "+ a); 
        }
	if(b<a && b<c)
	{
	 System.out.println("Minimum Num Is: "+ b); 
        }
	if(c<a && c<b)
	{
	 System.out.println("Minimum Num Is: "+ c);
        }
   }
}