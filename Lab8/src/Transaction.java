import java.util.Date;

public class Transaction {
    
    private Date dataCreated;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description) {
        dataCreated = new Date();
        this.setType(type);
        this.setAmount(amount);
        this.setBalance(balance);
        this.setDescription(description);
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    // public void setDataCreated(Date dataCreated) {
    //     this.dataCreated = dataCreated;
    // }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
