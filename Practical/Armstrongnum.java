
class Armstrongnum {

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
