package main.session4.ASM3;

public class Product {
    private String productId;
    private String name ;
    private double price ;

    public Product() {
    }

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Ghi đè ở lớp con
    public String getInfo() {
        return "ID: " + productId + ", Name: " + name + ", Price: " + price;
    }

    public double calculateDiscountedPrice() {
        return price;
    }
}
