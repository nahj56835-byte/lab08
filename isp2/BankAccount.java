package isp2;

public class BankAccount implements Account, Withdrawable {

    protected double balance;

    @Override
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException();
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException();
        if (amount > balance) throw new IllegalArgumentException("Not enough money");
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
