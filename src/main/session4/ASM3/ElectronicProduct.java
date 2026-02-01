package main.session4.ASM3;

public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String productId, String name, double price, int warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Warranty: " + warrantyMonths + " months";
    }

    @Override
    public double calculateDiscountedPrice() {
        if (getPrice() > 10_000_000) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}
