package rocks.zipcode.assessment2.atm;

public class Account {

    private double balance;
    
    public Account(double v) {
        balance = v;
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        if (balance == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public void deposit(double v) {
        balance += v;
    }

    public Double withdraw(double v) {
        if(balance >= v) {
            balance -= v;
        }
        return balance;
    }

    public void transfer(Account b, double v) {
        if(this.balance >= v) {
            b.deposit(v);
            this.withdraw(v);
        }
    }
}
