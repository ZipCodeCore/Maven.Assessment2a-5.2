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
    Random random = new Random();
    
    public Account(double v) {
    }

    public double balance() {
        return 0.0;
    }

    public boolean closeAccount() {
        return false;
    }

    public void deposit(double v) {
    }

    public Double withdraw(double v) {
        return 0.0;
    }

    public void transfer(Account b, double v) {
    }
}
