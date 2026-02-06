package main.asm7;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Developer("D01", "An", 15_000_000, 10),
                new Tester("T01", "Binh", 12_000_000, 20),
                new Manager("M01", "Cuong", 20_000_000, 5),
                new Developer("D02", "Dung", 14_000_000, 5)
        };

        double totalSalary = 0;
        double totalBonus = 0;

        for (Employee e : employees) {
            System.out.println("---------------");
            e.showInfo();
            totalSalary += e.calculateSalary();

            if (e instanceof BonusEligible) {
                double bonus = ((BonusEligible) e).calculateBonus();
                totalBonus += bonus;
                System.out.println("Bonus: " + bonus);
            }
        }

        System.out.println("===============");
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total bonus: " + totalBonus);
    }
}
