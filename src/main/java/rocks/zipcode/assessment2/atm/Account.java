package rocks.zipcode.assessment2.atm;

import java.util.List;
import java.util.Random;

public class Account {

    // this is only boiler plate. add your group's code here.

    private Long accountNumber;
    private String userPin;
    private Double balance;
    private int status;
    private int overdraft;
    public String accountType;

//----------- constructor -------------------------------

    public Account(String userPin){

        setAccountNumber();
        this.userPin = userPin;
        this.balance = 0.00;
        this.status = 0;
        this.overdraft = 0;

    }

//-------- business logic ---------------------------


    public void deposit(Double amount){
        this.balance += amount;
    }

    public String withdraw(Double amount){
        if(checkBalance(amount)) {
            this.balance -= amount;
            return null;
        } else
            return "Insufficient funds";
    }

    public String transfer(Account transferTo, Double amount){
        if(checkBalance(amount)){
            this.balance -= amount;
            transferTo.balance += amount;
            return null;
        }else
            return "Insufficient funds";
    }

// -----------------------------------------------

    public boolean checkBalance(Double amount){
        if (amount < this.balance)
            return true;

        return false;
    }



// ---------- setters and getters -------------------------------------

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        //this.accountNumber = accountNumber;

        Random random = new Random(System.nanoTime());

        this.accountNumber = Long.valueOf(random.nextInt(1000000000));

    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String pin) {
        this.userPin = pin;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    public String toString(List<String> list){

        return "Account: " + this.getAccountNumber() + "\n" + list.toString().replace(", ", "\n")
                .replace("[", "").replace("]", "\n");
    }
    
    public Account(double v) {
        this.balance = v;
    }

    public double balance() {
        return this.balance;
    }

    public boolean closeAccount() {

        if(balance > 0){
            return false;
        }
        return true;
    }

    public void deposit(double v) {
        balance += v;
    }

    public Double withdraw(double v) {
        if(balance >= v){ balance -= v;}
        return balance;
    }

    public void transfer(Account b, double v) {
        if(this.balance >= v) {
            this.balance -= v;
            b.balance += v;
        }
    }
}
