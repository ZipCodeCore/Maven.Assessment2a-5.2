package rocks.zipcode.assessment2.atm;

import java.util.List;
import java.util.Random;

public class Account {

    private Long accountNumber;
    private Double userPin;
    public Double balance;
    private int status;
    private int overdraft;
    //private AccountHistory accountHistory;
    public String accountType;

//----------- constructor -------------------------------

    public Account(Double userPin){

        setAccountNumber();
        //this.accountHistory = new AccountHistory();
        this.userPin = userPin;
        this.balance = userPin;
        this.status = 0;
        this.overdraft = 0;

    }

//-------- business logic ---------------------------


    public void deposit(Double amount){
        this.balance += amount;
        //accountHistory.recordHistoryDeposit(amount);
    }

    public double withdraw(Double amount){
        if(checkBalance(amount)) {
            return balance -= amount;

        } else
            return 0;
    }

    public String transfer(Account transferTo, Double amount){
        if(checkBalance(amount)){
            this.balance = this.balance - amount;
            transferTo.balance += amount;
            //accountHistory.recordHistoryOutgoingTransfer(amount, transferTo.accountNumber);
            //transferTo.accountHistory.recordHistoryIncomingTransfer(amount, this.accountNumber);
            return null;
        }else
            return "Insufficient funds";
    }

    public boolean closeAccount(){
        return userPin == 0.0;
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

   public Double balance() {
        return balance;
    }

    /*
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


    public String getHistoryAll(){
        //return toString(accountHistory.getAllTransactions());
    }

    public String getHistoryDeposit(){
        //return toString(accountHistory.getDeposits());
    }

    public String getHistoryWithdraw(){
        //return toString(accountHistory.getWithdrawals());
    }

    public String getHistoryTransfer(){
        //return toString(accountHistory.getAllTransactions());
    }*/


    public String toString(List<String> list){

        return "Account: " + this.getAccountNumber() + "\n" + list.toString().replace(", ", "\n")
                .replace("[", "").replace("]", "\n");
    }

}