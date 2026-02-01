package main.session5.asm4.bai1;

public class FullTimeEmployee extends Employee{
    private double fixedSalary;

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public FullTimeEmployee() {
    }
    public FullTimeEmployee(String name, String id, double fixedSalary) {
        super(name, id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getSalary() {
        return fixedSalary;
    }
}
