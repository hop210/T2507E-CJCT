package main.session4.ASM3;
import java.util.ArrayList;

public class ProductManager {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new ElectronicProduct("E01", "Laptop Dell", 15000000, 24));
        products.add(new FoodProduct("F01", "Milk", 30000, 2));
        products.add(new ClothingProduct("C01", "T-Shirt", 200000, "M"));

        for (Product p : products) {
            System.out.println(p.getInfo());
            System.out.println("Discounted Price: " + p.calculateDiscountedPrice());
            System.out.println("----------------------------");
        }
    }
}
