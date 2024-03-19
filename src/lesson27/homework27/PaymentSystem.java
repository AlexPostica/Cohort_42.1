package lesson27.homework27;

public interface PaymentSystem {

    void transferMoney(double debit, double credit, PaymentSystem system);
    void depositMoney(double money);
    void withdrawMoney(double money);
    double checkBalance();
}
