package rocks.zipcode.assessment2.atm;

public class Account {
    double mybalance;

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********
    
    public Account(double v) {
        this.mybalance = v;
    }

    public double balance() {

        return this.mybalance;
    }

    public boolean closeAccount() {

        return false;
    }

    public void deposit(double v) {
        this.mybalance= v;
    }

    public Double withdraw(double v) {
        return this.mybalance = v;
    }

    public void transfer(Account b, double v) {
    }
}
