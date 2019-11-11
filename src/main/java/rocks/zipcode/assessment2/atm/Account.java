/**package rocks.zipcode.assessment2.atm;
//import CR-MacroLabs-OPP-ATM[project-2-atm];

import org.junit.*;

public class Account {

    double interest;
    double balance;
    double money;
    String Transaction;
    String account;



    
    public Account(double interest, double balance) {
        Account account = new Account(0, 0);
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        if(balance() == 0) {
            //account.remove(account); }
       // else {
            if(balance() > 0) {
          System.out.println("** Can not delete account - Balance must be zero **"); }
    }
 }

    public void deposit(double v) {
       /* String transactionType = "Deposit";
        accountTo.modifyBalance(money);
        Transaction transaction = new Transaction(money, accountTo, transactionType);
        transactions.add(transaction); }


    public Double withdraw(double v) {
        String transactionType = "Withdraw";
        if (balance - money <= 0) {
            System.out.println("** Insufficient Funds **");
        } else {
            withdrawal = money - balance;
            balance = balance - withdrawn(money);
        }
        return withdrawal;
    }


    public void transfer(Account b, double v) {
            if(balance() - money > 0) {
                this.withdrawFunds(money, accountFrom);
                this.depositFunds(money, accountTo);
                Transaction transaction = new Transaction(money, accountFrom, accountTo);
                transactions.add(transaction); }

            else {
                System.out.println("** Unable to process transaction **"); }
        }
 }
 */



