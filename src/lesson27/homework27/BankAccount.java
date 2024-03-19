package lesson27.homework27;

public class BankAccount implements PaymentSystem{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double debit, double credit, PaymentSystem system) {
        if (debit> 0) {
            balance -= debit;
            system.depositMoney(debit);
        }else if (credit > 0) {
            balance += credit;
            system.withdrawMoney(credit);
        }
    }

    @Override
    public void depositMoney(double money) {
        balance += money;
    }

    @Override
    public void withdrawMoney(double money) {
        balance -= money;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
