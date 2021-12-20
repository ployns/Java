public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account_01 = new Account(112, 11244, 4.5);
        SavingAccount savingsAccount_01 = new SavingAccount(235, 4309, 4.5);
        CheckingAccount checkingAccount_01 = new CheckingAccount(309, 2091, 4.5, 100);

        account_01.deposit(20);

        Account[] listAccounts = {account_01,savingsAccount_01,checkingAccount_01};

        for (Account account : listAccounts) {
            System.out.println(account.toString());
        }

        // System.out.println(account_01.toString());
    }
    
}
