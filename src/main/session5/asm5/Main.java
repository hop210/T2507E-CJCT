package main.session5.asm5;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingAccount("SA001", 10_000_000);
        BankAccount acc2 = new CheckingAccount("CA001", 1_000_000);
        BankAccount acc3 = new VipAccount("VIP001", 20_000_000);

        acc1.withdraw(5_000_000);
        acc1.printBalance();

        acc2.withdraw(6_000_000);
        acc2.printBalance();

        acc3.deposit(5_000_000);
        acc3.withdraw(3_000_000);
        acc3.printBalance();
    }
}
