package main.session3.ASM2;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private double soDu;

    public TaiKhoan() {}

    public TaiKhoan(String soTaiKhoan, String tenChuTK, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    // Getter & Setter
    public String getSoTaiKhoan() { return soTaiKhoan; }
    public void setSoTaiKhoan(String soTaiKhoan) { this.soTaiKhoan = soTaiKhoan; }

    public String getTenChuTK() { return tenChuTK; }
    public void setTenChuTK(String tenChuTK) { this.tenChuTK = tenChuTK; }

    public double getSoDu() { return soDu; }

    // Nạp tiền
    public void napTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("❌ Số tiền nạp phải > 0");
            return;
        }
        soDu += soTien;
        System.out.println("✅ Nạp tiền thành công");
    }

    // Rút tiền
    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("❌ Số tiền rút phải > 0");
            return;
        }
        if (soTien > soDu) {
            System.out.println("❌ Số dư không đủ");
            return;
        }
        soDu -= soTien;
        System.out.println("✅ Rút tiền thành công");
    }

    public void hienThiSoDu() {
        System.out.println("Số dư hiện tại: " + soDu);
    }
}
