package rocks.zipcode.assessment2.atm;

import java.security.InvalidParameterException;

public class Account {

    protected Double balance;

    public Account(Double balance){
        this.balance = balance;
    }

    public Double balance(){
        return this.balance;
    }


    public Double withdraw(Double amount) {
        if (amount < 0) {
            throw new InvalidParameterException();
        }
        if(this.balance >= amount) {
            this.balance = balance - amount;
            return balance;
        }
        return balance;
    }

    public Double deposit(Double amount) {
        if (amount < 0) {
            throw new InvalidParameterException();
        }
        this.balance = balance + amount;
        return balance;
    }

    public Double transfer(Account destinationAccount, Double amount) {
        if (amount < 0) {
            throw new InvalidParameterException();
        }
        if(this.balance >= amount) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
        }
        return this.balance;
    }

    public boolean closeAccount(){
        if(this.balance > 0){
            return false;
        } return true;
    }
}
