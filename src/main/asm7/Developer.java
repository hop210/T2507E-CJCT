package main.asm7;

public class Developer extends Employee implements BonusEligible{
    private int overtimeHours;

    public Developer(String id, String name, double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimeHours * 50_000;
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.2;
    }

    @Override
    public String getPosition() {
        return "Developer";
    }
}
