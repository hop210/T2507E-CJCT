package main.session5.asm4.bai2;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("Toyota", 180),
                new Bike("Yamaha", 120),
                new Train("Metro", 300),
                new Plane("Boeing", 900)
        };

        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
