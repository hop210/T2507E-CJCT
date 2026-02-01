package main.session5.asm4.bai2;

public class Train extends Vehicle{
    public Train(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Train is running");
    }
}
