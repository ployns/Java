
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account2 account_01= new Account2("ploy", 112, 1109, 1.65);

        account_01.deposit(30);
        account_01.deposit(40);
        account_01.deposit(50);
        account_01.withdraw(5);
        account_01.withdraw(4);
        account_01.withdraw(2);

        System.out.println(account_01.toString());
        account_01.transactionToString();


    }

}
