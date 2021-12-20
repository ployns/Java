public class CheckingAccount extends Account {
    
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        setOverdraftLimit(10);
    }
    
    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.setOverdraftLimit(overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double withdraw) {
        if (getBalance() - withdraw >= overdraftLimit) {
            setBalance(getBalance() - withdraw);
        }else{
            System.out.println(getClassName()+" Error :: withdraw exceeds overdraft limit");
        }
    }
    
    public String toString() {
        return super.toString() + "\nOverdraft Limit : $"+String.format("%.2f", overdraftLimit);
    }
}
