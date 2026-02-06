package main.asm7;

public abstract class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public abstract String getPosition();

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + getPosition());
        System.out.println("Salary: " + calculateSalary());
    }
}
