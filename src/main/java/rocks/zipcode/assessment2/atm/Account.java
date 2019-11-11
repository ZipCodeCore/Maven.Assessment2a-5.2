package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.
    private Double accountBalance = 0.00;
    private Double accountStatus = 0.00;

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
        if(accountBalance.equals(0.00)){
            return true;
        }
        return true;

    }

    public void deposit(double v) {
        double newBalance = accountBalance + v;
        accountBalance = newBalance;
    }

    public Double withdraw(double v) {
        double newBalance = accountBalance - v;
        if(accountBalance <= 0){
            return accountBalance;
        }
        return newBalance;
    }

    public void transfer(Account b, double v) {
    }
}
