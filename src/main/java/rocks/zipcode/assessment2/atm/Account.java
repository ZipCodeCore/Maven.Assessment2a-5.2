package rocks.zipcode.assessment2.atm;

public class Account {
    private double balance;
    private boolean closeAccounts;
    private double deposit;
    private  Double withdraw;
    public Account transfer;

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    public Account(double v) {
        this.balance = balance();
        this.closeAccounts = closeAccount();
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.transfer = transfer;
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        return false;
    }

    public double deposit(double v) {
        return deposit;


    }

    public Double withdraw(double v) {
        return withdraw;
    }

    public void transfer(Account b, double v) {
    }
}