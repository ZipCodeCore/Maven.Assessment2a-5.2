package rocks.zipcode.assessment2.atm;

public class Account {
    private double balance;
    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********
    
    public Account(double v) {
        this.balance = v;
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        if (balance == 0.0){
            return true;
        } else {
            return false;
        }

    }

    public void deposit(double v) {
        balance += v;
    }

    public Double withdraw(double v) {
        if (balance >= v){
            balance -= v;
        return v;
    }else {
        return 0.0;
    }
    }

    public void transfer(Account b, double v) {


        b.deposit(this.withdraw(v));
    }
}
