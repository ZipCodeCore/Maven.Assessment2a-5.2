package rocks.zipcode.assessment2.atm;

import java.util.Random;

public class Account {


    private Double balance;
    private Integer ownerID;
    private Integer acctNum;

    public enum Status {
        OPEN, CLOSED, OFAC
    }

    private Status acctStatus;


    public Account(double v) {
        this.balance = v;
        this.acctStatus = Status.OPEN;
    }

    public double balance() {
        return this.balance;
    }

    public boolean closeAccount() {
        return this.balance<=0;
        }



    public void deposit(double v) {
        this.balance += v;

    }


    public Double withdraw(double v) {
        if (this.balance >= v) {
            this.balance -= v;
        }
        return balance;
    }

    public void transfer(Account b, double v) {
        if (this.balance >= v) {
            this.balance -= v;
            b.balance += v;
        } else {
            this.balance += 0;
        }
    }
}
