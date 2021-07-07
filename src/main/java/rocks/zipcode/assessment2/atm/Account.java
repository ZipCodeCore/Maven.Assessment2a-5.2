package rocks.zipcode.assessment2.atm;

public class Account {
    Double balance;


    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    public Account(double v) {
        this.balance = v;

    }

    public double balance() {
        return this.balance;
    }

    public boolean closeAccount() {
        return (balance == 0) ? true : false;
    }

    public void deposit(double v) {
        balance = this.balance + v;
    }

    public Double withdraw(double v) {
        if (balance < v) {
            return 0.0;
        }
        balance = balance - v;
        return balance;
    }

    public void transfer(Account b, double v) {
        if(v <= this.balance) {
            this.withdraw(v);
            b.deposit(v);
        }
    }
}
