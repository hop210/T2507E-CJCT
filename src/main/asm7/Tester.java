package main.asm7;

public class Tester extends Employee{
    private int bugsFound;

    public Tester(String id, String name, double baseSalary, int bugsFound) {
        super(id, name, baseSalary);
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bugsFound * 30_000;
    }

    @Override
    public String getPosition() {
        return "Tester";
    }
}
