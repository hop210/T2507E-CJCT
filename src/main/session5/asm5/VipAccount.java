package main.session5.asm5;

public class VipAccount extends BankAccount{
    public VipAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount * 1.01);
        }
    }

}
