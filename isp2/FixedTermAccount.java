package isp2;

public class FixedTermAccount implements Account {

    protected double balance;

    @Override
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException();
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Không có withdraw() → Client không thể gọi nhầm
}
