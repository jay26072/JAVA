
class Prime {

    public static void main(String args[]) {
        int i, j, start = 5, end = 20, flag = 0;

        for (i = start; i <= end; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(i + " Is Prime");
            }
        }
    }
}
