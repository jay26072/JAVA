/* 2.Write a program to pass Starting and Ending limit and print all prime numbers and Fibonacci numbers between this ranges. */
class Ex2 {

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