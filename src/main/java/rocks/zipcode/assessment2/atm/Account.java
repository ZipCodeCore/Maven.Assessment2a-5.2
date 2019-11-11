package rocks.zipcode.assessment2.atm;

import java.security.InvalidParameterException;

public class Account {
    protected Double balance;
    private String accountName;
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
        return (balance <= 0);
    }

    public void deposit(double v) {
        this.balance = balance + v;
    }

    public Double withdraw(double v) {
        if (v < 0) {
            throw new InvalidParameterException();
        }
        if(this.balance >= v) {
            this.balance = balance - v;
            return balance;
        }
        return balance;
    }


    public void transfer(Account b, double v) {
        if(this.balance >= v) {
            this.withdraw(v);
            b.deposit(v);
        }

    }
}
