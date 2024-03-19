 package lesson27.homework27;
/**
 * AIT-TR, cohort 42.1, Java Basic, hw #27
 * @author Alexandru Postica
 * @version 15.Mar
 */
public class HomeWork27 {
    public static void main(String[] args) {

        // Task #1
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);
        ElectronicWallet wallet = new ElectronicWallet(100);

        wallet.transferMoney(100, 0, account1);
        wallet.transferMoney(0, 20, account2);
        System.out.println("Wallet: " + wallet.checkBalance());

        account1.transferMoney(100, 0,account2);
        System.out.println("1#:" + account1.checkBalance() + " 2#:" + account2.checkBalance());

        account1.transferMoney(0, 150, account2);
        System.out.println("1#:" + account1.checkBalance() + " 2#:" + account2.checkBalance());

        // Task #2
        Triathlete triathlete = new Triathlete();
        triathlete.run();
        triathlete.swimm();
    }
}
