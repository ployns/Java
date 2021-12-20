import java.util.Scanner;
public class Lab01 {
        public static void main(String[] args) {
        double i,j,k;
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        System.out.println("Balance: $" + account.getBalance());
        //withdraw
        Scanner inputi = new Scanner(System.in);
        System.out.print("How much do you want: ");
        i = inputi.nextDouble();
        if(account.getBalance()>i&&i>=0)
        {
            account.withdraw(i);
            System.out.println("Balance: "+account.getBalance());
            System.out.println("InterestRate: "+account.getAnnualInterestRate()+" %");
            System.out.println("Monthly Interest: " + account.getMonthlyInterest());
            System.out.println("Date Created: " + account.getDateCreated());
        }
        else
        {
            System.out.println("Have no enough money");    
        }
        
        //deposit
        Scanner inputj = new Scanner(System.in);
        System.out.print("Add money:");
        j = inputj.nextDouble();
        if(j>=0){
        account.deposit(j);
        System.out.println("Balance: "+account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
        }
        else{
            System.out.println("Error");
        }
    }
    
}

 class Account {
    private int id =0;
    private double balance=0.0;
    private static double annualInterestRate =0.0;
    private java.util.Date dateCreated;
    
    Account(){
        dateCreated = new java.util.Date();
    }
    Account(int id,double balance){
        this();
        this.id = id;
        this.balance = balance;
    }
    public int getId()
    {
        return this.id;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public String getDateCreated() 
    {
        return this.dateCreated.toString();
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest()
    {
        return balance *getMonthlyInterestRate();
    }
     public void withdraw(double amount) 
     {
        this.balance -= amount;
    }   

    public void deposit(double amount) 
    {
        this.balance += amount;
    }

}