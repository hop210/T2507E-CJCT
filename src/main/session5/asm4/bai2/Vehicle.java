package main.session5.asm4.bai2;

public class Vehicle {
    private String name;
    private int maxSpeed;

    public Vehicle() {
    }

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }
}
