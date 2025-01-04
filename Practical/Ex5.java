/* 5.Write a java program to check Armstrong number. Input: 153 Output: Armstrong number
    Input: 22 Output: not Armstrong number*/
class Ex5 {

    public static void main(String[] args) {
        int num = 55, digit, r, res = 0;

        digit = num;

        while (digit != 0) {
            r = digit % 10;
            res += Math.pow(r, 3);
            digit /= 10;
        }

        if (res == num) {
            System.out.println(num + " Is Armstrong Num");
        } else {
            System.out.println(num + " Is Not Armstrong Num");

        }
    }
}
