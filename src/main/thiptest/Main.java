package main.thiptest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product prod = new Product();


        System.out.println("=== NHẬP THÔNG TIN SẢN PHẨM MỚI ===");
        System.out.print("Nhập ID: ");
        prod.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        prod.setName(sc.nextLine());

        System.out.print("Nhập đường dẫn ảnh (thumbnail): ");
        prod.setThumbnail(sc.nextLine());

        double price;
        do {
            System.out.print("Nhập giá bán (phải lớn hơn 0): ");
            price = sc.nextDouble();
            if (price <= 0) {
                System.out.println(" Lỗi: Giá bán phải lớn hơn 0. Vui lòng nhập lại!");
            }
        } while (price <= 0);
        prod.setPrice(price);

        int qty;
        do {
            System.out.print("Nhập số lượng kho (phải từ 0 trở lên): ");
            qty = sc.nextInt();
            if (qty < 0) {
                System.out.println(" Lỗi: Số lượng kho không được âm. Vui lòng nhập lại!");
            }
        } while (qty < 0);
        prod.setQty(qty);
        sc.nextLine();

        System.out.print("Nhập mô tả sản phẩm: ");
        prod.setDescription(sc.nextLine());

        prod.displayInfo();

        System.out.print("\nNhập số lượng bạn muốn mua: ");
        int orderAmount = sc.nextInt();

        if (prod.checkAvailability(orderAmount)) {
            double totalBill = prod.placeOrder(orderAmount);
            System.out.println("Tổng tiền hóa đơn: $" + totalBill);
            System.out.println("Số lượng còn lại trong kho: " + prod.getQty());
        } else {
            System.out.println("Rất tiếc, số lượng mua không hợp lệ (phải lớn hơn 0) hoặc kho không đủ hàng!");
        }

        sc.close();
    }
}
