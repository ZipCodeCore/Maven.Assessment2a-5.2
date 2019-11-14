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
        return balance == 0.0;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public Double withdraw(double v) {
        if(this.balance >= v) {
            this.balance -= v;
        }
        return this.balance;
    }

    public void transfer(Account b, double v) {
        if(this.balance >= v) {
            b.deposit(v);
            this.withdraw(v);
        }
    }
}
