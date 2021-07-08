package rocks.zipcode.assessment2.atm;

public class Account {

    private double balance;

    
    public Account(double v) {
        this.balance = v;
    }

    public double balance() {
        return this.balance;
    }

    public boolean closeAccount() {
        if (this.balance >0) {
            return false;
        } else {
            return true;
        }
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public Double withdraw(double v) {
        this.balance = Math.max(this.balance - v,0.0);
        return this.balance;
    }

    public void transfer(Account b, double v) {
        if (v <= this.balance) {
            b.deposit(v);
            this.withdraw(v);
        }
    }
}
