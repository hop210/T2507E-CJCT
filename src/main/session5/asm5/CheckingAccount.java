package main.session5.asm5;

public class CheckingAccount extends BankAccount{
    private static final double OVERDRAFT_LIMIT = -5_000_000;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= OVERDRAFT_LIMIT) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Vượt hạn mức rút âm");
        }
    }
}
