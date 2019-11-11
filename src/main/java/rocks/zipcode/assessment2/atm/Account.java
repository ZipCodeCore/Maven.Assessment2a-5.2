package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********


    private Double balance;

    
    public Account(double v) {
        this.balance = v;
    }

    public double balance() {

        return this.balance;
    }

    public boolean closeAccount() {

        return this.balance == 0;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public Double withdraw(double v) {

        if (this.balance < v) {
            return this.balance;
        } else {
            return this.balance -= v;
        }
    }

    public void transfer(Account b, double v) {
        if (this.balance < v) {

        } else {
            this.balance -= v;
            b.balance += v;
        }

    }




}
