
class palindrome {

    public static void main(String[] args) {
        int r, sum = 0, temp, num = 122;

        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " Is Palindrome Number");
        } else {
            System.out.println(temp + " Is Not Palindrome Number");
        }

    }
}
