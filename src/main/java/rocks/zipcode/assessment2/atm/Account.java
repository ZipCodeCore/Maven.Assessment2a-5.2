package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.
    private Double accountBalance;

    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    // constructor
    public Account(double v) {
        this.accountBalance = v;
    }

    public double balance() {
        return accountBalance;
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
        double newBalance = balance() + v;
        accountBalance = newBalance;
    }

    public Double withdraw(double v) {
        double newBalance = accountBalance - v;
        if (accountBalance <= 0) {
            return accountBalance;
        }
        return newBalance;
    }

    public void transfer(Account b, double v) {
//        if(balance() > 0.00){
//            withdraw(v);
//        }
//        b.deposit(v);
    }
}
