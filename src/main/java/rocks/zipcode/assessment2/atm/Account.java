package rocks.zipcode.assessment2.atm;

//import sun.plugin.util.UserProfile;

import java.util.ArrayList;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    private Double accountBalance;

    public Account(double v) {

        this.accountBalance = v;
    }

    public double balance() {
        return this.accountBalance;
    }

    public boolean closeAccount() {
        if (this.accountBalance == 0.0) return true;
        else
        return false;
    }

    public void deposit(double v) {
        this.accountBalance += v;
    }

    public Double withdraw(double v) {
        if (v > 0 && v <= accountBalance) {
            accountBalance -= v;
        }
            return this.accountBalance;

    }

    public void transfer(Account b, double v) {
        if (this.accountBalance >= v && v > 0) {
            b.accountBalance += v;
            this.withdraw(v);
        }
        /*else {
          b.accountBalance += this.accountBalance;
            this.withdraw(accountBalance);
        } */

    }
}
