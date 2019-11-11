package rocks.zipcode.assessment2.atm;

import java.util.Random;

public class Account {
    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    private Double balance;
    Random random = new Random();

    public Account(Double balance) {
        this.balance = balance;
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        return true;
    }

    public void deposit(double amount) {
        this.balance += amount;
        String bal = String.format("%.2f",this.balance);
        this.balance = Double.parseDouble(bal);
    }

    public Double withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        return balance;
    }

    public void transfer(Account b, double v) {
    }
}
