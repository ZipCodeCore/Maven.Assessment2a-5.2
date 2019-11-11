package rocks.zipcode.assessment2.atm;

public class Account {

    private Double accountBalance = 0.00;

    public Account(){
        this.accountBalance = 0.0;
    }

    public Account(Double balance){
        this.accountBalance = balance;
    }

    public Double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    
    public Account(double v) {
        this.accountBalance = v;

    }

    public double balance() {
        return accountBalance;
    }

    public boolean closeAccount() {
        if (accountBalance == 0 ){
            return true;
        }
        return false;
    }

    public void deposit(double v) {
        accountBalance = accountBalance + v;
    }

    public Double withdraw(double v) {
    if (accountBalance != 0){
        accountBalance -= v;
         }
     return accountBalance;
    }

    public void transfer(Account b,  double v) {
        Account a = new Account();
        if (b.accountBalance != 0 && v <= accountBalance ){
            b.withdraw(v);
            a.deposit(v);
        }
    }
}
