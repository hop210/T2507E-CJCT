package main.session5.asm5;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double fee = amount * 0.02;
        double total = amount + fee;

        if (total <= getBalance()) {
            setBalance(getBalance() - total);
        } else {
            System.out.println("Không đủ số dư (đã tính phí)");
        }
    }
}
