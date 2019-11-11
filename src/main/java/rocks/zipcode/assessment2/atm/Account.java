package rocks.zipcode.assessment2.atm;

import java.util.Random;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********

    private Double balance;
    private Integer ownerID;
    private Integer acctNum;
    public enum Status {
        OPEN, CLOSED, OFAC
    }
    private Status acctStatus;
    Random random = new Random();


//    public Account(double v) {
//    }


    public Account(Double balance) {

        this.balance = balance;
//        this.ownerID = ownerID;
//        this.acctNum = acctNum;
//        this.acctStatus = acctStatus;
    }

    public Double getBalance(){
        return balance;
    }

    public Integer getOwnerID() {
        return this.ownerID;
    }

    public Integer getAcctNum() {
        return this.acctNum;
    }

    public Status getAcctStatus() {
        return acctStatus;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAcctStatus(Status acctStatus) {
        this.acctStatus = acctStatus;
    }

    public void deposit(Double amount){
        this.balance += amount;
        String bal = String.format("%.2f",this.balance);
        this.balance = Double.parseDouble(bal);
    }

    public void withdraw(Double amount){
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }
//
//    public Boolean equals(Account account) {
//        return DB.serialize(this.toStringArray()).equals(DB.serialize(account.toStringArray()));
//    }
//}

    public double balance() {
        return this.balance;
    }

    public boolean closeAccount() {

         if (this.balance == 0){
             return true;
         }
            else return false;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public Double withdraw(double v) {
        if (this.balance >= v) {
            this.balance -= v;
        }
        return this.balance;
    }

    public void transfer(Account b, double v) {
        this.balance -= v;
    }
}

