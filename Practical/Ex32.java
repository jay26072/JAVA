/* 32.Write a program in Java to demonstrate throw, throws, finally, multiple try block and multiple catch exception.*/

public class Ex32 {
    public static void demoMethod() throws ArithmeticException {
        int a = 10, b = 0;
        if (b == 0) {
            throw new ArithmeticException("Division by zero exception");
        }
        int c = a / b;
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) {
        try {
            demoMethod();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
