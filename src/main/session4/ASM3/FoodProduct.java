package main.session4.ASM3;

public class FoodProduct extends Product{
    private int expiryDays;

    public FoodProduct(String productId, String name, double price, int expiryDays) {
        super(productId, name, price);
        this.expiryDays = expiryDays;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Expiry in: " + expiryDays + " days";
    }

    @Override
    public double calculateDiscountedPrice() {
        if (expiryDays <= 3) {
            return getPrice() * 0.7;
        } else if (expiryDays <= 7) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}
