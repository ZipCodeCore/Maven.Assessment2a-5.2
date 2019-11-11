package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    private Double balance;



    public Account(double v) {
        this.balance = 0.00;

    }

    public double balance(double v) {
        return v = this.balance;
    }

    public boolean closeAccount() {
        return false;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public boolean checkBalance(Double v) {
        if (v < this.balance)
            return true;
        return false;
    }

    public Double withdraw(double v) {
        return this.balance -= v;

    }

    public void transfer(Account b, double v) {
        if (checkBalance(v)) {
            this.balance -= v;
            b.balance += v;

        }
    }
}