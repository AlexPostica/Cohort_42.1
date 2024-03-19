package lesson27.homework27;

public class ElectronicWallet implements PaymentSystem {

    private double money;

    public ElectronicWallet(double money) {
        this.money = money;
    }

    @Override
    public void transferMoney(double debit, double credit, PaymentSystem wallet) {
        if (debit > 0) {
            money -= debit;
            wallet.depositMoney(debit);
        } else if (credit > 0) {
            money += credit;
            wallet.withdrawMoney(credit);
        }
    }

    @Override
    public void depositMoney(double money) {
        this.money += money;
    }


    @Override
    public void withdrawMoney(double money) {
        this.money -= money;
    }

    @Override
    public double checkBalance() {
        return money;
    }
}
