package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    private Double accountBalance;

    public Account(double v) {
        this.accountBalance = v;
    }

    public double balance() {
        return accountBalance;
    }

    public boolean closeAccount() {
        if (accountBalance.equals(0.0)){
            return true;
        }
        return false;
    }

    public void deposit(double v) {
        accountBalance = getAccountBalance() + v;
    }

    public Double withdraw(double v) {
        if (getAccountBalance() >= v) {
            accountBalance -= v;
        }
        return accountBalance;
    }

    public void transfer(Account b, double v) {
    }
}
