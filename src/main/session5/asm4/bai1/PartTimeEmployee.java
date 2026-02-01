package main.session5.asm4.bai1;

public class PartTimeEmployee extends Employee{
    private int hours;
    private double salaryPerHour;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String name, int hours, double salaryPerHour) {
        super(id, name);
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    public PartTimeEmployee(int hours, double salaryPerHour) {
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double getSalary() {
        return hours * salaryPerHour;
    }
}
