package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.
    private double accountBalance;

    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    // constructor
    public Account(double v) {
        this.accountBalance = v;
    }

    public double balance() {
        return this.accountBalance;
    }

    public boolean closeAccount() {
        if (accountBalance <= 0.00) {
            return true;
        }
        if (accountBalance > 0.00) {
            return false;
        }
        return true;
    }

    public void deposit(double v) {
        accountBalance += v;
    }

    public Double withdraw(double v) {
        if (accountBalance >= v) {
            accountBalance -= v;
        }
        return accountBalance;
    }

    public void transfer(Account b, double v) {
        if(this.accountBalance >= v){
            b.deposit(v);
            this.withdraw(v);
        }
    }
}
