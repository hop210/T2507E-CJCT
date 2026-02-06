package main.asm7;

public class Manager extends Employee implements BonusEligible{
    private int teamSize;

    public Manager(String id, String name, double baseSalary, int teamSize) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + teamSize * 1_000_000;
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.3;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }
}
