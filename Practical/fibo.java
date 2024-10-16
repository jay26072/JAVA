
class fibo {

    public static void main(String[] args) 
    {
        int start=0,end=10,t1=0,t2=1,fibo,i;

        System.out.println(t1 + " , \n" + t2 + " , ");

        for (i = start; i < end; i++) {
            
            fibo=t1+t2;
            t1=t2;
            t2=fibo;

            System.out.println(fibo+" , ");
        }

    }
}

/*

// n=5 0 1 1 2 3
#include<stdio.h>

void main()
{
	int n,fibo,i,t1=0,t2=1;
	fibo=t1+t2;//0+1=1
	
	printf("Enter Any Number: ");
	scanf("%d",&n);
	printf("\n%d \n%d",t1,t2);
	for(i=3;i<=n;i++)
	{
		printf("\n%d",fibo);//f=3
		t1=t2;//t1=1
		t2=fibo;//t2=2
		fibo=t1+t2;//f=3
	}
	//printf("%d",fibo);
}

*/
