
public class SavingAccount extends Account {
    
    public SavingAccount() {
        super();
    }

    public SavingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public void withdraw(double withdraw) {
        if (getBalance() >= withdraw) {
            setBalance(getBalance() - withdraw);
        } else {
            System.out.println(getClassName() + "Error :: account overdrawn transtaction rejected");
        }
    }
}

