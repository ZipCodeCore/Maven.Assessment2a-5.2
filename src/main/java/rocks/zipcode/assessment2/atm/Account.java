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

    public Account(double v) {
        this.balance = v;
    }

//-------- business logic ---------------------------

    public void deposit(Double amount){
        balance += amount;
    }

    public Double withdraw(Double amount){
        if(balance >= amount){ balance -= amount;}
        return balance;
    }

    public void transfer(Account transferTo, Double amount){
        if(this.balance >= amount) {
            this.balance -= amount;
            transferTo.balance += amount;
        }
    }


    public Double balance(){
        return this.balance;
    }

    public boolean closeAccount() {

        if(balance > 0){
            return false;
        }
        return true;
    }

// ---------- setters and getters -------------------------------------

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {

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
}
