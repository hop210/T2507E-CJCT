package main.session5.asm4.bai1;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("An", "E01", 15000000);
        Employee e2 = new PartTimeEmployee("Bình", "E02", 80, 50000);

        System.out.println(e1.name + " Salary: " + e1.getSalary());
        System.out.println(e2.name + " Salary: " + e2.getSalary());
    }
}
