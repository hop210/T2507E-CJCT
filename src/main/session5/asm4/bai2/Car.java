package main.session5.asm4.bai2;

public class Car extends Vehicle{
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}
