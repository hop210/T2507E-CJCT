package main.thiptest;

public class Product {
    private int id;
    private String name;
    private String thumbnail;
    private double price;
    private int qty;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String thumbnail, double price, int qty, String description) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void displayInfo() {
        System.out.println("\n--- THÔNG TIN SẢN PHẨM ---");
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giá: $" + price);
        System.out.println("Số lượng trong kho: " + qty);
        System.out.println("Mô tả: " + description);
    }


    public boolean checkAvailability(int orderQty) {
        return orderQty > 0 && orderQty <= this.qty;
    }

    public double placeOrder(int orderQty) {
        if (checkAvailability(orderQty)) {
            this.qty -= orderQty;
            double total = orderQty * this.price;
            System.out.println("Đặt hàng thành công!");
            return total;
        } else {
            System.out.println("Đặt hàng thất bại: Không đủ số lượng hoặc số lượng không hợp lệ!");
            return 0;
        }
    }
}
