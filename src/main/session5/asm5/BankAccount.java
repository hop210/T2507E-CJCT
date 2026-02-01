package main.session5.asm5;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected  double getBalance() {
        return balance;
    }

    protected  void setBalance(double balance) {
        this.balance = balance;
    }

    // Gửi tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void printBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: " + balance);
    }
}
