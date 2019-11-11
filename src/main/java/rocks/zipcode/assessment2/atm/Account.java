package rocks.zipcode.assessment2.atm;

public class Account {

    private Integer accountNumber;
    private Double accountBalance = 0.00;

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********
    double v;

    
    public Account(double v) {
        this.accountBalance = v;

    }

    public double balance() {
        return accountBalance;
    }

    public boolean closeAccount() {
        withdraw(accountBalance);

        if(accountBalance == 0.0){
            return true;
        }
        return false;
    }

    public void deposit(double v) {
       accountBalance+=v;
    }

    public Double withdraw(double v) {

        if(v > accountBalance){
            System.out.println("nope");
            return 0.0;
        }

        return accountBalance-=v;
    }

    public void transfer(Account b, double v) throws IllegalArgumentException {

        try{
            Double sourceAccount = accountBalance = withdraw(v);
            b.deposit(v);
        }
        catch(IllegalArgumentException e) {
           throw new IllegalArgumentException("na fam.. u broke");
        }

    }
}
