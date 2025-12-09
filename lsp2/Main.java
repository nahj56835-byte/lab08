package lsp2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account a1 = new BankAccount();
        Account a2 = new FixedTermAccount();

        a1.deposit(1000);
        a2.deposit(500);

        List<Account> accounts = List.of(a1, a2);

        System.out.println("Balances:");
        for (Account acc : accounts) {
            System.out.println(acc.getBalance());
        }

        
        if (a1 instanceof Withdrawable w) {
            w.withdraw(200);
            System.out.println("a1 after withdraw: " + a1.getBalance());
        }

        
    }
}
