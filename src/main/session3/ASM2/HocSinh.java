package main.session3.ASM2;

public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(String hoTen, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    // Ràng buộc điểm 0-10
    public void setDiemToan(double diem) {
        if (diem >= 0 && diem <= 10) this.diemToan = diem;
    }

    public void setDiemVan(double diem) {
        if (diem >= 0 && diem <= 10) this.diemVan = diem;
    }

    public void setDiemAnh(double diem) {
        if (diem >= 0 && diem <= 10) this.diemAnh = diem;
    }

    public double tinhDiemTB() {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    public String xepLoai() {
        double dtb = tinhDiemTB();
        if (dtb >= 8) return "Giỏi";
        if (dtb >= 6.5) return "Khá";
        if (dtb >= 5) return "Trung bình";
        return "Yếu";
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm TB: " + tinhDiemTB());
        System.out.println("Xếp loại: " + xepLoai());
    }
}
