package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    private double balance;
    private boolean accountStatus;

    public Account(double v) {
        this.balance = v;
        this.accountStatus = true;
    }

    public double balance() {
        return this.balance;
    }

    public boolean closeAccount() {
        if(this.balance == 0){
            this.accountStatus = false;
            return true;
        }
        return false;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public Double withdraw(double v) {
        if (this.balance >= v){this.balance -= v;}
        return this.balance;
    }

    public void transfer(Account b, double v) {
        if (this.balance >= v){
            this.withdraw(v);
            b.deposit(v);
        }
    }
}
