package main.session5.asm4.bai2;

public class Plane extends Vehicle{
    public Plane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Plane is flying");
    }
}
