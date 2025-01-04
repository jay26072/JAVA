/* 6.Write a program in Java to find minimum of three numbers using conditional operator.*/
class Ex6
 {
    public static void main(String[] args) {
        int a = 25, b = 1, c = 50;

        if (a<b && a<c) 
        {
            System.out.println("A: "+a+" Is Minimum");
        }
        if(b<a && b<c)
        {
            System.out.println("B: "+b+" Is Minmun");
        }
        if (c<a && c<b) 
        {
            System.out.println("C: "+c+" Is Minimum");
        }
    }
}
