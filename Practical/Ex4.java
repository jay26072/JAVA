/*4.Write a java program to print value of x^n. Input: x=5 Input: n=3 Output: 125 */

public class Ex4 {
    public static void main(String[] args) {
        int x = 3;
        int n = 3;
        double result = Math.pow(x, n);
        System.out.println(x + "^" + n + " = " + (int)result);
    }
}

