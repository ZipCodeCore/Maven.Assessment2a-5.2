package rocks.zipcode.assessment2.atm;

import java.util.ArrayList;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********
    private Integer accountID;
    private Double balance;
    //////////////////////////////////////////////
    /////////////////////////////////////////////////

    public Account(Double balance, Integer id) {
        this.balance = balance;
        this.accountID = id;
        //this.transactionHistory = new ArrayList<String>();
    }

    public Account(Double balance) {
        this.accountID = 0;
        this.balance = balance;
        //this.transactionHistory = new ArrayList<String>();

    }

    public void deposit(Double amount) {
        if (amount > 0.0) {
            this.setBalance(this.getBalance() + amount, String.format("Deposit to %s", this.getAccountID()));
        }
    }

    public Double withdraw(Double amount) {
        if (amount > 0 && amount <= this.getBalance()) {
            this.setBalance(this.getBalance() - amount, String.format("Withdraw from %s", this.getAccountID()));
        }
        return this.getBalance();
    }

    public void transfer(Account too, Double amount) {
        if (this.balance >= amount && amount > 0) {
            this.setBalance(this.getBalance() - amount, String.format("Transfer to %s", too.getAccountID()));
            too.setBalance(too.getBalance() + amount, String.format("Transfer from %s", this.getAccountID()));
        } //else Console.println("Sorry, not enough currency to transfer.");
    }

    public boolean closeAccount() {
        return (getBalance() == 0.0);
    }

    //////GETTERS AND SETTERS//////
    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Double getBalance() {
        return balance;
    }

    public Double balance() {
        return balance;
    }


    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setBalance(Double balance, String transactionType) {
        Double oldBal = this.getBalance();
        this.setBalance(balance);
       // Double amount = this.getBalance() - oldBal;
        //String report = buildTransactionReport(oldBal, this.getBalance(), amount, transactionType);
        //addTransactionReportToTransactionHistory(report);
    }



    public String getName() {
        return "Account";
    }
}
