package main.session5.asm4.bai3;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Lion("Simba"),
                new Elephant("Dumbo"),
                new Monkey("George")
        };

        for (Animal a : animals) {
            a.eat();
        }
    }
}
