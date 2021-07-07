package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    double balance;

    
    public Account(double v) {

        this.balance = v;
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        if (balance == 0.00){
            return true;
        }
        return false;
    }

    public void deposit(double v) {
        balance += v;
    }

    public Double withdraw(double v) {

        if(v < balance) {
            balance -= v;
            return balance;
        }else
            return 0.0;
    }

    public void transfer(Account b, double v) {

        if(v <= this.balance) {
            this.balance -= v;
            b.balance += v;
       }

    }
}
