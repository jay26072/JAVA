/* 31.Write a program in Java to develop user defined exception for 'Divide by Zero' error. */

class InvalidOperation extends Exception {

    public InvalidOperation(String s) {
        super(s);
    }
}
class Ex31 {
    public static void main(String args[]) {
        try {
            int a = 10, b = 0;
            if (b == 0) 
            {
                throw new InvalidOperation("Divide by zero error");
            }
            int c = a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        } 
        catch (InvalidOperation e) 
        {
            System.out.println(e);
        }
    }
}
