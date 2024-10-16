
class minnum {
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
