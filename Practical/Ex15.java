/* 15.Write a java program static block which will be executed before main ( ) method in a Class.*/

class Ex15
{
    static
    {
        System.out.println("Static block is executed before main method");
    }
    public static void main(String[] args) {
        System.out.println("Main method is executed after static block");
    }
}