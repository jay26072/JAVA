/* 33.Write a small application in Java to develop Banking Application in which user deposits the amount Rs 1000.00 
and then start withdrawing of Rs 400.00, Rs 300.00 and it throws exception "Not Sufficient Fund" when user withdraws Rs. 500 thereafter. */

abstract class Account {

    long accountNo = 0;
    double balance = 0.0;

    Account() {
        this.accountNo = 0;
        this.balance = 0.0;
    }

    Account(long x, double y) {
        this.accountNo = x;
        this.balance = y;
    }

    public abstract void checkBalance();
}

class Saving extends Account {

    Saving() {
        this.accountNo = 0;
        this.balance = 0.0;

    }

    Saving(long a, double b) {
        this.accountNo = a;
        this.balance = b;

    }

    @Override
    public void checkBalance() {
        // System.out.println("\n*********************************************");
        System.out.print("\nSaving Acount Balance:" + this.balance);
    }

    public void depositBalance(double x) {
        this.balance = this.balance + x;
    }

    public void withdrawBalance(double x) {
        if ((this.balance - x) > 0) {
            this.balance = this.balance - x;
        } else {
            String msg = "";
            msg += "\nYou can not withdraw " + x;
            msg += "\ninsufficient balance in your account";
            msg += "\nSaving Account balance : " + this.balance;
            msg += "\n*********************************************";
            throw new ArithmeticException(msg);
        }
    }
}

class Ex33 {

    public static void main(String args[]) {
        Saving s = new Saving(1, 0);

        try {
            s.depositBalance(1000);
            s.checkBalance();
            s.withdrawBalance(400);
            s.checkBalance();
            s.withdrawBalance(300);
            s.checkBalance();
            s.withdrawBalance(500);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
